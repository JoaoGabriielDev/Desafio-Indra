package com.selecao.demo.models.dto;

import lombok.Data;

@Data
public class EnderecoDTO {

    private String rua;
    private String bairro;
    private String cep;
    private String cidade;
    private String complemento;
    private String estado;

}
