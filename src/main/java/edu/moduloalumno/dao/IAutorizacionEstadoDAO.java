package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.AutorizacionEstado;

public interface IAutorizacionEstadoDAO {

    List<AutorizacionEstado> getAllAutorizacionEstado();

    AutorizacionEstado getAutorizacionEstadoById(int id_autorizacion_estado);


}