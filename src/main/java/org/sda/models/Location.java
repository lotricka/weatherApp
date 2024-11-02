package org.sda.models;

import javax.persistence.*;

@Entity
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @Column private Double longitude;

    @Column private Double latitude;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String state;


    public Location(Double longitude, Double latitude, String name, String state) {
       // this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.name = name;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Location{" +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
