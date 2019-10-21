package mx.mypaquete.com;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mx.conexion.com.Conexion;
import mx.paquetaxo.com.Persona;

@Controller
public class Control {
		

	
		@RequestMapping
		public String iniciar() {
			return "home";
		}
		
		@RequestMapping("inicio")
		public String mandar_inicio() {
			return "home";
		}
		
		@RequestMapping("registrar")
		public ModelAndView registrar(Persona p) {
			
			Conexion con = new Conexion();
			JdbcTemplate jdbct = new JdbcTemplate(con.conectar());
			String sql="insert into persona (Id,Nombre,Edad,Lectura) values (?,?,?,?)";
			jdbct.update(sql,p.getId(),p.getNombre(),p.getEdad(),p.getLectura());
			
			return new ModelAndView("Agregado_exito");
			
		}
		
		@RequestMapping("muestra_tabla")
		public ModelAndView muestra_tabla() {
			ModelAndView modelo = new ModelAndView();
			Conexion con = new Conexion();
			JdbcTemplate jdbct = new JdbcTemplate(con.conectar());
			String sql="select * from persona";
			List datos =jdbct.queryForList(sql);
			modelo.addObject("lista",datos);
			modelo.setViewName("resp_muestra_tabla");
			return modelo;
		}
		
		@RequestMapping("delete")
		public ModelAndView delete(HttpServletRequest request) {
			int id;
			id=Integer.parseInt(request.getParameter("id"));
			String sql="delete from persona where Id="+id;
			Conexion con = new Conexion();
			JdbcTemplate jdbct = new JdbcTemplate(con.conectar());
			jdbct.update(sql);
			return new ModelAndView("eliminado");
			
		}
}
