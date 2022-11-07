package br.com.lucas.databaseAPI.resource;

import br.com.lucas.databaseAPI.model.Aluno;
import br.com.lucas.databaseAPI.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("alunos")
public class AlunoResource {

    @Autowired
    public AlunoRepository alunoRepository;

    @RequestMapping("/todos")
    public List<Aluno> listarTodosAlunos() {
        return alunoRepository.findAll();
    }
}
