package com.leagueorganiser;

import com.leagueorganiser.models.applications.Event;
import com.leagueorganiser.models.applications.PlayerApplication;
import com.leagueorganiser.models.applications.TeamApplication;
import com.leagueorganiser.repos.applications.EventRepo;
import com.leagueorganiser.repos.applications.PlayerApplicationRepo;
import com.leagueorganiser.repos.applications.TeamApplicationRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LeagueorganiserApplicationTests {

	@Autowired
	TeamApplicationRepo teamApplicationRepo;

	@Autowired
	PlayerApplicationRepo playerApplicationRepo;

	@Autowired
	EventRepo eventRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void addThings(){

		TeamApplication teamApplication = new TeamApplication("GKC", "Div 1", null, "#000000", "#FFFFFF");
		teamApplicationRepo.save(teamApplication);

		PlayerApplication playerApplication = new PlayerApplication("Michael", 1, "10816", teamApplication);
		playerApplicationRepo.save(playerApplication);

		PlayerApplication playerApplication1 = new PlayerApplication("Paul", 2, "9999", teamApplication);
		playerApplicationRepo.save(playerApplication1);

		Event event = new Event("Div 1");
		eventRepo.save(event);

	}

}
