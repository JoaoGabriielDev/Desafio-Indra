package com.selecao.demo.models.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "distribuidora")
@EqualsAndHashCode(of = "id")
@Data
public class Distribuidora {

    @Id
    @Column(name = "cod_distribuidora")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "distribuidora")
    private String Distribuidora;

}
