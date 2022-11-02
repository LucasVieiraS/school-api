package br.com.lucas.databaseAPI.resource;

import br.com.lucas.databaseAPI.model.Curso;
import br.com.lucas.databaseAPI.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("cursos")
public class CursoResource {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> listarTodosCursos() {
      
    }

}
