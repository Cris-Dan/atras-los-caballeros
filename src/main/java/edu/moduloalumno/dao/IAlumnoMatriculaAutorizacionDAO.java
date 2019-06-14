package edu.moduloalumno.dao;

import java.util.List;
import edu.moduloalumno.entity.AlumnoMatriculaAutorizacion;
public interface IAlumnoMatriculaAutorizacionDAO {
    List<AlumnoMatriculaAutorizacion> getAllAlumnoMatriculaAutorizacion();
    List<AlumnoMatriculaAutorizacion> getAlumnoMatriculaAutorizacionById(String id_autorizacion);
}