package com.example.billing.service;
import com.example.billing.domain.entity.*; import com.example.billing.domain.repo.*;
import com.example.billing.events.PaymentReceivedEvent;
import org.springframework.cloud.stream.function.StreamBridge; import org.springframework.stereotype.Service;

@Service
public class BillingService {
  private final InvoiceRepository invoices; private final PaymentRepository payments; private final StreamBridge out;
  public BillingService(InvoiceRepository i, PaymentRepository p, StreamBridge s){ this.invoices=i; this.payments=p; this.out=s; }
  public Invoice createInvoice(Invoice i){ return invoices.save(i); }
  public Payment recordPayment(Payment p){
    var saved = payments.save(p);
    out.send("paymentReceived-out-0", new PaymentReceivedEvent(saved.getInvoiceId(), saved.getAmount()));
    return saved;
  }
}
