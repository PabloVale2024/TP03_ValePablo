package ar.edu.unju.fi.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FormClienteController {
	@GetMapping({"/Formulario"}) 
	//indica la raiz
	public String getFormCliente() {
	
	return "formCliente";
	}
	

}
