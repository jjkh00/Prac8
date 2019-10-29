/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author JJ
 */
@Path("calculatews")
public class AddNum {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AddNum
     */
    public AddNum() {
    }

    /**
     * Retrieves representation of an instance of services.AddNum
     * @param num1
     * @param num2
     * @return an instance of java.lang.String
     */
    @GET
    @Path("add")
    @Produces(MediaType.APPLICATION_JSON)
    public String addNum(@QueryParam("num1") int num1,@QueryParam("num2") int num2) {
        //TODO return proper representation object
        return "the sum of "+num1+" and "+num2+" is: "+(num1+num2);
    }
    @GET
    @Path("sub")
    @Produces(MediaType.APPLICATION_JSON)
    public String subNum(@QueryParam("num1") int num1,@QueryParam("num2") int num2) {
        //TODO return proper representation object
        return "the subtraction of "+num1+" and "+num2+" is: "+(num1-num2);
    }
    @GET
    @Path("muliply")
    @Produces(MediaType.APPLICATION_JSON)
    public String mulNum(@QueryParam("num1") int num1,@QueryParam("num2") int num2) {
        //TODO return proper representation object
        return "the multiplication of "+num1+" and "+num2+" is: "+(num1*num2);
    }
    @GET
    @Path("divide")
    @Produces(MediaType.APPLICATION_JSON)
    public String divNum(@QueryParam("num1") int num1,@QueryParam("num2") int num2) {
        //TODO return proper representation object
        return "the division of "+num1+" and "+num2+" is: "+(num1/num2);
    }
    
    @GET
    @Path("Calculate")
    @Produces(MediaType.APPLICATION_JSON)
    public Response calculate(@QueryParam("num1") int num1,@QueryParam("num2") int num2, @QueryParam("operator") String op) {
        int result=0;
        switch(op){
            case "add": result=num1+num2;
            break;
            case "subtract": result=num1-num2;
            break;
            case "multiply": result=num1*num2;
            break;
            case "divide": result=num1/num2;
            break;
            default: result=0;
            break;
                   
        }
        return Response
                .status(Response.Status.OK)
                .entity(Integer.toString(result))
                .build();
    }
    /**
     * PUT method for updating or creating an instance of AddNum
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
