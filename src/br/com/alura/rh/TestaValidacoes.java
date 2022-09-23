package br.com.alura.rh;

import br.com.alura.rh.model.*;
import br.com.alura.rh.model.validacoes.Validacao;
import br.com.alura.rh.model.validacoes.ValidacaoMeses;
import br.com.alura.rh.model.validacoes.ValidacaoPercentual;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestaValidacoes {

    public static void main(String[] args) {
        List<Validacao> validacaos = new ArrayList<>(Arrays.asList(new ValidacaoMeses(), new ValidacaoPercentual()));
        Salario salario = new Salario(new BigDecimal("100"), validacaos);
        Funcionario f = new Funcionario(new DadosPessoais("j", "1"), new Cargo(TipoCargo.ANALISTA), salario);
        BigDecimal aumento = new BigDecimal("30");
        salario.reajustarSalario(aumento);

        BigDecimal aumento2 = new BigDecimal("20");
        salario.reajustarSalario(aumento);
    }
}
