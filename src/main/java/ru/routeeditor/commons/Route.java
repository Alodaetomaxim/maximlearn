package ru.routeeditor.commons;

import java.time.Instant;

/**
 * Created by mark on 07.04.17.
 */
public class Route {
    private long id;
    private String name;
    private String description;
    private Instant timestamp;
    private RouteTypes type;

    public Route(long id, String name, String description, Instant timestamp, RouteTypes type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.timestamp = timestamp;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public RouteTypes getType() {
        return type;
    }

    public void setType(RouteTypes type) {
        this.type = type;
    }
}
