package edu.moduloalumno.dao;

import java.util.List;
import edu.moduloalumno.entity.AlumnoMatriculaAutorizacion;
public interface IAlumnoMatriculaAutorizacionDAO {
    List<AlumnoMatriculaAutorizacion> getAllAlumnoMatriculaAutorizacion();
    AlumnoMatriculaAutorizacion getAlumnoMatriculaAutorizacionById(int id_autorizacion);
}