package kz.dar.university.post.office.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostResponse {
    String postId;
    ClientResponse client;
    ClientResponse receiver;
    String postItem;
    String status;
}
