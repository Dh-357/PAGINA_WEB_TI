package mx.conexion.com;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Conexion {
	
	
	public DriverManagerDataSource conectar() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/registro");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}

}
