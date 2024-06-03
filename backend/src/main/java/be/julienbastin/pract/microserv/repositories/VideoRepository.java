package be.julienbastin.pract.microserv.repositories;

import be.julienbastin.pract.microserv.models.Video;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface VideoRepository extends R2dbcRepository<Video, Long> {
}
