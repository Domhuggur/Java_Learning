package dataaccess;

public class MySqlImplementation implements IDataAccess{
    @Override
    public void create(){
        System.out.println("Insert from Mysql");
    }
    @Override
    public void read(){
        System.out.println("Read from Mysql");
    }
    @Override
    public void update(){
        System.out.println("Update from Mysql");
    }
    @Override
    public void delete(){
        System.out.println("Delete from Mysql");
    }
}
