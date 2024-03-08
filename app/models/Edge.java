package models;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import models.dataModels.EdgeData;

public class Edge extends GenericModel {
    private EdgeData data;

    @ManyToOne
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;
    private Boolean isSelected;

    public EdgeData getData() {
        return data;
    }

    public void setData(EdgeData data) {
        this.data = data;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Boolean getSelected() {
        return isSelected;
    }

    public void setSelected(Boolean selected) {
        isSelected = selected;
    }
}
