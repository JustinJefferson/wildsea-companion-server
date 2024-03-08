package models;

public class Track extends GenericModel {
    public enum Type {
        MIRE,
        TRAIT,
        GEAR,
        COMPANION,
        BENEFIT,
        INJURY,
        TRACK
    }

    private String displayName;
    private Type type;
    private Integer length;
    private Integer marks;
    private Integer[] burnMarks;
    private String details;
}
