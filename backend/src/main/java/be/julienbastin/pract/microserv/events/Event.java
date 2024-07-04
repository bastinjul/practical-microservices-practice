package be.julienbastin.pract.microserv.events;

import be.julienbastin.pract.microserv.data.Data;
import be.julienbastin.pract.microserv.metadata.Metadata;

import java.util.UUID;

public abstract class Event {

    private final UUID id;
    private final String type;
    private final Metadata metadata;
    private final Data data;

    protected Event(final String type, Metadata metadata, Data data) {
        this.metadata = metadata;
        this.data = data;
        this.id = UUID.randomUUID();
        this.type = type;
    }

    public UUID getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public Data getData() {
        return data;
    }
}
