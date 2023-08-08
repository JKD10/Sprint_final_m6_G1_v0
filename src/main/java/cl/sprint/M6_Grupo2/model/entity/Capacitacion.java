package cl.sprint.M6_Grupo2.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "capacitacion")
public class Capacitacion {
	 
		@Id
		@Column(name="idcapacitacion")
		private int idCapacitacion;
		private String empresa;
		private String dia;
		private String hora;
		private String lugar;
		private String duracion;
		private int cantidadAsistentes;
		private String detalle;

		public Capacitacion() {
		}

		public Capacitacion(int idCapacitacion, String empresa, String dia, String hora, String lugar, String duracion,
				int cantidadAsistentes, String detalle) {
			super();
			this.idCapacitacion = idCapacitacion;
			this.empresa = empresa;
			this.dia = dia;
			this.hora = hora;
			this.lugar = lugar;
			this.duracion = duracion;
			this.cantidadAsistentes = cantidadAsistentes;
			this.detalle = detalle;
		}

		public int getIdCapacitacion() {
			return idCapacitacion;
		}

		public void setIdCapacitacion(int idCapacitacion) {
			this.idCapacitacion = idCapacitacion;
		}

		public String getEmpresa() {
			return empresa;
		}

		public void setEmpresa(String empresa) {
			this.empresa = empresa;
		}

		public String getDia() {
			return dia;
		}

		public void setDia(String dia) {
			this.dia = dia;
		}

		public String getHora() {
			return hora;
		}

		public void setHora(String hora) {
			this.hora = hora;
		}

		public String getLugar() {
			return lugar;
		}

		public void setLugar(String lugar) {
			this.lugar = lugar;
		}

		public String getDuracion() {
			return duracion;
		}

		public void setDuracion(String duracion) {
			this.duracion = duracion;
		}

		public int getCantidadAsistentes() {
			return cantidadAsistentes;
		}

		public void setCantidadAsistentes(int cantidadAsistentes) {
			this.cantidadAsistentes = cantidadAsistentes;
		}

		public String getDetalle() {
			return detalle;
		}

		public void setDetalle(String detalle) {
			this.detalle = detalle;
		}

		@Override
		public String toString() {
			return "Capacitacion [idCapacitacion=" + idCapacitacion + ", empresa=" + empresa + ", dia=" + dia
					+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadAsistentes="
					+ cantidadAsistentes + ", detalle=" + detalle + "]";
		}

		
		
	}