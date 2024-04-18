/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package x.demo.service;

import x.demo.domain.Hoteles;

import java.util.List;
import java.util.Optional;
/**
 *
 * @author roger
 */
public interface HotelesService {
    List<Hoteles> obtenerTodosLosHoteles();

    Optional<Hoteles> obtenerHotelPorId(Long id);

    void guardarHotel(Hoteles hotel);

    void actualizarHotel(Long id, Hoteles hotel);

    void eliminarHotel(Long id);
}
