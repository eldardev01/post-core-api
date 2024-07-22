package post.office.api.service;

import post.office.api.domain.PostDetails;

public interface Detail {
    public PostDetails getPostWithDetails (String postId);
}
