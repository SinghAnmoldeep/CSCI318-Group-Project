package com.example.appointments.domain.entity;
import jakarta.persistence.*; import java.time.Instant;
@Entity @Table(name="appointments")
public class Appointment {
  @Id @GeneratedValue private Long id;
  private String patientId; private String clinicianId; private Instant startTime;
  @Enumerated(EnumType.STRING) private Status status = Status.CREATED;
  public enum Status { CREATED, CONFIRMED, CANCELLED }
  public Long getId(){return id;} public String getPatientId(){return patientId;}
  public void setPatientId(String v){this.patientId=v;} public String getClinicianId(){return clinicianId;}
  public void setClinicianId(String v){this.clinicianId=v;} public Instant getStartTime(){return startTime;}
  public void setStartTime(Instant v){this.startTime=v;} public Status getStatus(){return status;}
  public void setStatus(Status v){this.status=v;}
}
