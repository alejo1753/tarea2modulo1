package com.distribuida.principal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.DatosEmpresa;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Libro;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Cliente cliente = context.getBean("cliente",Cliente.class);
		Factura factura = context.getBean("factura",Factura.class);
		DetalleFactura detalleFactura = context.getBean("detalleFactura",DetalleFactura.class);
		Libro libro = context.getBean("libro",Libro.class);
		Categoria categoria = context.getBean("categoria",Categoria.class);
		Autor autor = context.getBean("autor",Autor.class);
		DatosEmpresa datosEmpresa= context.getBean("datosEmpresa", DatosEmpresa.class);
		
		//CLIENTE 
		cliente.setIdCliente(1);
		cliente.setCedula("1714765102");
		cliente.setNombre("Rosa");
		cliente.setApellido("Lucero");
		cliente.setDireccion("Quito, Cumbaya");
		cliente.setTelefono("098745632");
		cliente.setCorreo("lucilarosa1978@gmail.com");
		
		//FACTURA
		factura.setIdFactura(1);
		factura.setNumFactura("001");
		factura.setFecha("19/11/2023");
		factura.setTotalNeto(15.85);
		factura.setIva(1.12);
		factura.setTotal(factura.getTotalNeto()*factura.getIva());
		
		//LIBRO
		libro.setIdLibro(1);
		libro.setTitulo("Bajo la misma estrella");
		libro.setEditorial("Ryck Yancey");
		libro.setNumPaginas(320);
		libro.setEdicion(2);
		libro.setIdioma("Español");
		libro.setFechaPublicacion("2012");
		libro.setDescripcion(" La historia se centra en dos adolescentes con cáncer, Hazel Grace Lancaster y Augustus Waters, y ha sido muy popular desde su lanzamiento. Además del libro, en 2014 se lanzó una adaptación cinematográfica basada en la novela.");
		libro.setNumEjemplares(400);
		libro.setPortada("Original");
		libro.setPresentacion(" La historia se centra en dos adolescentes con cáncer, Hazel Grace Lancaster y Augustus Waters, y ha sido muy popular desde su lanzamiento. Además del libro, en 2014 se lanzó una adaptación cinematográfica basada en la novela.");
		libro.setPrecio(15.85);
		
		
		//CATEGORIA
		categoria.setIdCategoria(1);
		categoria.setCategoria("Romance");
		categoria.setDescripcion("Bajo la miosma estrella");
		
		//AUTOR
		autor.setIdAutor(1);
		autor.setNombre("John");
		autor.setApellido("Green");
		autor.setPais("Estados Unidos");
		autor.setDireccion("Indianapolis, Indiana");
		autor.setTelefono("7894510");
		autor.setCorreo("johngreen12@hotmail.com");
		
		
		//IMPRIMIR
		System.out.println(datosEmpresa.toString());
		System.out.println(autor.toString());
		System.out.println(categoria.toString());
		System.out.println(libro.toString());
		System.out.println(factura.toString());
		System.out.println(cliente.toString());
		System.out.println(detalleFactura.toString());
		
		context.close();
	}

}
