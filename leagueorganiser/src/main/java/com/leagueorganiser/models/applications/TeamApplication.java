package com.leagueorganiser.models.applications;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "team_applications")
public class TeamApplication {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "event")
  private String event;

  @Column(name = "paid")
  private Boolean paid;

  @Column(name = "notes")
  private String notes;

  @Column(name = "home_colour")
  private String homeColour;

  @Column(name = "away_colour")
  private String awayColour;

  @JsonIgnoreProperties({"teamApplication"})
  @OneToMany(mappedBy = "teamApplication", cascade = CascadeType.ALL)
  private List<PlayerApplication> playerApplications;

  public TeamApplication(String name, String event, String notes, String homeColour, String awayColour) {
    this.name = name;
    this.event = event;
    this.paid = false;
    this.notes = notes;
    this.homeColour = homeColour;
    this.awayColour = awayColour;
    this.playerApplications = new ArrayList<PlayerApplication>();
  }

  public TeamApplication() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public Boolean getPaid() {
    return paid;
  }

  public void setPaid(Boolean paid) {
    this.paid = paid;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public List<PlayerApplication> getPlayerApplications() {
    return playerApplications;
  }

  public void setPlayerApplications(List<PlayerApplication> playerApplications) {
    this.playerApplications = playerApplications;
  }

  public String getHomeColour() {
    return homeColour;
  }

  public void setHomeColour(String homeColour) {
    this.homeColour = homeColour;
  }

  public String getAwayColour() {
    return awayColour;
  }

  public void setAwayColour(String awayColour) {
    this.awayColour = awayColour;
  }
}
