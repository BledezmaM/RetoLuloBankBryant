#language: es

Característica: Creacion de usuarios por servicios

  @CreacionUsuario
  Esquema del escenario: Creacion de usuarios
    Dado consulta servicio de creacion usaurio
    Cuando se crea el usuario
      | <id> | <username> | <firstName> | <lastName> | <email> | <password> | <phone> | <userStatus> |
    Entonces valida la creacion del usuario

    Ejemplos:
      | id | username | firstName | lastName | email            | password | phone      | userStatus |
      | 1  | bledezma | Bryant    | Ledezma  | prueba@gmail.com | 123456   | 3111112233 | 1          |





