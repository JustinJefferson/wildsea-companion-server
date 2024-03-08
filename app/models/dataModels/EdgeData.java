package models.dataModels;

import models.GenericModel;

public class EdgeData extends GenericModel {
    private String display_name;
    private String description;

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
