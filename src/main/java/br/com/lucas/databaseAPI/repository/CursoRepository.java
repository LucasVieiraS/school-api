package br.com.lucas.databaseAPI.repository;

import br.com.lucas.databaseAPI.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
