package com.jeremygagner.williamboivin.voteservice.view;

import com.jeremygagner.williamboivin.voteservice.repository.I_SQL_Connector;
import com.jeremygagner.williamboivin.voteservice.repository.SQL_Connector;

public class VoteServiceAppDriver {
    public static void main(String[] args) {
        I_SQL_Connector dao = new SQL_Connector();
    }
}
