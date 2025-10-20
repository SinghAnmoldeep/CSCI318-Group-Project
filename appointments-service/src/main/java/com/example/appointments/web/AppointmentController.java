package com.example.appointments.web;
import com.example.appointments.domain.entity.Appointment;
import com.example.appointments.service.AppointmentService;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/appointments")
public class AppointmentController {
  private final AppointmentService svc;
  public AppointmentController(AppointmentService s){ this.svc=s; }
  @PostMapping public Appointment create(@RequestBody Appointment a){ return svc.create(a); }
  @PostMapping("/{id}/confirm") public Appointment confirm(@PathVariable Long id){ return svc.confirm(id); }
}
