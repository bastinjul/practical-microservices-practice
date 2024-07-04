package be.julienbastin.pract.microserv.events;

import be.julienbastin.pract.microserv.data.VideoViewedData;
import be.julienbastin.pract.microserv.metadata.TraceMetadata;

import java.util.UUID;

public class VideoViewedEvent extends Event {
    public VideoViewedEvent(UUID traceId, UUID videoId, UUID userId) {
        super("VideoViewed", new TraceMetadata(traceId, userId), new VideoViewedData(videoId, userId));
    }
}
