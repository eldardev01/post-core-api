package post.office.api.util;

import post.office.api.domain.PostDTO;
import post.office.api.domain.PostDetails;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface PostMapper {
    PostDetails map(PostDTO postDTO);
}