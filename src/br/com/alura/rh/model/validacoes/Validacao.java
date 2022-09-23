package br.com.alura.rh.model.validacoes;

import br.com.alura.rh.model.Salario;

import java.math.BigDecimal;

public interface Validacao {

    void validar(Salario salario, BigDecimal aumento);
}
