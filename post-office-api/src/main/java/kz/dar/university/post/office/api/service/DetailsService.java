package kz.dar.university.post.office.api.service;

import kz.dar.university.post.office.api.domain.ClientDTO;
import kz.dar.university.post.office.api.domain.PostDetails;
import kz.dar.university.post.office.api.feign.ClientF;
import kz.dar.university.post.office.api.feign.PostF;
import kz.dar.university.post.office.api.util.PostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DetailsService {
    private final ClientF clientF;
    private final PostF postF;
    private final PostMapper postMapper;
}
