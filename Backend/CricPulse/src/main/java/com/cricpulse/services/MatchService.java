package com.cricpulse.services;

import java.util.List;

import com.cricpulse.entities.Match;

public interface MatchService {

    //get all matches
    List<Match> getAllMatches();

    //get live matches
    List<Match> getLiveMatches();
    //get points table

    List<List<String>> getPointsTable();

}
