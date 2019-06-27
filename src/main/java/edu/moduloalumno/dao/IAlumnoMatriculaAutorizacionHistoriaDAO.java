package edu.moduloalumno.dao;

import edu.moduloalumno.entity.AlumnoMatriculaAutorizacionHistoria;

import java.util.List;

public interface IAlumnoMatriculaAutorizacionHistoriaDAO {
    List<AlumnoMatriculaAutorizacionHistoria> getAlumnoMatriculaAutorizacionHistoriaByCodAlumno(String cod_alumno);

}
