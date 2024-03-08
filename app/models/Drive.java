package models;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Drive extends GenericModel {
    private String description;

    @ManyToOne
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
