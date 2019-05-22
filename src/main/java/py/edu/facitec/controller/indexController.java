package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
	
	@RequestMapping("/algo")
	
	private String nombreMetodo() {
		

		System.out.println("Cargando desde el otro controlador");
		//carpeta		//archivo
		
		return "view/templates/index";
	}
	
 

}
