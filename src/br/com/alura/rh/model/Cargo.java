package br.com.alura.rh.model;

import br.com.alura.rh.ValidacaoException;

public class Cargo {
    TipoCargo tipoCargo;

    public Cargo(TipoCargo tipoCargo){
        this.tipoCargo = tipoCargo;
    }

    public TipoCargo getTipoCargo() {
        return tipoCargo;
    }

    public void promover(boolean metaBatida) {
        if (tipoCargo == TipoCargo.GERENTE) {
            throw new ValidacaoException("Gerentes nao podem ser promovidos");
        }
        if (!metaBatida) {
            throw new ValidacaoException("Meta nao foi batida");
        }
        TipoCargo novoCargo = tipoCargo.getProximoCargo();
        tipoCargo = novoCargo;
    }
}
