package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilidadController {
	
	
	//responde a la raiz del proyecto
	@RequestMapping("/comollegar")
	
	public String home() {
		
		System.out.println("Cargando página de inicio");
		
		
		//crear este archivo dentro de webapp
		//carpeta o nombre de archivo 
		return "comollegar";
		
	}

}
