package com.cricpulse.controller;
import java.util.List;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricpulse.entities.Match;
import com.cricpulse.services.MatchService;


@RestController
@AllArgsConstructor
@RequestMapping("/match")
@CrossOrigin("*")
public class MyController {

    private final MatchService matchService;

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){
        return new ResponseEntity<>(this.matchService.getLiveMatches(),HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
    }
    @GetMapping("/points-table")
    public ResponseEntity<?> getPointsTable(){
        return new ResponseEntity<>(this.matchService.getPointsTable(),HttpStatus.OK);
    }
}
