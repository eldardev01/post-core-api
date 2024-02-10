package kz.dar.university.post.office.api.service;

import kz.dar.university.post.office.api.domain.PostResponse;
import kz.dar.university.post.office.api.feign.PostF;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostF postF;

    public ResponseEntity<String> checkPost() {
        return  postF.checkPost();
    }

    public List<PostResponse> getAllPosts() {
        return postF.getAllPosts();
    }

    public PostResponse getPostById(String postId) {
        return postF.getPostById(postId);
    }
}
