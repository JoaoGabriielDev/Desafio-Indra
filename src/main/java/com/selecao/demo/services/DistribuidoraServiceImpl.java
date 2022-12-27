package com.selecao.demo.services;

import com.selecao.demo.models.entity.Distribuidora;
import com.selecao.demo.repositorys.DistribuidoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DistribuidoraServiceImpl implements DistribuidoraService{

    @Autowired
    private DistribuidoraRepository distribuidoraRepository;


    @Override
    public List<Distribuidora> listarDistribuidora(){
        return distribuidoraRepository.findAll();
    }

    @Override
    public Optional<Distribuidora> findById(Long id) {
        return distribuidoraRepository.findById(id);
    }

    @Override
    public Distribuidora criarDistribuidora(Distribuidora distribuidora) {
        return distribuidoraRepository.save(distribuidora);
    }

    @Override
    public Optional<Distribuidora> deletarDistribuidora(Distribuidora distribuidora, Long id) {
        Optional<Distribuidora> distribuidoraDeletar = findById(id);
        distribuidoraRepository.delete(distribuidoraDeletar.get());
        return distribuidoraDeletar;
    }

    @Override
    public Optional<Distribuidora> atualizarDistribuidora(Distribuidora distribuidora, Long id) {
        Optional<Distribuidora> distribuidoraAtualizar = findById(id);

        distribuidoraAtualizar.get().setDistribuidora(distribuidora.getDistribuidora());

        Distribuidora distribuidoraSaved = distribuidoraRepository.save(distribuidoraAtualizar.get());

        return Optional.of(distribuidoraSaved);
    }
}
