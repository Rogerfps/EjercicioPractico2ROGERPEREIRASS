/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package x.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import x.demo.domain.Empleado;
import x.demo.dao.EmpleadoDao;
import java.util.List;
import java.util.Optional;
import x.demo.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
    @Autowired
    private EmpleadoDao empleadoDao;

    @Override
    public List<Empleado> obtenerTodosLosEmpleados() {
        return empleadoDao.findAll();
    }

    @Override
    public Optional<Empleado> obtenerEmpleadoPorId(Long id) {
        return empleadoDao.findById(id);
    }

    @Override
    public void guardarEmpleado(Empleado empleado) {
        empleadoDao.save(empleado);
    }

    @Override
    public void actualizarEmpleado(Long id, Empleado empleado) {
        Optional<Empleado> empleadoExistente = empleadoDao.findById(id);
        if (empleadoExistente.isPresent()) {
            Empleado empleadoActualizado = empleadoExistente.get();
            empleadoActualizado.setNombre(empleado.getNombre());
            empleadoActualizado.setCargo(empleado.getCargo());
            empleadoDao.save(empleadoActualizado);
        } else {
            // Manejo de error, por ejemplo, lanzar una excepción o guardar un registro de error
        }
    }

    @Override
    public void eliminarEmpleado(Long id) {
        empleadoDao.deleteById(id);
    }
}
