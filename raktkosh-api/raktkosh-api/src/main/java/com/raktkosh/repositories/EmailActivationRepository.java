package com.raktkosh.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raktkosh.pojos.EmailActivationCodes;

@Repository
public interface EmailActivationRepository extends JpaRepository<EmailActivationCodes, Long> {
  Optional<EmailActivationCodes> findByCode(String code);
}
