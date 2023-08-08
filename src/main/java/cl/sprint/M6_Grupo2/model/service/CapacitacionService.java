package cl.sprint.M6_Grupo2.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.sprint.M6_Grupo2.model.entity.Capacitacion;
import cl.sprint.M6_Grupo2.model.repository.ICapacitacionRepository;

@Service
public class CapacitacionService {
	
	@Autowired
	private ICapacitacionRepository cRep;

	public CapacitacionService() {
		super();
	}
	
	public List<Capacitacion> getAll(){
		return cRep.findAll();
		
	}
	
	public Capacitacion getOne(int idCapacitacion) {
		return cRep.getOne(idCapacitacion);
		
	}
	
	private void create(Capacitacion c) {
		cRep.save(c);
	}
	
	private void update(Capacitacion c) {
		cRep.save(c);

	}
	
	private void delete(int idCapacitacion) {
		cRep.delete(getOne(idCapacitacion));
	}
	
}
