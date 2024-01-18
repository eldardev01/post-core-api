package daruniversity.demo.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostModel {
    private String postId;
    @NotNull(message = "Id can not be empty")
    private String clientId;
    @NotNull(message = "Recipient Id can not be empty")
    private String postRecipientId;
    @NotNull(message = "Post item can not be empty")
    private String postItem;
    private String status;
}
