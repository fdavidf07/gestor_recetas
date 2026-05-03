package pio.daw.gestor_recetas.modelo;

import jakarta.persistence.*;

@Entity
public class Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String cantidad; // Ej: 200gr, 2 cucharadas
    private String tipo; // Ej: Verdura, Especia, Lácteo
    private boolean esAlergeno;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isEsAlergeno() {
		return esAlergeno;
	}
	public void setEsAlergeno(boolean esAlergeno) {
		this.esAlergeno = esAlergeno;
	}

}