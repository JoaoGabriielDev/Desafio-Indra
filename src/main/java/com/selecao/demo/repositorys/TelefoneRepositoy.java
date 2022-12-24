package com.selecao.demo.repositorys;

import com.selecao.demo.models.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepositoy extends JpaRepository<Telefone, Long> {
}
