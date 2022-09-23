package br.com.alura.rh.model.validacoes;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Salario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoMeses implements Validacao{

    @Override
    public void validar(Salario salario, BigDecimal aumento){
        LocalDate dataUltimoReajuste = salario.getData();
        LocalDate dataAtual = LocalDate.now();
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
        if(mesesDesdeUltimoReajuste<6){
            throw new ValidacaoException("Nao pode reajustar salario antes de 6 meses do ultimo reajuste");
        }
    }
}
