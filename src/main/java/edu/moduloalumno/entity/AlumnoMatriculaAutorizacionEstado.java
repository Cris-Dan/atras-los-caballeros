package edu.moduloalumno.entity;
import java.io.Serializable;
import java.util.Date;
public class AlumnoMatriculaAutorizacionEstado implements Serializable{
    private static final long serialVersionUID =  1L;
    private Integer id_autorizacion;
    private String cod_alumno;
    private Integer id_programa;
    private String semestre;
    private String n_autorizacion;
    private Integer anio_autorizacion;
    private Date fecha_emision;
    private String usuario_emision;
    private float importe;
    private float penalidad;
    private float amortizacion;
    private float saldo;
    private Date fecha_vencimieto;
    private Integer id_rec;
    private String autorizacion_estado;

    public Integer getId_utorizacion() {
        return id_autorizacion;
    }

    public void setId_utorizacion(Integer id_utorizacion) {
        this.id_autorizacion = id_utorizacion;
    }

    public String getCod_alumno() {
        return cod_alumno;
    }

    public void setCod_alumno(String cod_alumno) {
        this.cod_alumno = cod_alumno;
    }

    public Integer getId_programa() {
        return id_programa;
    }

    public void setId_programa(Integer id_programa) {
        this.id_programa = id_programa;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getN_autorizacion() {
        return n_autorizacion;
    }

    public void setN_autorizacion(String n_autorizacion) {
        this.n_autorizacion = n_autorizacion;
    }

    public Integer getAnio_autorizacion() {
        return anio_autorizacion;
    }

    public void setAnio_autorizacion(Integer anio_autorizacion) {
        this.anio_autorizacion = anio_autorizacion;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public String getUsuario_emision() {
        return usuario_emision;
    }

    public void setUsuario_emision(String usuario_emision) {
        this.usuario_emision = usuario_emision;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public float getPenalidad() {
        return penalidad;
    }

    public void setPenalidad(float penalidad) {
        this.penalidad = penalidad;
    }

    public float getAmortizacion() {
        return amortizacion;
    }

    public void setAmortizacion(float amortizacion) {
        this.amortizacion = amortizacion;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Date getFecha_vencimieto() {
        return fecha_vencimieto;
    }

    public void setFecha_vencimieto(Date fecha_vencimieto) {
        this.fecha_vencimieto = fecha_vencimieto;
    }

    public Integer getId_rec() {
        return id_rec;
    }

    public void setId_rec(Integer id_rec) {
        this.id_rec = id_rec;
    }

    public String getAutorizacion_estado() {
        return autorizacion_estado;
    }

    public void setAutorizacion_estado(String autorizacion_estado) {
        this.autorizacion_estado = autorizacion_estado;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_autorizacion == null) ? 0 : id_autorizacion.hashCode());
		return result;
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlumnoMatriculaAutorizacion other = (AlumnoMatriculaAutorizacion) obj;
		if (id_autorizacion == null) {
			if (other.getId_utorizacion() != null)
				return false;
		} else if (!id_autorizacion.equals(other.getId_utorizacion()))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "AlumnoMatriculaAutorizacion{" + "id_utorizacion=" + id_autorizacion + ", cod_alumno=" + cod_alumno + ", id_programa=" + id_programa + ", semestre=" + semestre + ", n_autorizacion=" + n_autorizacion + ", anio_autorizacion=" + anio_autorizacion + ", fecha_emision=" + fecha_emision + ", usuario_emision=" + usuario_emision + ", importe=" + importe + ", penalidad=" + penalidad + ", amortizacion=" + amortizacion + ", saldo=" + saldo + ", fecha_vencimieto=" + fecha_vencimieto + ", id_rec=" + id_rec + ", autorizacion_estado=" + autorizacion_estado + '}';
    }

}