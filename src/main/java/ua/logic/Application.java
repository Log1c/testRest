package ua.logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import ua.logic.entity.Skill;
import ua.logic.entity.User;
import ua.logic.entity.UserSkills;

@Configuration
@EnableJpaRepositories
@Import(RepositoryRestMvcConfiguration.class)
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        addData();
//        printData();
    }

    private static void printData() {


    }

    private static void addData() {
        SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        User user = new User("Vlad");
        session.save(user);

        Skill skill = new Skill();
        skill.setName("SQL");
        skill.setGrade("3");
        session.save(skill);

        UserSkills userSkills = new UserSkills(user, skill);
        session.save(userSkills);

        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
