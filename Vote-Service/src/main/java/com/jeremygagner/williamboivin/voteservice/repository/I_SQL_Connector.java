package com.jeremygagner.williamboivin.voteservice.repository;

import java.sql.Connection;

public interface I_SQL_Connector {
    public Connection connect();
}
