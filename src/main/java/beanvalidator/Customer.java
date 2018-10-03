package beanvalidator;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

public class Customer {

    @NotNull(message = "Not null able")
    @Size(min=4, max=50, message = "Size must be greater than 4 and less than 50")
    private String firstName;
    private String lastName;
    @Past(message = "Birthday must be past")
    private Date birthday;
    private String phonenumber;
    private String email;

    public Customer(String firstName, Date birthday) {
        this.firstName = firstName;
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
