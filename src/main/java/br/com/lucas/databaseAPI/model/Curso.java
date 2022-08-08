package br.com.lucas.databaseAPI.model;

import java.util.Objects;

public class Curso {

    private Long id;

    private String nomeCurso;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return id.equals(curso.id) && nomeCurso.equals(curso.nomeCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeCurso);
    }
}
