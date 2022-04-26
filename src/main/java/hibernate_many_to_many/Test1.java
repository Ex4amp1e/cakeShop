package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();

//            Section section1 = new Section("VolleyBall");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//            Child child1 = new Child("Igor", 10);
////            Child child2 = new Child("Masha", 6);
////            Child child3 = new Child("Vasya", 7);
////            section1.addChildToSection(child1);
////            section1.addChildToSection(child2);
////            section1.addChildToSection(child3);
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);

            session.beginTransaction();

            Section section = session.get(Section.class, 1);
            session.delete(section);
            session.save();
            session.persist();

            session.getTransaction().commit();
            System.out.println("DONE");

        } finally {
            session.close();
            factory.close();
        }
    }
}
