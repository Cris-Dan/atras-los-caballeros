package edu.moduloalumno.dao;

import java.util.List;
import edu.moduloalumno.entity.AlumnoMatriculaAutorizacion;
import edu.moduloalumno.entity.AlumnoMatriculaAutorizacionEstado;

public interface IAlumnoMatriculaAutorizacionDAO {
    List<AlumnoMatriculaAutorizacion> getAllAlumnoMatriculaAutorizacion();
    List<AlumnoMatriculaAutorizacion> getAlumnoMatriculaAutorizacionById(String id_autorizacion);
    List<AlumnoMatriculaAutorizacionEstado> getAlumnoMatriculaAutorizacionEstadoById(String codigoAlumno);
}