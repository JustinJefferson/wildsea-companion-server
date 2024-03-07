package models.dataModels;

import models.GenericModel;

public class BackgroundData extends GenericModel {
    public enum Type {
        BLOODLINE,
        ORIGIN,
        POST
    }

    private String displayName;
    private Type type;
    private String description;
}
