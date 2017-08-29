package br.com.springupload.model;

import java.util.ArrayList;
import java.util.List;


public class Pessoa {

	Arquivo fotoPerfil;

	List<Arquivo> documentos = new ArrayList<Arquivo>();

	public Pessoa() {
		documentos.add(new Arquivo());
		documentos.add(new Arquivo());
		documentos.add(new Arquivo());
		documentos.add(new Arquivo());
	}

	public Arquivo getFotoPerfil() {
		return fotoPerfil;
	}

	public void setFotoPerfil(Arquivo fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}

	public List<Arquivo> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<Arquivo> documentos) {
		this.documentos = documentos;
	}

}
