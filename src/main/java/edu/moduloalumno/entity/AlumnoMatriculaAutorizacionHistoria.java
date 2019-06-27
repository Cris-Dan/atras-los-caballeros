package edu.moduloalumno.entity;

public class AlumnoMatriculaAutorizacionHistoria {
    private static final long serialVersionUID = 1L;

    private String cod_semestre;

    private String cod_alumno;

    private String alumno;

    private String sigla_programa;

    private Integer ciclo;
    private Integer Creditos;



    public String getCod_semestre() {
        return cod_semestre;
    }

    public void setCod_semestre(String cod_semestre) {
        this.cod_semestre = cod_semestre;
    }

    public String getCod_alumno() {
        return cod_alumno;
    }

    public void setCod_alumno(String cod_alumno) {
        this.cod_alumno = cod_alumno;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getSigla_programa() {
        return sigla_programa;
    }

    public void setSigla_programa(String sigla_programa) {
        this.sigla_programa = sigla_programa;
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public Integer getCreditos() {
        return Creditos;
    }

    public void setCreditos(Integer creditos) {
        Creditos = creditos;
    }

    public AlumnoMatriculaAutorizacionHistoria() {

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
        AlumnoMatriculaAutorizacionHistoria other = (AlumnoMatriculaAutorizacionHistoria) obj;
        if (cod_alumno == null) {
            if (other.cod_alumno != null)
                return false;
        } else if (!cod_alumno.equals(other.cod_alumno))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "AmAHistora{" +
                "cod_semestre='" + cod_semestre + '\'' +
                ", cod_alumno='" + cod_alumno + '\'' +
                ", alumno='" + alumno + '\'' +
                ", sigla_programa='" + sigla_programa + '\'' +
                ", ciclo=" + ciclo +
                ", Creditos=" + Creditos +
                '}';
    }
}
