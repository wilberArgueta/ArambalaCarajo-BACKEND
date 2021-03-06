package com.arambalacarajo.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.model.ExistenciasModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.model.ProductosModel;
import com.arambalacarajo.service.ExistenciasService;

@RestController
public class ExistenciasController {

	@Autowired
	@Qualifier("existenciasService")
	private ExistenciasService cps;
	
	private Log LOGG = LogFactory.getLog(ExistenciasController.class);
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/existencias", method = RequestMethod.POST)
	public Message nuevo(@RequestBody ExistenciasModel cp) {

		return cps.addExistencias(cp);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/existencias/update", method = RequestMethod.POST)
	public Message actualizar(@RequestBody ExistenciasModel cp) {
		LOGG.info("Cantidad: " +cp.getCantidad());
		return cps.updateExistencias(cp);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/existencias/delete", method = RequestMethod.POST)
	public Message eliminar(@RequestBody ExistenciasModel cp) {

		return cps.deleteExistencias(cp);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/existencias", method = RequestMethod.GET)
	public List<ExistenciasModel> lista() {

		return cps.listaExistencias();
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/existencias/{id}", method = RequestMethod.GET)
	public ExistenciasModel byId(@PathVariable int id) {

		return cps.findExistenciasById(id);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/existencias/producto", method = RequestMethod.POST)
	public ExistenciasModel byProducto(@RequestBody ProductosModel p) {

		return cps.findExistenciasByProducto(p);
	}
}
