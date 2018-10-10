package br.edu.up.jpa.repository;

import java.sql.Time;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.jpa.dominio.Shift;

public interface ShiftRepository extends JpaRepository<Shift, Time> {

}
