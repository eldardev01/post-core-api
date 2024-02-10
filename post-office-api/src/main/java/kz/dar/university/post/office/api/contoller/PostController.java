package kz.dar.university.post.office.api.contoller;

import kz.dar.university.post.office.api.domain.PostResponse;
import kz.dar.university.post.office.api.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.ResponseCache;
import java.util.List;

@RestController
@RequestMapping("/office/post")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;
    @PostMapping
    public ResponseEntity<String> checkPost() {
        return postService.checkPost();
    }

    @GetMapping
    public List<PostResponse> getAllPost() {
        return postService.getAllPosts();
    }

    @GetMapping
    public PostResponse getPostById(@PathVariable String postId) {
        return postService.getPostById(postId);
    }
}
