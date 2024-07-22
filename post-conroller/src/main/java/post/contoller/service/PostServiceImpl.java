package post.contoller.service;

import post.contoller.model.PostModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class PostServiceImpl implements PostService {
    private static final HashMap<String, PostModel> postMap = new HashMap<>();

    static {
        PostModel postModel1 = new PostModel("321", "123",
                "501", "Computer", "Completed");
        PostModel postModel2 = new PostModel("4321", "1234",
                "801", "Mac", "Completed");
        PostModel postModel3 = new PostModel(UUID.randomUUID().toString(), "017",
                "701", "Bike", "Completed");
        postMap.put(postModel1.getPostId(), postModel1);
        postMap.put(postModel2.getPostId(), postModel2);
        postMap.put(UUID.randomUUID().toString(), postModel3);
    }

    @Override
    public void createPost(PostModel postModel) {
        postModel.setPostId(UUID.randomUUID().toString());
        postMap.put(postModel.getPostId(), postModel);
    }

    @Override
    public List<PostModel> getAllPosts() {
        return new ArrayList<>(postMap.values());
    }

    @Override
    public PostModel getPostById(String postId) {
        return postMap.get(postId);
    }

    @Override
    public void updatePost(String postId, PostModel postModel) {
        if (postMap.containsKey(postId)) {
            postModel.setPostId(postId);
            postMap.put(postId, postModel);
        }
    }

    @Override
    public void deletePostById(String postId) {
        postMap.remove(postId);
    }

}
