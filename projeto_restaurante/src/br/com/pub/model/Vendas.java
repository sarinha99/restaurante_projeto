package br.com.pub.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Vendas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private LocalDate data;
	private double totalVenda;

	@OneToOne
	private Mesa mesa;

	@OneToOne
	private Cliente cliente;

	private LocalTime hora;
	@OneToMany
	private List<ItemVenda> itemvenda;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getTotalVenda() {
		return totalVenda;
	}

	public void setTotalVenda(double totalVenda) {
		this.totalVenda = totalVenda;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemVenda> getItemvenda() {
		return itemvenda;
	}

	public void setItemvenda(List<ItemVenda> itemvenda) {
		this.itemvenda = itemvenda;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
}
