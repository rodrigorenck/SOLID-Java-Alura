package br.com.alura.rh.model;

public class Terceirizado {

    //utilizando composicao ao inves de heranca
    private DadosPessoais dadosPessoais;
    private String empresa;

    public Terceirizado(DadosPessoais dadosPessoais, String empresa) {
        this.dadosPessoais = dadosPessoais;
        this.empresa = empresa;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public String getEmpresa() {
        return empresa;
    }
}
