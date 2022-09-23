//package br.com.alura.rh.service;
//
//import br.com.alura.rh.ValidacaoException;
//import br.com.alura.rh.model.Cargo;
//import br.com.alura.rh.model.TipoCargo;
//
//public class PromoverFuncionarioService {
//
//
//    public void promover(Cargo cargo, boolean metaBatida){
//        if(cargo.getTipoCargo() == TipoCargo.GERENTE){
//            throw new ValidacaoException("Gerentes nao podem ser promovidos");
//        }
//        if(!metaBatida){
//            throw new ValidacaoException("Meta nao foi batida");
//        }
//        TipoCargo cargoAtual = cargo.getTipoCargo();
//        TipoCargo novoCargo = cargo.getTipoCargo();
//    }
//}
