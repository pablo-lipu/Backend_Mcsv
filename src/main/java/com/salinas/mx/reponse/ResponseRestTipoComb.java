package com.salinas.mx.reponse;

public class ResponseRestTipoComb extends ResponseRestGral {
	
	TipoCombResponse TipoCombResponse = new TipoCombResponse();

	public ResponseRestTipoComb() {
		super();
	}

	public ResponseRestTipoComb(com.salinas.mx.reponse.TipoCombResponse tipoCombResponse) {
		super();
		TipoCombResponse = tipoCombResponse;
	}

	public TipoCombResponse getTipoCombResponse() {
		return TipoCombResponse;
	}

	public void setTipoCombResponse(TipoCombResponse tipoCombResponse) {
		TipoCombResponse = tipoCombResponse;
	}

	@Override
	public String toString() {
		return "ResponseRestTipoComb [TipoCombResponse=" + TipoCombResponse + "]";
	}

}
