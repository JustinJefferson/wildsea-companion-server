package models;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import models.dataModels.RankedAbilityData;

public class RankedAbility extends GenericModel {
    private RankedAbilityData data;
    @ManyToOne
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;
    private Integer rank;

    public RankedAbilityData getData() {
        return data;
    }

    public void setData(RankedAbilityData data) {
        this.data = data;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
}
