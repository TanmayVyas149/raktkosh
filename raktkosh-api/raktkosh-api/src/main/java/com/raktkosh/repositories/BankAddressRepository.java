package com.raktkosh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raktkosh.pojos.BankAddress;

public interface BankAddressRepository extends JpaRepository<BankAddress, Long>{

	
}
