#language: es

Característica: Eliminar usuario por servicios

  @EliminacionUsuario
  Esquema del escenario: Eliminacion de usuarios
    Dado consulta servicio de creacion usaurio
    Cuando elimina el usuario
      | <username> |
    Entonces valida la eliminacion del usuario

    Ejemplos:
      | username |
      | bledezma |





