package com.jeremygagner.williamboivin.forumservice.view;

import com.jeremygagner.williamboivin.forumservice.repository.Atlas_Mongodb_Connector;
import com.jeremygagner.williamboivin.forumservice.repository.I_Mongodb_Connector;

public class ForumServiceAppDriver {

    public static void main(String[] args) {
        I_Mongodb_Connector dao = new Atlas_Mongodb_Connector();
    }
}
