package com.cric.apis.services;


import com.cric.apis.entities.Match;

import java.util.List;

//interface because loose coupling
public interface MatchService {
    //get all matches
    List<Match> getLiveMatchScores();
    List<List<String>> getCWC2024PointTable();
    List<Match> getAllMatches();

}
