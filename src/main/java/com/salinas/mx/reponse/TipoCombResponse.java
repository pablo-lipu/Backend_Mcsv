package com.salinas.mx.reponse;

import java.util.ArrayList;
import java.util.List;

import com.salinas.mx.entities.TipoCombustible;

public class TipoCombResponse {

	List<TipoCombustible> listaTipoComb = new ArrayList<TipoCombustible>();

	public TipoCombResponse() {
	};

	public TipoCombResponse(List<TipoCombustible> listaTipoComb) {

		this.listaTipoComb = listaTipoComb;
	}

	public List<TipoCombustible> getListaTipoComb() {
		return listaTipoComb;
	}

	public void setListaTipoComb(List<TipoCombustible> listaTipoComb) {
		this.listaTipoComb = listaTipoComb;
	}

	@Override
	public String toString() {
		return "TipoCombResponse [listaTipoComb=" + listaTipoComb + "]\n";
	}

}
