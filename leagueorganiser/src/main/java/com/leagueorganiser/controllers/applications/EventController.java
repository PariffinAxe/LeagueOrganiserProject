package com.leagueorganiser.controllers.applications;

import com.leagueorganiser.models.applications.Event;
import com.leagueorganiser.repos.applications.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {

  @Autowired
  EventRepo eventRepo;

  @GetMapping("/events")
  public ResponseEntity<List<Event>> getAllEvents(){
    return new ResponseEntity<>(eventRepo.findAll(), HttpStatus.OK);
  }

  @PostMapping("/events")
  public ResponseEntity<Event> postEvent(@RequestBody Event event){
    eventRepo.save(event);
    return new ResponseEntity<>(event, HttpStatus.CREATED);
  }

  @DeleteMapping("/events/{id}")
  public ResponseEntity<Event> deleteEvent(@PathVariable Long id){
    Event found = eventRepo.getOne(id);
    eventRepo.delete(found);
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

}
