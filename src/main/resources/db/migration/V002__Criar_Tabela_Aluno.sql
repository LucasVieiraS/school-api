CREATE TABLE IF NOT EXISTS aluno (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nomealuno VARCHAR(150),
    cursoid BIGINT NOT NULL,
    PRIMARY KEY(id)
);

ALTER TABLE aluno
ADD CONSTRAINT FK_Aluno_Curso
FOREIGN KEY(cursoid)
REFERENCES curso(id);

INSERT INTO Aluno(nomealuno, cursoid)
VALUES  ("João", 1),
        ("Felipe", 2),
        ("Carlos", 3),
        ("Joana", 4),
        ("Maria", 5),
        ("Arthur", 6),
        ("João Erik", 2),
        ("Arthur", 5),
        ("Isabelli", 3),
        ("Arianny", 6),
        ("Cristian", 3),
        ("Lucas", 1),
        ("Bidu", 2),
        ("Marco", 1);

/* VISUALIZATION/TEST INSERTS
   SELECT nomealuno 'Nome Aluno', nomecurso 'Curso'
   FROM aluno
   JOIN curso ON curso.id = aluno.cursoid;
*/