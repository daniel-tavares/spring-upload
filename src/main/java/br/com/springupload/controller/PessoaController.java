package br.com.springupload.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.springupload.model.Arquivo;
import br.com.springupload.model.Pessoa;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {

	private static String UPLOAD_LOCATION="/home/danieltavares/temp/";
	
	@RequestMapping(value = { "/", "/inicio" }, method = RequestMethod.GET)
	public String getHomePage() {
		return "inicio";
	}
	
	@RequestMapping(value = "/fotoPerfil", method = RequestMethod.GET)
	public String getSingleUploadPage(ModelMap model) {
		Pessoa pessoa = new Pessoa();
		model.addAttribute("pessoa", pessoa);
		return "upload";
	}
	
	@RequestMapping(value = "/fotoPerfil", method = RequestMethod.POST)
	public String singleFileUpload(Pessoa pessoa,BindingResult result, ModelMap model) throws IOException {
 		FileCopyUtils.copy(pessoa.getFotoPerfil().getArquivo().getBytes(), new File( UPLOAD_LOCATION + pessoa.getFotoPerfil().getArquivo().getOriginalFilename()));
		model.addAttribute("nomeArquivo", pessoa.getFotoPerfil().getArquivo().getOriginalFilename());
   	    return "sucesso_perfil";
	}
	
	@RequestMapping(value = "/documentos", method = RequestMethod.GET)
	public String getMultiUploadPage(ModelMap model) {
		Pessoa pessoa = new Pessoa();
		model.addAttribute("pessoa", pessoa);
		return "documentos";
	}

	@RequestMapping(value = "/documentos", method = RequestMethod.POST)
	public String multiFileUpload(Pessoa pessoa, BindingResult result, ModelMap model) throws IOException {
			List<String> nomesArquivos = new ArrayList<String>();
			for (Arquivo documento : pessoa.getDocumentos()) {
				FileCopyUtils.copy(documento.getArquivo().getBytes(), new File(UPLOAD_LOCATION + documento.getArquivo().getOriginalFilename()));
				nomesArquivos.add(documento.getArquivo().getOriginalFilename());
			}

			model.addAttribute("nomesArquivos", nomesArquivos);
			return "sucesso_documento";
		}
	
	
}
