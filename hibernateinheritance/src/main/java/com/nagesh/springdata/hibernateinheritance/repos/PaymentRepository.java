package com.nagesh.springdata.hibernateinheritance.repos;

import org.springframework.data.repository.CrudRepository;

import com.nagesh.springdata.hibernateinheritance.entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
