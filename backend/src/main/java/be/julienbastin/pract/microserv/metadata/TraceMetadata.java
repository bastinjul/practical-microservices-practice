package be.julienbastin.pract.microserv.metadata;

import java.util.UUID;

public record TraceMetadata(UUID traceId, UUID userId) implements Metadata {
}
