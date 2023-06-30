package tech.awakelab.jpapreventionsprint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tech.awakelab.jpapreventionsprint.models.Usuario;
import tech.awakelab.jpapreventionsprint.service.UsuarioService;


@Controller
public class UsuarioController {
	
	@Autowired
	UsuarioService us;
	
	@RequestMapping(value="/usuarios", method = RequestMethod.GET)
	public ModelAndView showAllUsers() {
		List<Usuario> usuarios = us.getAllUsers();
		return new ModelAndView("listar-usuarios", "usuarios", usuarios);
	}
}
