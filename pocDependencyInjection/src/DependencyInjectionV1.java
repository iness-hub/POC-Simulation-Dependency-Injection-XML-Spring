import dao.DaoImpl;
import dao.IDao;
import service.ServiceImpl;

public class DependencyInjectionV1 {

    public static void main(String[] args) {
        IDao dao = new DaoImpl();
        ServiceImpl service = new ServiceImpl();
        service.setDao(dao);

        System.out.println(service.calcul());
    }
}
