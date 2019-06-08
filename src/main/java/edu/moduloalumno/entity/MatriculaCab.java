package edu.moduloalumno.entity;

import java.io.Serializable;

public class MatriculaCab implements Serializable {
    private static final long serialVersionUID = 1L;

    private String cod_alumno;
    private Integer id_programa;
    private String semestre;
    private Integer ciclo;

    public MatriculaCab() {

    }

    public MatriculaCab(String cod_alumno, Integer id_programa, String semestre, Integer ciclo) {
        this.cod_alumno = cod_alumno;
        this.id_programa = id_programa;
        this.semestre = semestre;
        this.ciclo = ciclo;
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

    public String getSemestre(){
        return semestre;
    }

    public void setSemestre(String semestre){
        this.semestre = semestre;
    }

    public Integer getCiclo(){
        return ciclo;
    }

    public void setCiclo(Integer ciclo){
        this.ciclo = ciclo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cod_alumno == null) ? 0 : cod_alumno.hashCode());
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
        MatriculaCab other = (MatriculaCab) obj;
        if (cod_alumno == null) {
            if (other.cod_alumno != null)
                return false;
        } else if (!cod_alumno.equals(other.cod_alumno))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "MatriculaCab [cod_alumno = " + cod_alumno + ", id_programa = " + id_programa +
                ", semestre = " + semestre + ", ciclo = " + ciclo +"]";
    }
}