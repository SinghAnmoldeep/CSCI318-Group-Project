package com.example.appointments.events;
import java.time.Instant;
public record AppointmentCreatedEvent(Long id, Instant startTime) {}
