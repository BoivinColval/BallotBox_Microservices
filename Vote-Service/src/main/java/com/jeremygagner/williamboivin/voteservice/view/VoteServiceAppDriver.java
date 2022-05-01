package com.jeremygagner.williamboivin.voteservice.view;

import com.jeremygagner.williamboivin.voteservice.repository.I_SomeeSQL_Connector;
import com.jeremygagner.williamboivin.voteservice.repository.SomeeSQL_Connector;

public class VoteServiceAppDriver {
    public static void main(String[] args) {
        I_SomeeSQL_Connector dao = new SomeeSQL_Connector();
    }
}
