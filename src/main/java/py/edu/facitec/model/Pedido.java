package py.edu.facitec.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity

public class Pedido extends General  {
		
	private Date tomaFecha;
	private Date fechaentrega;
	private BigDecimal total;
	
	@ManyToOne
	//Aplicar la relcion de muchos a uno
	private Cliente cliente; // asociacion
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToMany(mappedBy="pedido")
	private List<ItemPedido> itemPedidos;
	
	//opcional
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public  Pedido() {
		//cliente =new Cliente(); composición
		
		}
	
	//@Override
	//public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
	//}

	public Date getTomaFecha() {
		return tomaFecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setTomaFecha(Date tomaFecha) {
		this.tomaFecha = tomaFecha;
	}

	public Date getFechaentrega() {
		return fechaentrega;
	}

	public void setFechaentrega(Date fechaentrega) {
		this.fechaentrega = fechaentrega;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	

	

}
