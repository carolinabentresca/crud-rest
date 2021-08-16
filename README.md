# crud-rest

# TEMA : Servicio REST

#PROYECTO JAVA WEB : Web Application

#PAQUETE "Modelo" :  

  - CLASE "Conexion" :   Conexion a la base de datos "mybd", mediante JDBC.
  
  - CLASE "usuario" :    Clase entidad, de la tabla "usuario".
  
  - CLASE  "usuarioDao" :    Clase de métodos CRUD, ("insertar","modificar",
           "eliminar", "listar","getbyId").
           
 #PAQUETE "SerRest" : 
  
  - CLASE "ApplicationConfig" :   Se crea por defecto, genera un 
          ApplicationPath("webresources").
          
  - CLASE "UsuarioResource" :   Clase compuesta por los métodos del Servicio 
          (@POST,@GET,@PUT,@DELETE) y genera un @Path("usuario").

