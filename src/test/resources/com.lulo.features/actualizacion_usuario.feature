#language: es

Característica: Actualizar usuario por servicios

  @ActualizacionUsuario
  Esquema del escenario: Actualizacion de usuarios
    Dado consulta servicio de creacion usaurio
    Cuando actualiza el usuario
      | <id> | <username> | <firstName> | <lastName> | <email> | <password> | <phone> | <userStatus> |
    Entonces valida la actualizacion del usuario

    Ejemplos:
      | id | username  | firstName | lastName | email             | password  | phone      | userStatus |
      | 1  | bledezmam | Fredy     | Marin    | prueba1@gmail.com | 123456789 | 3211112233 | 1          |





