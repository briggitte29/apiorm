package com.brig.orm.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;
	private String nombreproducto;
	private String descripcion;
	private Double precio;
	private Integer stock;
	
	//este de uno a uno
	@OneToOne
	private Proveedor proveedores;
	
	
	//como es relacion de muchos a muchos 
	//estamos eligiendo que genere a partir del producto
	@ManyToMany	
	@JoinTable(name= "producto_cliente",
		joinColumns = @JoinColumn(name="id_producto", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreing key (id_producto) references productos (id_producto)")),
		inverseJoinColumns = @JoinColumn(name= "id_cliente",nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreing key (id_cliente) references clientes (id_cliente)"))
			)
	private List<Cliente> clientes= new ArrayList<>();
	
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombreproducto() {
		return nombreproducto;
	}
	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	
}
