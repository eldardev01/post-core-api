package daruniversity.demo.service;

import daruniversity.demo.model.PostModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class PostServiceImpl implements PostService {
    private static final HashMap<String, PostModel> postMap = new HashMap<>();

    static {
        PostModel postModel1 = new PostModel(UUID.randomUUID().toString(), "015",
                "501", "John", "Completed");
        PostModel postModel2 = new PostModel(UUID.randomUUID().toString(), "016",
                "801", "David", "Completed");
        PostModel postModel3 = new PostModel(UUID.randomUUID().toString(), "017",
                "701", "Eldar", "Completed");
        postMap.put(UUID.randomUUID().toString(), postModel1);
        postMap.put(UUID.randomUUID().toString(), postModel2);
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
