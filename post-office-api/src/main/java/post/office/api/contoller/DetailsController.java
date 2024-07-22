package post.office.api.contoller;

import post.office.api.domain.PostDetails;
import post.office.api.service.DetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/office/details")
@RequiredArgsConstructor
public class DetailsController {
    private final DetailsService detailsService;
    @GetMapping("/{postId}")
    public PostDetails getPostWithDetails (@PathVariable String postId) {
        return detailsService.getPostWithDetails(postId);
    }
}
