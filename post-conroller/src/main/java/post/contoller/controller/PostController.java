package post.contoller.controller;

import post.contoller.model.PostModel;
import post.contoller.service.PostService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping("/check")
    public ResponseEntity<String> checkPost() {
        return new ResponseEntity<String>("post-core-api is working", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> sendPost(@Valid @RequestBody PostModel postModel) {
        postService.createPost(postModel);
        return new ResponseEntity<String>("Succesfully send", HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<PostModel> getAllPosts () {
        return postService.getAllPosts();
    }

    @GetMapping("{postId}")
    public PostModel getPostById(@PathVariable String postId) {
        return postService.getPostById(postId);
    }

    @PutMapping("{postId}")
    public ResponseEntity<String> updatePostById(@PathVariable String postId, @RequestBody PostModel postModel) {
        postService.updatePost(postId, postModel);
        return new ResponseEntity<String>("Succesfully update", HttpStatus.OK);
    }

    @DeleteMapping("{postId}")
    public ResponseEntity<String> deletePostById (@PathVariable String postId) {
        postService.deletePostById(postId);
        return new ResponseEntity<String>("Succesfully delete", HttpStatus.OK);
    }
}
