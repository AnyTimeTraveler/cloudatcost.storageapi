package org.simonscode.cloudatcost.storageapi;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

import static javax.ws.rs.core.MediaType.*;

public class API {
    @GET
    @Path("/list")
    @Produces({APPLICATION_JSON, APPLICATION_XML, TEXT_PLAIN})
    public Response list(@CookieParam("key") String apiKey) {
        List<File> output = new LinkedList<>();
        return Response.ok(output).build();
    }

    @POST
    @Path("/")
    @Consumes(MULTIPART_FORM_DATA)
    public Response put(@CookieParam("key") String apiKey,
                        @FormParam("delete_after_days") int delete_after_days,
                        @FormParam("delete_after_downloads") int delete_after_downloads,
                        @FormParam("password") String password,
                        @FormDataParam("file") InputStream fileInputStream,
                        @FormDataParam("file") FormDataContentDisposition fileMetaData) {
        return Response.ok().build();
    }

    @GET
    @Path("/{fileId}/")
    @Produces({APPLICATION_JSON, APPLICATION_XML, TEXT_PLAIN})
    public Response get(@CookieParam("key") String apiKey, long fileId) {
        File output = new File();

        return Response.ok(output).build();
    }

    @DELETE
    @Path("/{fileId}")
    public Response delete(@CookieParam("key") String apiKey, long fileId) {
        return Response.ok().build();
    }
}
