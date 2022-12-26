package com.selecao.demo.services;

import com.selecao.demo.models.entity.HistoricoPrecoCombustivel;
import com.selecao.demo.repositorys.HistoricoPrecoCombustivelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistoricoPrecoCombustivelServiceImpl implements HistoricoPrecoCombustivelService {

    @Autowired
    private HistoricoPrecoCombustivelRepository repository;

    @Override
    public List<HistoricoPrecoCombustivel> listaHistorico() {
        return repository.findAll();
    }

    @Override
    public Optional<HistoricoPrecoCombustivel> findById(Long id){
        return repository.findById(id);
    }

    @Override
    public Optional<HistoricoPrecoCombustivel> atualizarHistorico (HistoricoPrecoCombustivel historicoPrecoCombustivel, Long id){
        Optional<HistoricoPrecoCombustivel> historicoAtualizar = findById(id);

        historicoAtualizar.get().setCombustivel(historicoPrecoCombustivel.getCombustivel());
        historicoAtualizar.get().setPreco(historicoPrecoCombustivel.getPreco());
        historicoAtualizar.get().setData(historicoPrecoCombustivel.getData());

        HistoricoPrecoCombustivel historicoPrecoCombustivelSaved = repository.save(historicoAtualizar.get());

        return Optional.of(historicoPrecoCombustivelSaved);
    }

    @Override
    public HistoricoPrecoCombustivel criarHistorico(HistoricoPrecoCombustivel historicoPrecoCombustivel) {
        return repository.save(historicoPrecoCombustivel);
    }

    @Override
    public Optional<HistoricoPrecoCombustivel> deletarHistorico(HistoricoPrecoCombustivel historicoPrecoCombustivel, Long id) {
        Optional<HistoricoPrecoCombustivel> historicoDeletar = findById(id);
        repository.delete(historicoDeletar.get());
        return historicoDeletar;

    }

}
