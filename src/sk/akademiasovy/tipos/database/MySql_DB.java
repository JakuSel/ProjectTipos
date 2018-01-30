package sk.akademiasovy.tipos.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MySql_DB {
    private final String url="jdbc:mysql://localhost:3306/tipos";
    private final String dbName="tipos";
    private final String driver="com.mysql.jdbc.Driver";
    private final String userName="user1";
    private final String password="123456";
    private Connection conn;

    public void testConnection(){
        try {
            Class.forName(driver).newInstance();
            conn= DriverManager.getConnection(url,userName,password);
            if (conn==null){
                System.out.println("Connection failed");
            }
            else
            {
                System.out.println("Connection OK");
            }
            conn.close();
        }
        catch (Exception e){
            System.out.println("Error");
        }

    }

    public boolean insertBallsIntoTable(int pole[]){
        try{
            Class.forName(driver).newInstance();
            conn= DriverManager.getConnection(url,userName,password);
            String cmd="INSERT INTO draw_history(ball1,ball2,ball3,ball4,ball5)values(?,?,?,?,?)";
            System.out.println("Ready to insert");
            PreparedStatement preparedStatement=conn.prepareStatement(cmd);
            preparedStatement.setInt(1,pole[0]);
            preparedStatement.setInt(2,pole[1]);
            preparedStatement.setInt(3,pole[2]);
            preparedStatement.setInt(4,pole[3]);
            preparedStatement.setInt(5,pole[4]);
            preparedStatement.executeUpdate();
            conn.close();

        }

        catch (Exception e){
            System.out.println("Err");
        }
        return true;
    }

}
