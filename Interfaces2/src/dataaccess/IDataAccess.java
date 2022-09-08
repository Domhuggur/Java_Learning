package dataaccess;

public interface IDataAccess {
    int MAX_REGISTRATION = 10;

    void create();
    void read();
    void update();
    void delete();
}
