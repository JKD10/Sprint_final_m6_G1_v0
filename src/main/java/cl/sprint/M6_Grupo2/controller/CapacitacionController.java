package cl.sprint.M6_Grupo2.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.sprint.M6_Grupo2.model.entity.Capacitacion;
import cl.sprint.M6_Grupo2.model.service.CapacitacionService;

@Controller
public class CapacitacionController {
	
	@Autowired
	private CapacitacionService cs;
	
	@RequestMapping (value= "/listarcapacitacion",  method= RequestMethod.GET)
	public ModelAndView listarCapacitacion() {
		
		ArrayList<Capacitacion> capacitaciones = (ArrayList<Capacitacion>) cs.getAll();
		return new ModelAndView("listarcapacitacion", "capacitaciones", capacitaciones);
		
	}
}
