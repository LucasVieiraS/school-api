package br.com.lucas.databaseAPI.model;

import java.util.Objects;

public class Curso {

    private Long id;

    private String nomecurso;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return id.equals(curso.id) && nomecurso.equals(curso.nomecurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomecurso);
    }
}
