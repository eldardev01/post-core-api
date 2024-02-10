package kz.dar.university.post.office.api.feign;

import kz.dar.university.post.office.api.domain.PostResponse;
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
    List<PostResponse> getAllPosts();

    @GetMapping("post/{postId}")
    public PostResponse getPostById(@PathVariable String postId);

}
