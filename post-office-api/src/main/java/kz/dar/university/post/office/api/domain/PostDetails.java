package kz.dar.university.post.office.api.domain;

import java.util.List;

public class PostDetails {
    private String postId;
    private List<ClientDTO> client;
    private List<PostDTO> receiver;
    private String postItem;
    private String status;
}
