package com.witortena.biblioteca.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.witortena.biblioteca.model.Autor;

@Controller
@RequestMapping("/autores")
public class AutorController {

    @GetMapping
    public String inicio() {
        return "autores/inicio";
    }

    @GetMapping("/autor")
    public String exibirautor(Model model) {
        Autor autor = new Autor();
        autor.setNome("Sergey Strugatsky");
        autor.setNacionalidade("Russia");
        ArrayList<String> obras = new ArrayList<>();
        obras.add("RoadSide Picnic");
        autor.setObrasPublicadas(obras);

        model.addAttribute("autor", autor);

        return "autor";
    }
}
