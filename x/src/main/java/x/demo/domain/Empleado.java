
package x.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;
/**
 *
 * @author roger
 */
@Data
@Entity
@Table(name = "empleados")
public class Empleado implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String nombre;
    private String cargo;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hoteles hotel;
    
}
