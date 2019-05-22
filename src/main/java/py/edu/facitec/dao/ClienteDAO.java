package py.edu.facitec.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.model.Cliente;

@Repository  //Indicamos a Spring coneccion 


		//Completamos el objeto con que trabajara el DAOGenerico
public class ClienteDAO extends DAOGenerico<Cliente>{
	
	
	public ClienteDAO() {
		
		//Completamos la clase con que trabajara el DAGenerico
		super(Cliente.class);
		// TODO Auto-generated constructor stub
	}

	@PersistenceContext
	
	private  EntityManager em; 
		
	//public void save(Cliente cliente) {
		
		//System.out.println(cliente);
		
		//em.persist(cliente);
		
		//System.out.println(cliente);

	//}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
