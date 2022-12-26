package com.selecao.demo.controllers;

import com.selecao.demo.models.entity.HistoricoPrecoCombustivel;
import com.selecao.demo.services.HistoricoPrecoCombustivelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/historicoPrecoCombustivel/")
public class HistoricoPrecoCombustivelController {

    @Autowired
    private HistoricoPrecoCombustivelService historicoPrecoCombustivelService;

    @GetMapping("listarHistorico")
    public ResponseEntity<List<HistoricoPrecoCombustivel>> listaHistorico(){
        List<HistoricoPrecoCombustivel> historico = historicoPrecoCombustivelService.listaHistorico();
        return new ResponseEntity<List<HistoricoPrecoCombustivel>>(historico, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public Optional<HistoricoPrecoCombustivel> buscarIdHistorico(@PathVariable Long id){
        return historicoPrecoCombustivelService.findById(id);
    }

    @PutMapping(value = "atualizar/{id}")
    public Optional<HistoricoPrecoCombustivel> atualizarHistorico
            (@PathVariable HistoricoPrecoCombustivel historicoPrecoCombustivel, @RequestBody Long id){
        return historicoPrecoCombustivelService.atualizarHistorico(historicoPrecoCombustivel, id);
    }

    @PostMapping("criar")
    public ResponseEntity<HistoricoPrecoCombustivel> criarHistorico
            (@RequestBody HistoricoPrecoCombustivel historicoPrecoCombustivel){
        return ResponseEntity.ok().body(historicoPrecoCombustivelService.criarHistorico(historicoPrecoCombustivel));
    }

    @DeleteMapping("detelar/{id}")
    public Optional<HistoricoPrecoCombustivel> deletarHistorico
            (@PathVariable HistoricoPrecoCombustivel historicoPrecoCombustivel, @RequestBody Long id){
        return historicoPrecoCombustivelService.deletarHistorico(historicoPrecoCombustivel, id);
    }
}
