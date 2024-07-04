package be.julienbastin.pract.microserv.data;

import java.util.UUID;

public record VideoViewedData(UUID userId, UUID videoId) implements Data {
}
