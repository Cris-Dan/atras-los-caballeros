package edu.moduloalumno.model;

public class conceptoDescuentoJSON {
    private static final long serialVersionUID = 1L;
    private Integer id_programa_ciclo;
    private Integer id_concepto;
    private String concepto;
    private String descripcion_min;
    private Integer credito;
    private Integer importe;
    private float descuento;
    private float importe_final;
    private Integer cuotas;

    public conceptoDescuentoJSON() {
    }

    public conceptoDescuentoJSON(Integer id_programa_ciclo, Integer id_concepto, String concepto, String descripcion_min, Integer credito, Integer importe, float descuento, float importe_final, Integer cuotas) {
        this.id_programa_ciclo = id_programa_ciclo;
        this.id_concepto = id_concepto;
        this.concepto = concepto;
        this.descripcion_min = descripcion_min;
        this.credito = credito;
        this.importe = importe;
        this.descuento = descuento;
        this.importe_final = importe_final;
        this.cuotas = cuotas;
    }

    public Integer getId_programa_ciclo() {
        return id_programa_ciclo;
    }

    public void setId_programa_ciclo(Integer id_programa_ciclo) {
        this.id_programa_ciclo = id_programa_ciclo;
    }

    public Integer getId_concepto() {
        return id_concepto;
    }

    public void setId_concepto(Integer id_concepto) {
        this.id_concepto = id_concepto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getDescripcion_min() {
        return descripcion_min;
    }

    public void setDescripcion_min(String descripcion_min) {
        this.descripcion_min = descripcion_min;
    }

    public Integer getCredito() {
        return credito;
    }

    public void setCredito(Integer credito) {
        this.credito = credito;
    }

    public Integer getImporte() {
        return importe;
    }

    public void setImporte(Integer importe) {
        this.importe = importe;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getImporte_final() {
        return importe_final;
    }

    public void setImporte_final(float importe_final) {
        this.importe_final = importe_final;
    }

    public Integer getCuotas() {
        return cuotas;
    }

    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id_programa_ciclo == null) ? 0 : id_programa_ciclo.hashCode());
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
        conceptoDescuentoJSON other = (conceptoDescuentoJSON) obj;
        if (id_programa_ciclo == null) {
            if (other.id_programa_ciclo != null)
                return false;
        } else if (!id_programa_ciclo.equals(other.id_programa_ciclo))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "conceptoDescuento{" +
                "id_programa_ciclo=" + id_programa_ciclo +
                ", id_concepto=" + id_concepto +
                ", concepto='" + concepto + '\'' +
                ", descripcion_min='" + descripcion_min + '\'' +
                ", credito=" + credito +
                ", importe=" + importe +
                ", descuento=" + descuento +
                ", importe_final=" + importe_final +
                ", cuotas=" + cuotas +
                '}';
    }
}
