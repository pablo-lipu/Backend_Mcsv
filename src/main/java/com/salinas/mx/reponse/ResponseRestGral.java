package com.salinas.mx.reponse;

import java.util.ArrayList;
import java.util.HashMap;

public class ResponseRestGral {

	private ArrayList<HashMap<String, String>> metadata = new ArrayList<>();

	public ResponseRestGral() {

	}

	public ResponseRestGral(ArrayList<HashMap<String, String>> metadata) {
		this.metadata = metadata;
	}

	public ArrayList<HashMap<String, String>> getMetadata() {
		return metadata;
	}

	public void setMetadata(String Respuesta, String codigo, String status) {

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("status", Respuesta);
		map.put("codigo", codigo);
		map.put("suceso", status);

		metadata.add(map);
	}

	@Override
	public String toString() {
		return "RespnseRestGral [metadata=" + metadata + "]";
	}
}
