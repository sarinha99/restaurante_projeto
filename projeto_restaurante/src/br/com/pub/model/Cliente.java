package br.com.pub.model;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "C")

public class Cliente extends Pessoa{
	
	private LocalDate dt_cadastro;
	

	public LocalDate getDt_cadastro() {
		return dt_cadastro;
	}

	public void setDt_cadastro(LocalDate dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}
	
}
