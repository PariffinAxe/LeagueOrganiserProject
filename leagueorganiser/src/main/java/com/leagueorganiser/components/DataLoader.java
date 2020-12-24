package com.leagueorganiser.components;

import com.leagueorganiser.models.applications.Event;
import com.leagueorganiser.models.applications.PlayerApplication;
import com.leagueorganiser.models.applications.TeamApplication;
import com.leagueorganiser.repos.applications.EventRepo;
import com.leagueorganiser.repos.applications.PlayerApplicationRepo;
import com.leagueorganiser.repos.applications.TeamApplicationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

  @Autowired
  TeamApplicationRepo teamApplicationRepo;

  @Autowired
  PlayerApplicationRepo playerApplicationRepo;

  @Autowired
  EventRepo eventRepo;

  public DataLoader(){}

  public void run(ApplicationArguments args){

    TeamApplication teamApplication = new TeamApplication("GKC", "Div 1", null, "#0ABD10", "#6B00B3");
    teamApplicationRepo.save(teamApplication);

    PlayerApplication playerApplication = new PlayerApplication("Michael", 1, "10816", teamApplication);
    playerApplicationRepo.save(playerApplication);

    PlayerApplication playerApplication1 = new PlayerApplication("Paul", 2, "9999", teamApplication);
    playerApplicationRepo.save(playerApplication1);

    Event event = new Event("Div 1");
    eventRepo.save(event);

    Event event1 = new Event("Div 2");
    eventRepo.save(event1);

    Event event2 = new Event("Div 3");
    eventRepo.save(event2);

  }
}
