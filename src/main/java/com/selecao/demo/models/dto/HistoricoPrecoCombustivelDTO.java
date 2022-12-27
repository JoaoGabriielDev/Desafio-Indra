package com.selecao.demo.models.dto;

import lombok.Data;

import java.util.Date;


@Data
public class HistoricoPrecoCombustivelDTO {

    private String combustivel;
    private Double preco;
    private Date data;

}
