package com.leagueorganiser.repos.applications;

import com.leagueorganiser.models.applications.TeamApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamApplicationRepo extends JpaRepository<TeamApplication, Long> {
}
