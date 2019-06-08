package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.MatriculaCab;

public interface IMatriculaCabDAO {

    List<MatriculaCab> getAllMatriculaCab();

    MatriculaCab getMatriculaCabBycodAlumno(String cod_alumno);

   /* MatriculaCab getMatriculaCabByIdPrograma(int id_programa);

    MatriculaCab getMatriculaCabBySemestre(String semestre);

    MatriculaCab getMatriculaCabByCiclo(int ciclo);*/


}