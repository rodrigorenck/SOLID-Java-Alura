package br.com.alura.rh;

import br.com.alura.rh.model.*;
import br.com.alura.rh.model.validacoes.Validacao;
import br.com.alura.rh.model.validacoes.ValidacaoMeses;
import br.com.alura.rh.model.validacoes.ValidacaoPercentual;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestaPromover {

    public static void main(String[] args) {
        List<Validacao> validacaos = new ArrayList<>(Arrays.asList(new ValidacaoMeses(), new ValidacaoPercentual()));
        Salario salario = new Salario(new BigDecimal("100"), validacaos);


        Cargo cargo = new Cargo(TipoCargo.ANALISTA);
        DadosPessoais dadosPessoais = new DadosPessoais("j", "1");
        Funcionario f = new Funcionario(dadosPessoais, cargo, salario);

        f.promover(true);
        f.promover(true);

        TipoCargo tipoCargo = f.getCargo().getTipoCargo();
        System.out.println(tipoCargo);

    }
}
