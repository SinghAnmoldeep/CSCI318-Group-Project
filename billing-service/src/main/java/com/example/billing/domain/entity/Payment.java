package com.example.billing.domain.entity;
import jakarta.persistence.*; import java.util.UUID;
@Entity @Table(name="payments")
public class Payment {
  @Id private String id = UUID.randomUUID().toString();
  private String invoiceId; private double amount; private String method = "CARD"; private String status = "RECEIVED";
  public String getId(){return id;} public String getInvoiceId(){return invoiceId;}
  public void setInvoiceId(String v){invoiceId=v;} public double getAmount(){return amount;} public void setAmount(double v){amount=v;}
  public String getMethod(){return method;} public void setMethod(String v){method=v;}
  public String getStatus(){return status;} public void setStatus(String v){status=v;}
}
