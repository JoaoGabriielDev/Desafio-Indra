package com.selecao.demo.models.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "usuario")
@EqualsAndHashCode(of = "id")
@Data
public class Usuario implements Serializable {

    @Id
    @Column(name = "cod_usuario")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf")
    private Long cpf;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "usuario_endereco")
    private List<Endereco> endereco = new ArrayList<>();

    @OneToMany(mappedBy = "usuario")
    private List<Telefone> telefone = new ArrayList<>();

    public void adcEndereco(Endereco endereco) {
        endereco.setUsuario_endereco(this);
        this.endereco.add(endereco);
    }

    public void adcTelefone(Telefone telefone) {
        telefone.setUsuario(this);
        this.telefone.add(telefone);
    }

}

