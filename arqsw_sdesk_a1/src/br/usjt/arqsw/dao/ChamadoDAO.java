package br.usjt.arqsw.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import br.usjt.arqsw.entity.Chamado;

public class ChamadoDAO {
	
	public int criarChamado(Chamado chamado) throws IOException{
		Date dataAbertura = new Date(chamado.getDataAbertura().getTime());
		
		return 0;
	}

	public ArrayList<Chamado> listarChamados() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
