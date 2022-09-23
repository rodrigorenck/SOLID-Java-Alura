package br.com.alura.rh.model.validacoes;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Salario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentual implements Validacao {

    @Override
    public void validar(Salario salario, BigDecimal aumento){
        BigDecimal percentualReajuste = aumento.divide(salario.getValor(), RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
    }
}
