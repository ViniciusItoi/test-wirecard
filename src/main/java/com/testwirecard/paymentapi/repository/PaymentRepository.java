package com.testwirecard.paymentapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testwirecard.paymentapi.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
	Payment findById(long id);
}
