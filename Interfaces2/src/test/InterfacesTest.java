package test;

import dataaccess.IDataAccess;
import dataaccess.MySqlImplementation;
import dataaccess.OracleImplementation;

public class InterfacesTest {
    public static void main(String[] args) {

        IDataAccess date = new MySqlImplementation();
        //date.read();
        print(date);
        date = new OracleImplementation();
        //date.read();
        print(date);
    }
    public static void print (IDataAccess etad){
        etad.read();
    }
}