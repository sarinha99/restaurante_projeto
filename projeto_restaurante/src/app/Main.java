package app;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.jpaUtil.GenericaDAO;
import br.com.pub.model.Cliente;
import br.com.pub.model.ItemVenda;
import br.com.pub.model.Mesa;
import br.com.pub.model.Pessoa_Fisica;
import br.com.pub.model.Pessoa_Juridica;
import br.com.pub.model.Produto;
import br.com.pub.model.Usuario;
import br.com.pub.model.Vendas;

public class Main {
	

	public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("sys_restaurante");
        EntityManager manager = factory.createEntityManager();
      
        
		
		
		
    }

	
	
	

}
 