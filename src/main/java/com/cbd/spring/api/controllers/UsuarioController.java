package com.cbd.spring.api.controllers;

import com.cbd.spring.api.models.Usuario;
import com.cbd.spring.api.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/usuarios")
    public List<Usuario> getAll(){
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }

    @PostMapping("/usuario")
    public Usuario saveUser(@RequestBody Usuario usuario){
        Usuario usuarioSalvo = usuarioRepository.save(usuario);
        return usuarioSalvo;
    }
}
