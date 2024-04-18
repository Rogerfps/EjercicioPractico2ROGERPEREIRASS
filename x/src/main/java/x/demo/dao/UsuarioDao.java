/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package x.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import x.demo.domain.Usuario;
/**
 *
 * @author roger
 */
public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    
    Usuario findByUsernameAndPassword(String username, String password);

    boolean existsByUsername(String username);

    
}