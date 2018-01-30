package sk.akademiasovy.tipos.main;

import sk.akademiasovy.tipos.Tipos;
import sk.akademiasovy.tipos.database.MySql_DB;


public class Main {
    public static void main(String[] args){

        Tipos numbers=new Tipos();

        numbers.generateRandom();
        numbers.printArr();



        System.out.println("Hello");


        MySql_DB DB=new MySql_DB();
    //    DB.testConnection();
     //   DB.insertBallsIntoTable(numbers.getArr());
    }
}
