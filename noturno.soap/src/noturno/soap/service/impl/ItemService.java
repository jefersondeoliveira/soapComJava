package noturno.soap.service.impl;

import java.util.List;

import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import noturno.soap.entity.Item;
import noturno.soap.service.IItemService;

@WebService(endpointInterface="noturno.soap.service.IItemService", 
					serviceName="ItemService")
public class ItemService implements IItemService{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public String salvar(Item item) {
		
		em.merge(item);
		
		return "Salvo com sucesso";
	}

	@Override
	public List<Item> consultar() {
					
		return em.createQuery("select i from Item as i", Item.class).getResultList();
	
	}
	
	
	
}
