package com.selecao.demo.models.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "HistoricoPrecoCombustivel")
@EqualsAndHashCode(of = "id")
@Data
public class HistoricoPrecoCombustivel implements Serializable {

    @Id
    @Column(name = "cod_combustivel")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "combustivel")
    private String combustivel;

    @Column(name = "data")
    private LocalDateTime data;

    @Column(name = "preco")
    private Double preco;

}
