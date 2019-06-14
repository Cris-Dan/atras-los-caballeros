package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.service.IAlumnoMatriculaAutorizacionService;
import edu.moduloalumno.entity.AlumnoMatriculaAutorizacionEstado;

@Service
public class AlumnoMatriculaAutorizacionService implements IAlumnoMatriculaAutorizacionService {
	@Autowired
	private AlumnoMatriculaAutorizacionEstado alumnoMatriculaAutorizacionEstado;

    @Override
    public List<AlumnoMatriculaAutorizacionEstado> getAllAlumnoMatriculaAutorizacionEstado(){
        return null;
    }

}