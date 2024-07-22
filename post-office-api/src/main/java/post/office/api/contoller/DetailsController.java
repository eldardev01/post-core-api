package kz.dar.university.post.office.api.contoller;

import kz.dar.university.post.office.api.domain.PostDetails;
import kz.dar.university.post.office.api.feign.ClientF;
import kz.dar.university.post.office.api.feign.PostF;
import kz.dar.university.post.office.api.service.DetailsService;
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
