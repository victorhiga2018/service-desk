package br.usjt.arqsw.service;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.arqsw.dao.FilaDAO;
import br.usjt.arqsw.entity.Fila;

public class FilaService {
	private FilaDAO dao;
	
	public FilaService() {
		dao = new FilaDAO();
		fila = new Fila();
	}
	public ArrayList<Fila> listarFilas() throws IOException{
		return dao.listarFilas();
	}
	public Fila carregar(Fila id, String nome) throws IOException{
	Fila fila = new Fila();
		return fila(id, nome) ;

	}
	}
