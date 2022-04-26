package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Detail.class)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
//            Employee employee = new Employee("Dima", "Smirnov", "Sales", 700);
//            Detail detail = new Detail("Piter", "123456789", "Oleg.Smirnov@yandex.ru");
//            detail.setEmployee(employee);
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//            session.save(detail);
//            session.getTransaction().commit();


            session.beginTransaction();

            Detail detail = session.get(Detail.class, 7);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);
            System.out.println(detail);

            session.getTransaction().commit();
            System.out.println("DONE");

        } finally {
            session.close();
            factory.close();
        }
    }

}
