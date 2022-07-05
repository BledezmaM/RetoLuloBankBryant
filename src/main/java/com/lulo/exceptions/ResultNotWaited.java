package com.lulo.exceptions;

public class ResultNotWaited extends AssertionError {


  public static final String CREACION_USUARIO = "No se creo el usuario correctamente response diferente 200";
  public static final String CONSULTA_USUARIO = "Problemas al consultar el usuario no existe respuesta diferente 200";
  public static final String ACTUALIZACION_USUARIO = "Problemas al actualizar el usuario respuesta diferente 200";
  public static final String ELIMINACION_USUARIO = "Problemas al eliminar el usuario respuesta diferente 200";


  public ResultNotWaited(String message) {
    super(message);
  }
  public ResultNotWaited(String message, Throwable cause) {
    super(message, cause);
  }
}
