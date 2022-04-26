package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Department.class)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

//            Department dep = new Department("HR", 500, 1500);
//            Employee emp1 = new Employee("Oleg", "Byrgazov", 1000);
//            Employee emp2 = new Employee("Vika", "Melnik", 1200);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            session.save(dep);

            Department department = session.get(Department.class, 2);
            System.out.println(department.getEmps());
//            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("DONE");

        } finally {
            session.close();
            factory.close();
        }
    }

}
