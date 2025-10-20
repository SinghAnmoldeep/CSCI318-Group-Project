package com.example.appointments.domain.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.appointments.domain.entity.Appointment;
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {}
