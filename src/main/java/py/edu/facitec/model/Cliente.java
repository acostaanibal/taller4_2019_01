package py.edu.facitec.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity  //Indicamos que se creara una tabla cliente

public class Cliente {
	
	@Id  //para indicar la clave primaria
	@GeneratedValue  //generar la clave primaria secuencial
	private Integer id;
	private String nombre;
	private String correo;
	
				//objeto cliente que se encuentra en la clase
	@OneToMany(mappedBy="cliente")
	private List<Pedido> pedidos;//asociación
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	

}
