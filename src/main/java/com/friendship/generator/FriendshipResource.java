package com.friendship.generator;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Path("/api")
public class FriendshipResource {

    @Inject
    FriendshipService service;

    @GET
    @Path("/friend")
    public Friend getFriend() {
        return service.generate();
    }
}
