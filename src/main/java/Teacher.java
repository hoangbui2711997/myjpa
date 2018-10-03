import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("B")
public class Teacher extends Human {

    @Enumerated(EnumType.STRING)
    private Degree degree;

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public Teacher() {
    }

    public Teacher(Degree degree, String address, String name, int age) {
        super(address, name, age);
        this.degree = degree;
    }
}
