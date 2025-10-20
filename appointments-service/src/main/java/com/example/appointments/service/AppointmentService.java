package com.example.appointments.service;
import com.example.appointments.domain.entity.Appointment;
import com.example.appointments.domain.repo.AppointmentRepository;
import com.example.appointments.events.*;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
  private final AppointmentRepository repo; private final StreamBridge out;
  public AppointmentService(AppointmentRepository r, StreamBridge s){ this.repo=r; this.out=s; }
  public Appointment create(Appointment a){
    var saved = repo.save(a);
    out.send("appointmentCreated-out-0", new AppointmentCreatedEvent(saved.getId(), saved.getStartTime()));
    return saved;
  }
  public Appointment confirm(Long id){
    var a = repo.findById(id).orElseThrow();
    a.setStatus(Appointment.Status.CONFIRMED);
    var saved = repo.save(a);
    out.send("appointmentStatusChanged-out-0", new AppointmentStatusChangedEvent(saved.getId(), "CONFIRMED"));
    return saved;
  }
}
