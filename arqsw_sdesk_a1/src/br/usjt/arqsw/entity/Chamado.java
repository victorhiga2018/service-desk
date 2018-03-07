package br.usjt.arqsw.entity;

import java.util.Date;

/**
 * 
 * @author 201513337 Victor Higa
 *
 */
public class Chamado {
	private static final long serialVersionUID = 1L;
	
	public static final String ABERTO = "aberto";
	public static final String FECHADO = "fechado";
	
	private int numero;
	private String nome;
	private Date dataAbertura;
	private Date dataFechamento;
	private String status;
	private Fila fila;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public Date getDataFechamento() {
		return dataFechamento;
	}
	public void setDataFechamento(Date dataFechamento) {
		this.dataFechamento = dataFechamento;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Chamado [numero=" + numero + ", nome=" + nome + ", dataAbertura=" + dataAbertura + ", dataFechamento="
				+ dataFechamento + ", status=" + status + ", fila=" + fila + "]";
	}
	public Fila getFila() {
		return fila;
	}
	public void setFila(Fila fila) {
		this.fila = fila;
	}
	
	
	
}
