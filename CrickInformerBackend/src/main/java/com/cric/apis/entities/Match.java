package com.cric.apis.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="crick_match")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;

    private String teamHeading;

    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlTeam;

    private String bowlTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;

    @Enumerated
    private MatchStatus status;

    private Date date = new Date();

    //set the match status according to textComplete

    public void setMatchStatus(){
        if(textComplete.isBlank()){
            this.status= MatchStatus.LIVE;
        }
        else{
            this.status= MatchStatus.COMPLETED;
        }
    }
}
