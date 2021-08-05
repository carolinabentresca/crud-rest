/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerRest;

import Modelo.usuario;
import Modelo.usuarioDao;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author EXO
 */
@Path("usuario")
public class UsuarioResource {

    @Context
    private UriInfo context;
    usuarioDao dao = new usuarioDao();

    public UsuarioResource() {
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public usuario addUsuario(usuario us) {
        dao.insertar(us);
        return us;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<usuario> findAllUsuarios() {
        List<usuario> lista = dao.listar();
        return lista;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public usuario getUsuario(@PathParam("id") int id) {
        return dao.getbyId(id);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public usuario updateUsuario(@PathParam("id") int id, usuario us) {
        us.setId(id);
        dao.modificar(us);
        return us;
    }

    @DELETE
    @Path("/{id}")
    public void deleteUsuario(@PathParam("id") int id) {
        dao.eliminar(id);
    }
}
