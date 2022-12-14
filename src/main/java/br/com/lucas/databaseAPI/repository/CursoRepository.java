package br.com.lucas.databaseAPI.repository;

import br.com.lucas.databaseAPI.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
