package ar.edu.unju.fi.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexControler {
	@GetMapping({"/index","/home","/","/inicio"})//indica la raiz
	
	public String getindex () {
		
		return "index";
	}
}
