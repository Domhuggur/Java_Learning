package dataaccess;

public class OracleImplementation implements IDataAccess {
    @Override
    public void create(){
        System.out.println("Insert from Oracle");
    }
    @Override
    public void read(){
        System.out.println("Read from Oracle");
    }
    @Override
    public void update(){
        System.out.println("Update from Oracle");
    }
    @Override
    public void delete(){
        System.out.println("Delete from Oracle");
    }
}
