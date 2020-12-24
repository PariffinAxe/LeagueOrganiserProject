package com.leagueorganiser.controllers.applications;

import com.leagueorganiser.models.applications.TeamApplication;
import com.leagueorganiser.repos.applications.TeamApplicationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamApplicationController {

  @Autowired
  TeamApplicationRepo teamApplicationRepo;

  @GetMapping("/team_applications")
  public ResponseEntity<List<TeamApplication>> getAllTeamApplications(){
    return new ResponseEntity<>(teamApplicationRepo.findAll(), HttpStatus.OK);
  }

  @PostMapping("/team_applications")
  public ResponseEntity<TeamApplication> postTeamApplication(@RequestBody TeamApplication teamApplication){
    teamApplicationRepo.save(teamApplication);
    return new ResponseEntity<>(teamApplication, HttpStatus.CREATED);
  }

  @DeleteMapping("/team_applications/{id}")
  public ResponseEntity<TeamApplication> deleteTeamApplication(@PathVariable Long id){
    TeamApplication found = teamApplicationRepo.getOne(id);
    teamApplicationRepo.delete(found);
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

}
