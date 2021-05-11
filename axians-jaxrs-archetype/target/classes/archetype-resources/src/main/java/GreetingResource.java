package ${package};

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("greeting")
public class GreetingResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get() {
        return Response.ok(String.format(" Ola Mundo !!! ")).build();
    }
    
    @GET
    @Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getWithParam(@PathParam("name") String name) {
        return Response.ok(String.format(" Ola %s !!! ",  name)).build();
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getWith(@QueryParam("name") String name) {
        return Response.ok(String.format(" Ola %s !!! ",  name)).build();
    }

}