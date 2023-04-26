package rs.raf.domaci5.services;

import rs.raf.domaci5.dto.CommentDto;
import rs.raf.domaci5.dto.PostDto;
import rs.raf.domaci5.entities.Comment;
import rs.raf.domaci5.entities.Post;
import rs.raf.domaci5.repositories.PostRepository;

import javax.inject.Inject;
import java.util.List;

public class PostServiceImpl implements PostService{
    @Inject
    private PostRepository postRepository;

    public PostServiceImpl() {
        System.out.println(this);
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.getAllPosts();
    }

    @Override
    public Post getPostById(long id) {
        return postRepository.getPostById(id);
    }

    @Override
    public Post addPost(PostDto postDto) {
        Post post = new Post(postDto.getAuthor(), postDto.getTitle(), postDto.getContent());
        return postRepository.save(post);
    }

    @Override
    public Comment addComment(long id, CommentDto commentDto) {
        Comment comment = new Comment(commentDto.getAuthor(), commentDto.getComment());
        postRepository.addComment(id, comment);
        return comment;
    }
}
