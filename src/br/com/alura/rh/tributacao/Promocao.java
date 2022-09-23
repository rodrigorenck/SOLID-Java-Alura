package br.com.alura.rh.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements  ReajusteTributavel{
    @Override
    public BigDecimal valor() {
        return new BigDecimal("500");
    }

    @Override
    public LocalDate data() {
        return LocalDate.now();
    }

    @Override
    public BigDecimal valorImpostoDeRenda() {
        return valor().multiply(new BigDecimal("0.1"));
    }
}
