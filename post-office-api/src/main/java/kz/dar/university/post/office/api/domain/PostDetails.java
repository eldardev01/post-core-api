package kz.dar.university.post.office.api.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostDetails {
    private String postId;
    private List<ClientDTO> client;
    private String postItem;
    private String status;
}
