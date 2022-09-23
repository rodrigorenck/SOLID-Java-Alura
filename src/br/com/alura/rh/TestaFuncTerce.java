package br.com.alura.rh;

import br.com.alura.rh.model.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestaFuncTerce {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(new DadosPessoais("Joao", "123"), new Cargo(TipoCargo.ANALISTA),
                new Salario(new BigDecimal("1000")));

        Terceirizado terceirizado = new Terceirizado(new DadosPessoais("Marcelo", "1234567"), "DELL");

        System.out.println(funcionario.getDadosPessoais().getNome());
        System.out.println(funcionario.getDadosPessoais().getCpf());


        System.out.println();

        System.out.println(terceirizado.getDadosPessoais().getNome());
        System.out.println(terceirizado.getDadosPessoais().getCpf());

    }
}
