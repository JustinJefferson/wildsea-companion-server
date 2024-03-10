package models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import models.dataModels.BackgroundData;

import java.util.List;

public class Character extends GenericModel {
    private String displayName;
    // User id
    private BackgroundData bloodline;
    private String customBloodline;
    private BackgroundData origin;
    private String customOrigin;
    private BackgroundData post;
    private String customPost;

    // Milestones
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "character")
    private List<Milestone> milestones;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "character")
    private List<Drive> drives;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "character")
    private List<Edge> edges;

    // Skills, Languages
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "character")
    private List<RankedAbility> rankedAbilities;

    // Resources
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "character")
    private List<ResourceItem> resourceItems;

    // Mires, Aspects, Temporary Tracks
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "character")
    private List<Track> tracks;
}
