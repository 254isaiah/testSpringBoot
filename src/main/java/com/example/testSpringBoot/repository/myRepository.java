package com.example.testSpringBoot.repository;

import com.example.testSpringBoot.model.Legislator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface myRepository extends JpaRepository<Legislator, Long> {
    List<Legislator> findByLastname(String lastname);
    List<Legislator> findByGender(String gender);
}
