package com.selecao.demo.services;

import com.selecao.demo.models.entity.Usuario;
import com.selecao.demo.repositorys.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> listaUsuario(){
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> findById(Long id){
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario criarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> deletarUsuario(Usuario usuario, Long id){
        Optional<Usuario> usuarioDeletar = findById(id);
        usuarioRepository.delete(usuarioDeletar.get());
        return usuarioDeletar;
    }

    @Override
    public Optional<Usuario> atualizarUsuario(Usuario usuario, Long id){
        Optional<Usuario> usarioAtualizar = findById(id);

        usarioAtualizar.get().setNome(usuario.getNome());
        usarioAtualizar.get().setEmail(usuario.getEmail());
        usarioAtualizar.get().setCpf(usuario.getCpf());
        usarioAtualizar.get().setEndereco(usuario.getEndereco());
        usarioAtualizar.get().setTelefone(usuario.getTelefone());

        Usuario usuarioSaved = usuarioRepository.save(usarioAtualizar.get());

        return Optional.of(usuarioSaved);
    }
}
