package softuni.exam.domain.entitys;


import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity
@Table(name = "teams")
public class Team extends BaseEntity {


    private String name;

    private Picture picture;

    public Team() {
    }

    @Column(name = "name",nullable = false)
    @Length(min = 3,max = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne()
    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

}
