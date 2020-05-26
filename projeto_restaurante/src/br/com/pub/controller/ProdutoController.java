package br.com.pub.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.jpaUtil.GenericaDAO;
import br.com.pub.model.Produto;

@ManagedBean(name ="ProdutoBean")
@SessionScoped
public class ProdutoController implements Serializable{

	private static final long serialVersionUID = 1L;
	Produto produto = new Produto();
	GenericaDAO<Produto> produtoDAO = new GenericaDAO<Produto>();
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public String addProduto(){
		produtoDAO.novo(produto);
		return "listProduto";
	}
	public List<Produto> listarProdutos(){
		return produtoDAO.listarTodos(Produto.class);
	}
	
	public String delProduto(Produto produtot){
		produtoDAO.deletar(produtot);
		return "sucesso";
	}
	
}
