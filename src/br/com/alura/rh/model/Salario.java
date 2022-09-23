package br.com.alura.rh.model;

import br.com.alura.rh.model.validacoes.Validacao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Salario {

    private BigDecimal valor;
    private LocalDate data = LocalDate.MIN;
    //padrao observer - ajuda no open closed principle
    //nos acoplamos a uma interface - o que eh bom!
    private List<Validacao> validacoes = new ArrayList<>();

    public Salario(BigDecimal valor){
        this.valor = valor;
    }

    public Salario(BigDecimal valor, List<Validacao> validacoes){
        this.valor = valor;
        this.validacoes = validacoes;
    }

    /**
     * Open Closed Principle e Dependency Inversion Principle
     * Classe esta aberta para extensao mas fechada para modificacao
     * Contudo estamos ferindo o Single Responsability, ja que esse metodo deveria ser uma service - porem se transformarmos em uma service quebraremos o encapsulamento
     * Nunca conseguiremos seguir todos os principios de boas praticas, devemos entao ver o que faz mais sentido para o projeto
     */
    public void reajustarSalario(BigDecimal aumento){
        //inversao de dependencia
        //O cliente que passa as validacoes, nesse caso simulamos o cliente no metodo main e passamos na mao
        // mas em um projeto real teríamos a vantagem da injeção de dependências automática, não precisando instanciar a nova classe
        validacoes.forEach(v -> v.validar(this, aumento));
        valor = valor.add(aumento);
        data = LocalDate.now();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }
}
