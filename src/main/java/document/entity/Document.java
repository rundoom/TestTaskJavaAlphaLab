package document.entity;


import people.entity.People;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DOCUMENTS")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "PEOPLE_ID")
    private People people;

    @Column(name = "DOC_NUMBER")
    private Long docNumber;

    @Column(name = "IS_ACTIVE")
    private Boolean isActive;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "DOC_TYPE")
    private String docType;


    public People getPeople() {
        return people;
    }

    public Long getDocNumber() {
        return docNumber;
    }

    public Boolean getActive() {
        return isActive;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Long getId() {
        return id;
    }

    public String getDocType() {
        return docType;
    }
}
