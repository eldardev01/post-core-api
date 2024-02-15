package kz.dar.university.post.office.api.service;

import kz.dar.university.post.office.api.domain.ClientDTO;
import kz.dar.university.post.office.api.domain.PostDTO;
import kz.dar.university.post.office.api.domain.PostDetails;
import kz.dar.university.post.office.api.feign.ClientF;
import kz.dar.university.post.office.api.feign.PostF;
import kz.dar.university.post.office.api.util.PostMapper;
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
        List<String> clientsIds = clients;
        List<ClientDTO> clietsIdList = clientF.getClientByList(clientsIds);
        PostDTO postDTO = postF.getPostById(postId);
        PostDetails details = postMapper.map(postDTO);
        details.setClient(clietsIdList);
        return details;
    }
}
