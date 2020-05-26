package br.com.jpaUtil;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GenericaDAO <E> implements IGenericDAO <E>,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	EntityManager em;

	public GenericaDAO (){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sys_restaurante");
    	em = factory.createEntityManager();

	}
		public void novo(final E entidade) {
			final  EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(entidade);
			et.commit();
			//em.close();
			
			// TODO Autetio-generated method stub
			
		}
		@Override
		public void alterar(final E entidade) {
			final EntityTransaction et = em.getTransaction();
				et.begin();
				em.merge(entidade);
				et.commit();
				//em.close();
			// TODO Auto-generated method stub
			
		}
		@Override
		public void deletar( final E entidade) {
			final EntityTransaction et = em.getTransaction();
			et.begin();
			em.remove(entidade);
			et.commit();
			//em.close();
			// TODO Auto-generated method stub
		}
				
		public List<E> listarTodos(Class<E> entidade) {
			final EntityTransaction et = em.getTransaction();
			et.begin();
			@SuppressWarnings("unchecked")
			List<E> retorno = em.createQuery("from "+ entidade.getName()).getResultList();
			et.commit();
			//em.close();
			// TODO Auto-generated method stub
			return retorno;
		}
}
