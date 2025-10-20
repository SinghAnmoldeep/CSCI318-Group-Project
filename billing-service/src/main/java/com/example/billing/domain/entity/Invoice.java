package com.example.billing.domain.entity;
import jakarta.persistence.*; import java.util.UUID;
@Entity @Table(name="invoices")
public class Invoice {
  @Id private String id = UUID.randomUUID().toString();
  private Long appointmentId; private double amount; private String status = "OPEN";
  public String getId(){return id;} public Long getAppointmentId(){return appointmentId;}
  public void setAppointmentId(Long v){appointmentId=v;} public double getAmount(){return amount;}
  public void setAmount(double v){amount=v;} public String getStatus(){return status;} public void setStatus(String v){status=v;}
}
