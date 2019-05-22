package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	//responde a la raiz del proyecto
	@RequestMapping("/")
	
	public String home() {
		
		System.out.println("Cargando página de inicio");
		
		
		//crear este archivo dentro de webapp
		return "view/templates/index";
		}
	
	@RequestMapping("/menu")
	public String variable(){
		
		System.out.println("Cargando el menu");
		//pagina
		return "view/templates/menu";
	}
	
	
	

}
