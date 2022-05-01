package com.jeremygagner.williamboivin.voteservice.repository;


import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQL_Connector implements I_SQL_Connector {
    Connection conn;

    public SQL_Connector(){
        this.conn = connect();
    }

    @Override
    public Connection connect() {
        MysqlDataSource datasource = new MysqlDataSource();
        return this.conn;
    }
}
