package edu.moduloalumno.model;

import java.io.Serializable;

public class AutorizacionEstadoJSON implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id_autorizacion_estado;
    private String desc_autorizacion_estado;

    public AutorizacionEstadoJSON() {

    }

    public AutorizacionEstadoJSON(Integer id_autorizacion_estado) {
        this.id_autorizacion_estado = id_autorizacion_estado;

    }

    public AutorizacionEstadoJSON(Integer id_autorizacion_estado, String desc_autorizacion_estado) {
        this.id_autorizacion_estado = id_autorizacion_estado;
        this.desc_autorizacion_estado = desc_autorizacion_estado;
    }

    public Integer getId_autorizacion_estado() {
        return id_autorizacion_estado;
    }

    public void setId_autorizacion_estado(Integer id_autorizacion_estado) {
        this.id_autorizacion_estado = id_autorizacion_estado;
    }

    public String getDesc_autorizacion_estado() {
        return desc_autorizacion_estado;
    }

    public void setDesc_autorizacion_estado(String desc_autorizacion_estado) {
        this.desc_autorizacion_estado = desc_autorizacion_estado;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id_autorizacion_estado == null) ? 0 : id_autorizacion_estado.hashCode());
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
        AutorizacionEstadoJSON other = (AutorizacionEstadoJSON) obj;
        if (id_autorizacion_estado == null) {
            if (other.id_autorizacion_estado != null)
                return false;
        } else if (!id_autorizacion_estado.equals(other.id_autorizacion_estado))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "AutorizacionEstado [id_autorizacion_estado=" + id_autorizacion_estado + ", desc_autorizacion_estado=" + desc_autorizacion_estado + "]";
    }
}