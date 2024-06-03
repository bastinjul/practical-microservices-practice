package be.julienbastin.pract.microserv.mappers;

import be.julienbastin.pract.microserv.generated.dto.VideoDto;
import be.julienbastin.pract.microserv.models.Video;
import org.mapstruct.Mapper;
import reactor.core.publisher.Mono;

@Mapper
public interface VideoMapper {

    default Mono<Video> dtoToEntity(Mono<VideoDto> dto) {
        return dto.map(this::dtoToEntity);
    }

    Video dtoToEntity(VideoDto dto);

    default Mono<VideoDto> entityToDto(Mono<Video> entity) {
        return entity.map(this::entityToDto);
    }

    VideoDto entityToDto(Video entity);
}
