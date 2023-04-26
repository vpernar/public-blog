package rs.raf.domaci5.repositories;

import rs.raf.domaci5.entities.Comment;
import rs.raf.domaci5.entities.Post;

import java.util.List;

public interface PostRepository {
    Post save(Post post);

    List<Post> getAllPosts();

    Post getPostById(long id);

    void addComment(long postId, Comment comment);

    List<Comment> getPostComments(long postId);
}
