package com.example.billing.domain.repo;
import com.example.billing.domain.entity.Invoice; import org.springframework.data.jpa.repository.JpaRepository;
public interface InvoiceRepository extends JpaRepository<Invoice, String> {}
