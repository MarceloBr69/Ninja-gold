package com.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class Contolador {
	private List<String> historial = new ArrayList<>();
	int goldSum = 0; 
	int goldBase = 0; 
	
	@GetMapping("/gold")
	public String home(Model model) {
		model.addAttribute("goldBase", goldBase); 
		model.addAttribute("historial", historial);
		
		return "/index.jsp"; 
	}
	
	
	
	
	
	@PostMapping("/goldfarm")
	public String actionFarm(Model model, RedirectAttributes redirect) {
		int goldSum = (int) (Math.random()*(20-10+1))+10; 
		goldBase += goldSum; 
		
		String mensaje = "Ud ha obtenido " + goldSum + " oros";
        historial.add(mensaje);
        
		return "redirect:/gold";
	}
	@PostMapping("/goldcave")
	public String actionCave() {
		int goldSum = (int) (Math.random()*(10-5+1))+5; 
		goldBase += goldSum; 
		
		String mensaje = "Ud ha obtenido " + goldSum + " oros";
        historial.add(mensaje);
        
		return "redirect:/gold";
	}
	@PostMapping("/goldcasa")
	public String actionCasa() {
		int goldSum = (int) (Math.random()*(5-2+1))+2; 
		goldBase += goldSum; 
		
		String mensaje = "Ud ha obtenido " + goldSum + " oros";
        historial.add(mensaje);
        
		return "redirect:/gold";
	}
	@PostMapping("/goldcasino")
	public String actionCasino() {
		int goldSum = (int) (Math.random()*(50-0+1))+0; 
		goldBase += goldSum; 
		
		String mensaje = "Ud ha obtenido " + goldSum + " oros";
        historial.add(mensaje);
        
		return "redirect:/gold";
	}
	
	
}
