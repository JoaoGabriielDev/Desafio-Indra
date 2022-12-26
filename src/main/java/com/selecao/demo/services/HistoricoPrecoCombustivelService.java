package com.selecao.demo.services;

import com.selecao.demo.models.entity.HistoricoPrecoCombustivel;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface HistoricoPrecoCombustivelService {

    List<HistoricoPrecoCombustivel> listaHistorico();

    Optional<HistoricoPrecoCombustivel> findById(Long id);

    Optional<HistoricoPrecoCombustivel> atualizarHistorico
            (HistoricoPrecoCombustivel historicoPrecoCombustivel, Long id);

    HistoricoPrecoCombustivel criarHistorico(HistoricoPrecoCombustivel historicoPrecoCombustivel);

    Optional<HistoricoPrecoCombustivel> deletarHistorico
            (HistoricoPrecoCombustivel historicoPrecoCombustivel, Long id);
}
