package py.edu.facitec.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.dao.ClienteDAO;
import py.edu.facitec.model.Cliente;


@Transactional  //para trabajar con trasacciones en Spring
@Controller

	public class ClienteController {
	
	@RequestMapping("/clientes")
	public String form() {
		
		System.out.println("Ingrese a  Formulario");
		return "view/cliente/form";
		}
	//form.html
	
	@Autowired  // Inyeccionde dependencias
				// creacion de objeto
	private ClienteDAO clienteDAO;

	
	@RequestMapping("/cliente")
	public String registrarCliente(Cliente cliente) {
		
		clienteDAO.guardar(cliente);
		
		return "view/cliente/form";
		
	}

}
