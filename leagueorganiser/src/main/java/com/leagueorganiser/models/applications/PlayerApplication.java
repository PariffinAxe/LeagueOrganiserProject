package com.leagueorganiser.models.applications;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "player_applications")
public class PlayerApplication {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "team_number")
  private int teamNumber;

  @Column(name = "sca_number")
  private String scaNumber;

  @JsonIgnoreProperties({"playerApplications"})
  @ManyToOne
  @JoinColumn(name = "teamApplication_id", nullable = false)
  private TeamApplication teamApplication;

  public PlayerApplication(String name, int teamNumber, String scaNumber, TeamApplication teamApplication) {
    this.name = name;
    this.teamNumber = teamNumber;
    this.scaNumber = scaNumber;
    this.teamApplication = teamApplication;
  }

  public PlayerApplication() {
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

  public int getTeamNumber() {
    return teamNumber;
  }

  public void setTeamNumber(int teamNumber) {
    this.teamNumber = teamNumber;
  }

  public String getScaNumber() {
    return scaNumber;
  }

  public void setScaNumber(String scaNumber) {
    this.scaNumber = scaNumber;
  }

  public TeamApplication getTeamApplication() {
    return teamApplication;
  }

  public void setTeamApplication(TeamApplication teamApplication) {
    this.teamApplication = teamApplication;
  }
}
