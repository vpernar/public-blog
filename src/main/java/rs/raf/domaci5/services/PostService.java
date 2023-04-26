package rs.raf.domaci5.services;


import rs.raf.domaci5.dto.CommentDto;
import rs.raf.domaci5.dto.PostDto;
import rs.raf.domaci5.entities.Comment;
import rs.raf.domaci5.entities.Post;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();

    Post getPostById(long id);

    Post addPost(PostDto post);

    Comment addComment(long id, CommentDto comment);
}
