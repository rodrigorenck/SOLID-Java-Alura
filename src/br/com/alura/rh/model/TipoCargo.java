package br.com.alura.rh.model;

public enum TipoCargo {

	ASSISTENTE{
		@Override
		public TipoCargo getProximoCargo() {
			return ANALISTA;
		}
	},
	ANALISTA {
		@Override
		public TipoCargo getProximoCargo() {
			return ESPECIALISTA;
		}
	},
	ESPECIALISTA {
		@Override
		public TipoCargo getProximoCargo() {
			return GERENTE;
		}
	},
	GERENTE {
		@Override
		public TipoCargo getProximoCargo() {
			return GERENTE;
		}
	};

	public abstract TipoCargo getProximoCargo();
}
