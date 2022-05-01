package com.jeremygagner.williamboivin.forumservice.view;

import com.jeremygagner.williamboivin.forumservice.model.Post;
import com.jeremygagner.williamboivin.forumservice.repository.Atlas_Mongodb_Connector;
import com.jeremygagner.williamboivin.forumservice.repository.IDAO;
import com.jeremygagner.williamboivin.forumservice.repository.I_Mongodb_Connector;
import com.jeremygagner.williamboivin.forumservice.repository.PostDAO;

public class ForumServiceAppDriver {

    public static void main(String[] args) {
        IDAO dao = new PostDAO();

        dao.add(new Post("Ca marche", "2022/02/02", 1));
        dao.add(new Post("Ca marche 2 fois", "2022/02/02", 2));
    }
}
