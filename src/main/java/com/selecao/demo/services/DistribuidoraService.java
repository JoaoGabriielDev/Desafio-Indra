package com.selecao.demo.services;

import com.selecao.demo.models.entity.Distribuidora;

import java.util.List;
import java.util.Optional;

public interface DistribuidoraService {

    List<Distribuidora> listarDistribuidora();

    Optional<Distribuidora> findById(Long id);

    Distribuidora criarDistribuidora(Distribuidora distribuidora);

    Optional<Distribuidora> deletarDistribuidora(Distribuidora distribuidora, Long id);

    Optional<Distribuidora> atualizarDistribuidora(Distribuidora distribuidora, Long id);
}
