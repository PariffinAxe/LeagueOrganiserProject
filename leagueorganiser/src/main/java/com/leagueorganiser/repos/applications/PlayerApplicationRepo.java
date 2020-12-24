package com.leagueorganiser.repos.applications;

import com.leagueorganiser.models.applications.PlayerApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerApplicationRepo extends JpaRepository<PlayerApplication, Long> {
}
