package com.witortena.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.witortena.biblioteca.model.Usuario;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping
    public String inicio() {
        return "usuarios/inicio";
    }

    @GetMapping("/usuario")
    public String exibirusuario(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNome("João Silva");
        usuario.setIdade(21);
        usuario.setMatricula("251041043");

        model.addAttribute("usuario", usuario);

        return "usuario";
    }
}
