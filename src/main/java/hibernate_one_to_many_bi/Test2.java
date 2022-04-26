package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
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

//            Department dep = new Department("Sales", 400, 700);
//            Employee emp1 = new Employee("Dima", "Byrgazov", 450);
//            Employee emp2 = new Employee("Nastya", "Melnik", 650);
//            Employee emp3 = new Employee("Olya", "Melnik", 550);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);
//            session.save(dep);

            System.out.println("Get department");
            Department department = session.get(Department.class, 3);

            System.out.println("Show department");
            System.out.println(department);

            System.out.println("Show employees of the department");
            System.out.println(department.getEmps());

//            Employee employee = session.get(Employee.class, 2);
//            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("DONE");

        } finally {
            session.close();
            factory.close();
        }
    }

}
