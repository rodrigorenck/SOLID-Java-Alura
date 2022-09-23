package br.com.alura.rh;

import br.com.alura.rh.model.*;

import java.math.BigDecimal;

public class TesteRajuste {

    public static void main(String[] args) {
        Salario salario = new Salario(new BigDecimal("100"));
        Funcionario f = new Funcionario(new DadosPessoais("a", "1"), new Cargo(TipoCargo.ANALISTA), salario);

        salario.reajustarSalario(new BigDecimal("49"));
        System.out.println(f.getSalario());
    }
}
