import javax.persistence.*;


//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "name", discriminatorType = DiscriminatorType.CHAR)
//@DiscriminatorValue("H")
@MappedSuperclass
public class Human {
    protected String name;
    protected int age;
    @Id @GeneratedValue
    protected Long id;
    @Column(length = 1000)
    protected String address;

    public Human(String address, String name, int age) {
        this.address = address;
        this.name = name;
        this.age = age;
    }

    public Human() {
    }
}
