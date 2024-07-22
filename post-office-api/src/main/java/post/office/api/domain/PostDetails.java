package post.office.api.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostDetails {
    private String postId;
    private ClientDTO client;
    private String postItem;
    private String status;
}
