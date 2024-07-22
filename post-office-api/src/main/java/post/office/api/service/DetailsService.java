package post.office.api.service;

import post.office.api.domain.ClientDTO;
import post.office.api.domain.PostDTO;
import post.office.api.domain.PostDetails;
import post.office.api.feign.ClientF;
import post.office.api.feign.PostF;
import post.office.api.util.PostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DetailsService implements Detail{
    private final ClientF clientF;
    private final PostF postF;
    private final PostMapper postMapper;
    List<String> clients = new ArrayList();
    private static final HashMap<String, PostDetails> postDetailsMap = new HashMap<>();
    {
        clients.add("123");
        clients.add("1234");
    }

    public PostDetails getPostWithDetails (String postId) {
        PostDTO postDTO = postF.getPostById(postId);
        ClientDTO client = clientF.getClientById(postDTO.getClientId());
        PostDetails details = postMapper.map(postDTO);
        details.setClient(client);
        return details;
    }
}
