package com.selecao.demo.services;


import com.selecao.demo.models.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<Usuario> listaUsuario();

    Optional<Usuario> findById(Long id);

    Usuario criarUsuario(Usuario usuario);

    Optional<Usuario> deletarUsuario(Usuario usuario, Long id);

    Optional<Usuario> atualizarUsuario(Usuario usuario, Long id);
}
