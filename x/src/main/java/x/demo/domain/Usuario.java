/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package x.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
import java.util.List;
/**
 *
 * @author roger
 */
@Data
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "numero_cedula") 
    private String numeroCedula;

    private String password;
    private boolean enabled;

    @ManyToMany
    @JoinTable(
        name = "usuario_roles",
        joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "numero_cedula"),
        inverseJoinColumns = @JoinColumn(name = "rol_id", referencedColumnName = "id_rol")
    )
    private List<Rol> roles;
}
