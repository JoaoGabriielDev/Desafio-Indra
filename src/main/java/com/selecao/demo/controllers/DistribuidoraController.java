package com.selecao.demo.controllers;

import com.selecao.demo.models.entity.Distribuidora;
import com.selecao.demo.services.DistribuidoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/distribuidora/")
public class DistribuidoraController {

    @Autowired
    private DistribuidoraService distribuidoraService;

    @GetMapping(value = "listar")
    public ResponseEntity<List<Distribuidora>> listarDistribuidora(){
        List<Distribuidora> distribuidora = distribuidoraService.listarDistribuidora();
        return new ResponseEntity<List<Distribuidora>>(distribuidora, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public Optional<Distribuidora> buscarIdDistribuidora(@PathVariable Long id){
        return distribuidoraService.findById(id);
    }

    @PostMapping("criar")
    public ResponseEntity<Object> criarDistribuidora(@RequestBody Distribuidora distribuidora){
        return ResponseEntity.ok().body(distribuidoraService.criarDistribuidora(distribuidora));
    }

    @DeleteMapping("deletar/{id}")
    public Optional<Distribuidora> deletarDistribuidora
            (@PathVariable Distribuidora distribuidora, @RequestBody Long id){
        return distribuidoraService.deletarDistribuidora(distribuidora, id);
    }

    @PutMapping("atualizar/{id}")
    public Optional<Distribuidora> atualizarDistribuidora
            (@PathVariable Distribuidora distribuidora, @RequestBody Long id){
        return distribuidoraService.atualizarDistribuidora(distribuidora, id);
    }

}
