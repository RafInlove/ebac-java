package com.mod38.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mod38.demo.entity.Entidade;

@Repository
public interface EntidadeRepository extends JpaRepository<Entidade, Long> {
}
