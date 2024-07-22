package kz.dar.university.post.office.api.service;

import kz.dar.university.post.office.api.domain.PostDetails;

public interface Detail {
    public PostDetails getPostWithDetails (String postId);
}
