package people.entity;

import document.entity.Document;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "PEOPLE")
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy="people")
    private List<Document> documents;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "BIRTH_DATE")
    private Date birthDate;

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Long getId() {
        return id;
    }

    public List<Document> getDocuments() {
        return documents;
    }
}
