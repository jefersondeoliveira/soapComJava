package noturno.soap.service;

import java.util.List;

import javax.jws.WebService;

import noturno.soap.entity.Item;

@WebService(targetNamespace="http://noturno.soap.service")
public interface IItemService {
	
	public String salvar(Item item);
	
	public List<Item> consultar();
	
}
