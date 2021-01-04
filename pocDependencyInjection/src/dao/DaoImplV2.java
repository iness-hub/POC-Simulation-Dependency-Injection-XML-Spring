package dao;

public class DaoImplV2 implements  IDao{
    @Override
    public Double getData() {
        System.out.println(" Second version of DaoImpl");
        return 10.0;

    }
}
