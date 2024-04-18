/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package x.demo.service;

import x.demo.domain.Empleado;
import java.util.List;
import java.util.Optional;
/**
 *
 * @author roger
 */
public interface EmpleadoService {
    List<Empleado> obtenerTodosLosEmpleados();

    Optional<Empleado> obtenerEmpleadoPorId(Long id);

    void guardarEmpleado(Empleado empleado);

    void actualizarEmpleado(Long id, Empleado empleado);

    void eliminarEmpleado(Long id);
}
