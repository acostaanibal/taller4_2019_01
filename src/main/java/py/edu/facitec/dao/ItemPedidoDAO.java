package py.edu.facitec.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.model.Cliente;
import py.edu.facitec.model.ItemPedido;

@Repository  //Indicamos a Spring coneccion 


		//Completamos el objeto con que trabajara el DAOGenerico
public class ItemPedidoDAO extends DAOGenerico<ItemPedido>{
	
	
	public ItemPedidoDAO() {
		
		//Completamos la clase con que trabajara el DAGenerico
		super(ItemPedido.class);
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
