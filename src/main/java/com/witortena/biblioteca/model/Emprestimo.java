package com.witortena.biblioteca.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class Emprestimo {
    private String usuario;
    private String nomeUsuario;
    private LocalDateTime dataEmprestimo;
    private LocalDateTime dataDevolucao;
    private String livro;
    private String status;
}
