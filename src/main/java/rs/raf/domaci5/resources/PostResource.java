package rs.raf.domaci5.resources;


import rs.raf.domaci5.dto.CommentDto;
import rs.raf.domaci5.dto.PostDto;
import rs.raf.domaci5.services.PostService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/posts")
public class PostResource {
    @Inject
    private PostService postService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPosts() {
        return Response.ok(postService.getAllPosts()).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPost(@PathParam("id") long id) {
        return Response.ok(postService.getPostById(id)).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createNewPost(PostDto post) {
        return Response.ok(postService.addPost(post)).build();
    }

    @POST
    @Path("/{id}/comment")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createNewComment(@PathParam("id") long id, CommentDto comment) {
        return Response.ok(postService.addComment(id, comment)).build();
    }
}
