package com.keepcoding.app.web.service;

import java.util.List;

import com.keepcoding.app.web.entity.Empleado;

public interface EmpleadoService {
	//Metodo que devuelve una lista de empleados
	public List<Empleado> listarEmpleados();
	
	//Metopdo para guardar un nuevo empleado
	public Empleado guardarEmpleado(Empleado empleado);
	
	//Metodo para buscar por ID
	public Empleado obtenerEmpleado(Long id);
	
	//Metodo para actualizar un empleado
	public Empleado actualizarEmpleado(Empleado empleado);
	
	//Metodo para eliminar un empleado
	public void eliminarEmpleado(Long id);
}
