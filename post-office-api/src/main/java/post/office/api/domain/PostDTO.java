package kz.dar.university.post.office.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostDTO {
    private String postId;
    private String clientId;
    private String postRecipientId;
    private String postItem;
    private String status;
}
