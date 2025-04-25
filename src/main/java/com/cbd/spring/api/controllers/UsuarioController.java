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

    @PostMapping("/usuario")
    public Usuario saveUser(@RequestBody Usuario usuario){
        Usuario usuarioSalvo = usuarioRepository.save(usuario);
        return usuarioSalvo;
    }

    @GetMapping("/usuarios")
    public List<Usuario> getAll(){
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }

    @PutMapping("/usuario")
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        Usuario usuarioAtualizado = usuarioRepository.save(usuario);
        return usuarioAtualizado;
    }

    @DeleteMapping("/usuario/{id}")
    public String deleteUsuario(@PathVariable Long id){
        usuarioRepository.deleteById(id);
        return "Usuário removido com sucesso!";
    }

    @GetMapping("/usuario/{id}")
    public Usuario getUsuarioById(@PathVariable Long id){
        Usuario usuarioFiltrado = usuarioRepository.findById(id).get();
        return usuarioFiltrado;
    }

    @GetMapping("/usuarios/count")
    public String countUsuario(){
        Long contagemUsuarios = usuarioRepository.count();

        return "Há "+contagemUsuarios+" usuários salvos no banco de dados!";
    }
}
