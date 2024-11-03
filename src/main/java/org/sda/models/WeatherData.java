package org.sda.models;

import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name = "weather_data")

public class WeatherData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "locations_id")
    private Location location;


    private Date date;
    private Float temp;

    private Float hum;
    private Integer pressure;
    private Float wind;
    private Float speed;
    private String direction;

    public WeatherData() {
    }

    public void setLocation(Location location) {
        this.location = location;
    }


    public WeatherData(Date date, Float temp, Float hum, Integer pressure, Float wind, Float speed, String direction) {
       // this.location = location;
        this.date = date;
        this.temp = temp;
        this.hum = hum;
        this.pressure = pressure;
        this.wind = wind;
        this.speed = speed;
        this.direction = direction;
    }
}
