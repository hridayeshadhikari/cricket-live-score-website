package com.cricpulse.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricpulse.entities.Match;

public interface MatchRepository extends JpaRepository<Match,Integer>{

    // configuration to fetch a match from the database
    //by providing teamHeading
    Optional<Match> findByTeamHeading(String teamHeading);
}
