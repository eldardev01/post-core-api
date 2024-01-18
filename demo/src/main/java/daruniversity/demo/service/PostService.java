package daruniversity.demo.service;

import daruniversity.demo.model.PostModel;

import java.util.List;

public interface PostService {
    void createPost(PostModel postModel);
    List<PostModel> getAllPosts();
    PostModel getPostById(String postId);
    void updatePost(String postId, PostModel postModel);
    void deletePostById(String postId);
}
