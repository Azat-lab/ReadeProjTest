package azat.curs.curs.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true, length = 45)
    private String email;

    @Column(length = 64)
    private String password;

    @Column(length = 45)
    private String firstname;
    @Column(length = 45)
    private String surname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return surname;
    }

    public void setLastname(String surname) {
        this.surname = surname;
    }

    public User() {
    }

    public User(Integer id, String email, String password, String firstname, String surname) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.surname = surname;
    }
}
