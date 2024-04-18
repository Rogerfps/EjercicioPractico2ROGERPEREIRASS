/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package x.demo.service.impl;

import x.demo.domain.Usuario;
import x.demo.service.RegistroService;
import x.demo.service.UsuarioService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;
import java.util.Locale;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import x.demo.dao.UsuarioDao;
import x.demo.service.RegistroService;

@Service
public class RegistroServiceImpl implements RegistroService {

    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public Model activar(Model model, String username, String clave) {
        Usuario usuario = usuarioDao.findByUsernameAndPassword(username, clave);
        if (usuario != null) {
            model.addAttribute("usuario", usuario);
        } else {
            model.addAttribute("mensaje", "Usuario o contraseña incorrectos");
        }
        return model;
    }

    @Override
    public Model crearUsuario(Model model, Usuario usuario) {
        if (usuarioDao.existsByUsername(usuario.getUsername())) {
            model.addAttribute("mensaje", "El usuario ya está registrado");
        } else {
            usuarioDao.save(usuario);
            model.addAttribute("mensaje", "Usuario creado exitosamente");
        }
        return model;
    }

    @Override
    public Model recordarUsuario(Model model, Usuario usuario) {
        Usuario usuarioExistente = usuarioDao.findByUsernameAndPassword(usuario.getUsername(), usuario.getPassword());
        if (usuarioExistente != null) {
            // Lógica para recordar usuario (envío de correo, generación de nueva contraseña, etc.)
            model.addAttribute("mensaje", "Se ha enviado un recordatorio al correo electrónico asociado a tu cuenta");
        } else {
            model.addAttribute("mensaje", "El usuario no está registrado");
        }
        return model;
    }
}
