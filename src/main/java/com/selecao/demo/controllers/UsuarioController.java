package com.selecao.demo.controllers;

import com.selecao.demo.models.entity.Usuario;
import com.selecao.demo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuario/")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "listarUsuario")
    public ResponseEntity<List<Usuario>> listaUsuario(){
        List<Usuario> usuario = usuarioService.listaUsuario();
        return new ResponseEntity<List<Usuario>>(usuario, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public Optional<Usuario> buscarIdUsuario(@PathVariable Long id){
        return usuarioService.findById(id);
    }

    @PostMapping("criar")
    public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.ok().body(usuarioService.criarUsuario(usuario));
    }

    @DeleteMapping("deletar/{id}")
    public Optional<Usuario> deletarUsuario(@PathVariable Usuario usuario, @RequestBody Long id){
        return usuarioService.deletarUsuario(usuario, id);
    }

    @PutMapping(value = "atualizar/{id}")
    public Optional<Usuario> atualizarUsuario(@PathVariable Usuario usuario, @RequestBody Long id){
        return usuarioService.atualizarUsuario(usuario, id);
    }

}
