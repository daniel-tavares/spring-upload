package br.com.springupload.model;

import org.springframework.web.multipart.MultipartFile;

public class Arquivo {
	MultipartFile arquivo;

	public MultipartFile getArquivo() {
		return arquivo;
	}

	public void setArquivo(MultipartFile arquivo) {
		this.arquivo = arquivo;
	}

}
