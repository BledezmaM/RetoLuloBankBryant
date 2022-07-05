#language: es

Característica: Consulta de usuario por servicios

  @ConsultaUsuario
  Esquema del escenario: Consulta de usuarios
    Dado consulta servicio de creacion usaurio
    Cuando consulta el usuario
      | <username> |
    Entonces valida la consulta del usuario

    Ejemplos:
      | username |
      | bledezma |





