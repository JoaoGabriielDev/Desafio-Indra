package com.selecao.demo.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "id")
@Table(name = "telefone")
@Entity
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_telefone")
    private Long id;

    @Column(name = "numero")
    private String numero;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "cod_usuario")
    private Usuario usuario;

}
