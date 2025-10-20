package com.example.billing.events;
public record PaymentReceivedEvent(String invoiceId, double amount) {}
