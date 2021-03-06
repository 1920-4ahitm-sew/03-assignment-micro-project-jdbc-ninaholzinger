package at.htl.carrentalse.entity;

import javax.persistence.*;

@Entity
@NamedQueries(@NamedQuery(name = "vehicleList", query = "select v from Vehicle v where  v.id =?1"))
public class Vehicle {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String type;
    private int constructionYear;
    private int pivotalYear;


    public Vehicle() {
    }

    public Vehicle(Long id, String brand, String type, int constructionYear, int pivotalYear) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.constructionYear = constructionYear;
        this.pivotalYear = pivotalYear;
    }

    public Long getId() {
        return id;
    }

   /* public void setId(Long id) {
        this.id = id;
    }*/

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    public int getPivotalYear() {
        return pivotalYear;
    }

    public void setPivotalYear(int pivotalYear) {
        this.pivotalYear = pivotalYear;
    }
}