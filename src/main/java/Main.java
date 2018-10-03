import beanvalidator.Customer;
import model.TaiKhoan;
import model.TinhThanh;
import org.junit.jupiter.api.Test;

import javax.persistence.*;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class Main {

    private static EntityManagerFactory emf =
            Persistence
                    .createEntityManagerFactory("module01-persistence-unit");
    private static EntityManager em = emf.createEntityManager();
    private static EntityTransaction entityTransaction = em.getTransaction();


    @Test
    public void anotherTest() {
        entityTransaction.begin();
        TinhThanh tinhThanh = new TinhThanh("Hà Nội");
        em.persist(tinhThanh);
        entityTransaction.commit();
    }

    @Test
    public void test() {
        Student s = new Student(1, "Hello", "world");
        Student s1 = new Student(2, "Hello1", "world1");
        Student s2 = new Student(3,"Hello2", "world2");
        Student s3 = new Student(4, "Hello3", "world3");

        Teacher t = new Teacher(Degree.BAD, "Address1", "Hello", 32);
        Teacher t1 = new Teacher(Degree.BAD, "Address2", "Hello4", 21);
        Teacher t2 = new Teacher(Degree.BAD, "Address3", "Hello3", 31);
        Teacher t3 = new Teacher(Degree.BAD, "Address4", "Hello2", 23);
        Teacher t4 = new Teacher(Degree.BEST, "world3", "Hello3", 4);


//        System.out.println(em.isOpen());
        em.getTransaction().begin();
        em.persist(s);
        em.persist(s1);
        em.persist(s2);
        em.persist(s3);
        em.persist(t);
        em.persist(t1);
        em.persist(t2);
        em.persist(t3);
        em.persist(t4);

        em.getTransaction().commit();
//        em.flush();

        TypedQuery<Student> select_s_from_student_s = em.createQuery("Select s from Student s", Student.class);
        final TypedQuery<Teacher> select_t_from_teacher_t = em.createQuery("Select t from Teacher t", Teacher.class);
        List<Student> resultList = select_s_from_student_s.getResultList();
        List<Teacher> resultList1 = select_t_from_teacher_t.getResultList();

        System.out.println(Arrays.toString(resultList.toArray()));
        System.out.println(Arrays.toString(resultList1.toArray()));
    }

    @Test
    public void doSomething() {
        final ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        final Validator validator = validatorFactory.getValidator();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis() + 99999); // java.sql.Timestamp
        Customer customer = new Customer("1", Date.from(timestamp.toInstant()));
        final Set<ConstraintViolation<Customer>> validate = validator.validate(customer);
        for (ConstraintViolation<Customer> customerConstraintViolation : validate) {
            System.out.println(customerConstraintViolation.getMessage());
        }
    }
}
