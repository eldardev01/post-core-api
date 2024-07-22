package post.office.api.contoller;

import post.office.api.domain.PostDTO;
import post.office.api.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public List<PostDTO> getAllPost() {
        return postService.getAllPosts();
    }

    @GetMapping("/{postId}")
    public PostDTO getPostById(@PathVariable String postId) {
        return postService.getPostById(postId);
    }
}