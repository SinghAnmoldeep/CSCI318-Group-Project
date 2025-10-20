package com.example.billing.web;
import com.example.billing.domain.entity.*; import com.example.billing.service.BillingService;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api")
public class BillingController {
  private final BillingService svc; public BillingController(BillingService s){this.svc=s;}
  @PostMapping("/invoices") public Invoice create(@RequestBody Invoice i){ return svc.createInvoice(i); }
  @PostMapping("/payments") public Payment pay(@RequestBody Payment p){ return svc.recordPayment(p); }
}
