package main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "szamolas")
public class Szamolas {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "ertek")
    private double ertek;

    public Szamolas() {
    }

    public Szamolas(double ertek) {
        this.ertek = ertek;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getErtek() {
        return ertek;
    }

    public void setErtek(double ertek) {
        this.ertek = ertek;
    }

}
