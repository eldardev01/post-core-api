package kz.dar.university.post.office.api.util;

import kz.dar.university.post.office.api.domain.ClientDTO;
import kz.dar.university.post.office.api.domain.PostDTO;
import kz.dar.university.post.office.api.domain.PostDetails;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface PostMapper {
    @Mapping(
            target = "client",
            source = "clientDTO"
    )
    @Mapping(
            target = "receiver",
            source = "postDTO"
    )
    PostDetails map(ClientDTO clientDTO, PostDTO postDTO);
}
