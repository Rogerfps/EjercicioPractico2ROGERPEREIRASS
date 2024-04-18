/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package x.demo.dao;

import x.demo.domain.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author roger
 */
public interface EmpleadoDao extends JpaRepository <Empleado, Long> {
    
}
