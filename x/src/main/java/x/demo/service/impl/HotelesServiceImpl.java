/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package x.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import x.demo.dao.HotelDao;
import x.demo.domain.Hoteles;

import java.util.List;
import java.util.Optional;
import x.demo.service.HotelesService;

@Service
public class HotelesServiceImpl implements HotelesService{
     @Autowired
    private HotelDao hotelesDao;

    @Override
    public List<Hoteles> obtenerTodosLosHoteles() {
        return hotelesDao.findAll();
    }

    @Override
    public Optional<Hoteles> obtenerHotelPorId(Long id) {
        return hotelesDao.findById(id);
    }

    @Override
    public void guardarHotel(Hoteles hotel) {
        hotelesDao.save(hotel);
    }

    @Override
    public void actualizarHotel(Long id, Hoteles hotel) {
        Optional<Hoteles> hotelExistente = hotelesDao.findById(id);
        if (hotelExistente.isPresent()) {
            Hoteles hotelActualizado = hotelExistente.get();
            hotelActualizado.setNombre(hotel.getNombre());
            hotelActualizado.setUbicacion(hotel.getUbicacion());
            hotelActualizado.setDescripcion(hotel.getDescripcion());
            hotelesDao.save(hotelActualizado);
        } else {
            // Manejo de error, por ejemplo, lanzar una excepción o guardar un registro de error
        }
    }

    @Override
    public void eliminarHotel(Long id) {
        hotelesDao.deleteById(id);
    }
}
