package br.com.pub.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity

@DiscriminatorValue(value = "F")
public class Pessoa_Fisica extends Cliente{
	
	private String cpf;
	private int rg;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
}
