package be.julienbastin.pract.microserv.repositories;

import be.julienbastin.pract.microserv.events.Event;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

import java.util.UUID;

public interface EventRepository extends R2dbcRepository<Event, UUID> {
}
