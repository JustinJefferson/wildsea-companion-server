package models;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Milestone extends GenericModel {
    public enum Type {
        MAJOR,
        MINOR,
        EXTRA
    }

    private String description;
    private Type type;

    @ManyToOne
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

}
