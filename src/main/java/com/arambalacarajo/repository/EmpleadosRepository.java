package com.arambalacarajo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Empleados;

@Repository("empleadosRepository")
public interface EmpleadosRepository extends JpaRepository<Empleados, String> {

	public Empleados findEmpleadoByCodEmpleado(String codEmpleado);
	public List<Empleados> findEmpleadoByNombreContaining(String nombre);
	public List<Empleados> findEmpleadoByActivo(Boolean activo);


}
