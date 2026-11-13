package com.witortena.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class Autor {
    private String nome;
    private String nacionalidade;
    private ArrayList<String> obrasPublicadas;
}
