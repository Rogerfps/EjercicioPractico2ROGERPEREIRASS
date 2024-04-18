
package x.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "reservas")
public class Reservas implements Serializable {
    

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "cliente_nombre")
    private String clienteNombre;

    @Column(name = "num_huespedes")
    private int numHuespedes;

    @Column(name = "fecha_ingreso")
    private Date fechaIngreso;

    @Column(name = "fecha_salida")
    private Date fechaSalida;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hoteles hotel;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
}