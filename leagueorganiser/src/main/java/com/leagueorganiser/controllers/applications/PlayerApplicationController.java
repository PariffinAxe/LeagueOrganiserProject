package com.leagueorganiser.controllers.applications;


import com.leagueorganiser.models.applications.PlayerApplication;
import com.leagueorganiser.repos.applications.PlayerApplicationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerApplicationController {

  @Autowired
  PlayerApplicationRepo playerApplicationRepo;

  @GetMapping("/player_applications")
  public ResponseEntity<List<PlayerApplication>> getAllPlayerApplications(){
    return new ResponseEntity<>(playerApplicationRepo.findAll(), HttpStatus.OK);
  }

  @PostMapping("/player_applications")
  public ResponseEntity<PlayerApplication> postPlayerApplication(@RequestBody PlayerApplication playerApplication){
    playerApplicationRepo.save(playerApplication);
    return new ResponseEntity<>(playerApplication, HttpStatus.CREATED);
  }

}
