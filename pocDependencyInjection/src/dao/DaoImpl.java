package dao;

public class DaoImpl implements  IDao{
    @Override
    public Double getData() {
        System.out.println(" First version of DaoImpl");
        return 9.0;

    }
}
