package post.office.api.feign;

import post.office.api.domain.PostDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "post-core-api")
public interface PostF {

    @PostMapping("/post/check")
    ResponseEntity<String> checkPost();

    @GetMapping("post/all")
    List<PostDTO> getAllPosts();

    @GetMapping("post/{postId}")
    public PostDTO getPostById(@PathVariable String postId);

}
