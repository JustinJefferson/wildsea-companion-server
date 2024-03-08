package models;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class ResourceItem extends GenericModel {
    public enum Type {
        SALVAGE,
        SPECIMEN,
        WHISPER,
        CHART
    }

    private String displayName;
    private Type type;

    @ManyToOne
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}
