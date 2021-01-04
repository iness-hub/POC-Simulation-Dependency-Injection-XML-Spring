import dao.IDao;
import service.IService;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DependencyInjectionV2 {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        try {

            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassName = scanner.nextLine();
            Class cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.newInstance();

            String serviceClassName = scanner.nextLine();
            Class cService = Class.forName(serviceClassName);
            IService service = (IService) cService.newInstance();

            Method method = cService.getMethod("setDao",IDao.class);
            method.invoke(service,dao);

            System.out.println(service.calcul());
            System.out.println(" dynamic instantiation");
        } catch (FileNotFoundException | ClassNotFoundException | InstantiationException | IllegalAccessException
                | NoSuchMethodException | InvocationTargetException e){
            e.printStackTrace();
        }
    }
}
