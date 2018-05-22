package br.univille.projdacs2018.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.univille.projdacs2018.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}