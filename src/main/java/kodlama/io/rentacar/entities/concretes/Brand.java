package kodlama.io.rentacar.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;


//spring annotations
@Table(name = "brands")
@Entity
//lombok annotations
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;

/*
    //constructors
    public Brand() {
    }

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //getters&setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/
}
