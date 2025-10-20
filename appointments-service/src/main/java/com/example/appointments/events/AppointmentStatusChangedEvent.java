package com.example.appointments.events;
public record AppointmentStatusChangedEvent(Long id, String newStatus) {}
