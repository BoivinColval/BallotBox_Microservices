package com.jeremygagner.williamboivin.voteservice.repository;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SomeeSQL_Connector implements I_SomeeSQL_Connector{
    String connectionString = "workstation id=BallotBox.mssql.somee.com;packet size=4096;user id=ballotboxadmin;pwd=Admin22!;data source=BallotBox.mssql.somee.com;persist security info=False;initial catalog=BallotBox";
    String connectionString2 = "workstation id=BallotBoxMicroservices.mssql.somee.com;packet size=4096;user id=ballotboxadmin2_SQLLogin_1;pwd=6tq63o6cwd;data source=BallotBoxMicroservices.mssql.somee.com;persist security info=False;initial catalog=BallotBoxMicroservices";

    public SomeeSQL_Connector(){
        connect();
    }

    @Override
    public void connect() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(connectionString2);
            System.out.println("Connection was a success.");
        } catch (SQLException | ClassNotFoundException t) {
            t.printStackTrace();
            System.out.println("Connection was a failure.");
        }
    }
}
