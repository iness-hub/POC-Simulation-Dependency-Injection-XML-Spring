package service;

import dao.IDao;

public class ServiceImpl implements  IService{
    private IDao iDao;

    @Override
    public double calcul() {
        double d=iDao.getData();
        return d;
    }

    public void setDao(IDao idao){
        this.iDao = idao;
    }
}
