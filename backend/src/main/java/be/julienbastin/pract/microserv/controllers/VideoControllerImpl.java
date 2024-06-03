package be.julienbastin.pract.microserv.controllers;

import be.julienbastin.pract.microserv.generated.api.VideoController;
import be.julienbastin.pract.microserv.generated.dto.VideoDto;
import be.julienbastin.pract.microserv.mappers.VideoMapper;
import be.julienbastin.pract.microserv.repositories.VideoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@RestController
public class VideoControllerImpl implements VideoController {

    private final VideoRepository videoRepository;
    private final VideoMapper videoMapper;

    public VideoControllerImpl(VideoRepository videoRepository, VideoMapper videoMapper) {
        this.videoRepository = videoRepository;
        this.videoMapper = videoMapper;
    }

    @Override
    public Mono<ResponseEntity<VideoDto>> newVideo(Mono<VideoDto> videoDto, ServerWebExchange exchange) throws Exception {
        return videoDto
                .map(videoMapper::dtoToEntity)
                .flatMap(videoRepository::save)
                .map(videoMapper::entityToDto)
                .map(ResponseEntity::ok);
    }

    @GetMapping("/test")
    public Mono<String> test() {
        return Mono.just("test");
    }
}
