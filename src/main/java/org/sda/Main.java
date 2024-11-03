package org.sda;

import org.sda.daos.GenericDao;
import org.sda.models.Location;
import org.sda.models.WeatherData;
import org.sda.services.GenericService;

import java.util.Date;


public class Main {
    public static void main(String[] args) {

        GenericDao<Location, Long> locationDao = new GenericDao<>(Location.class);
        GenericService<Location, Long> locationService = new GenericService<>(locationDao);
        GenericDao<WeatherData, Long> weatherDataLongGenericDao = new GenericDao<>(WeatherData.class);
        GenericService<WeatherData, Long> weatherDataLongGenericService = new GenericService<>(weatherDataLongGenericDao);
        Date date = new Date();

        Location prague = new Location(14.421389, 50.0875, "Prague", "Czech Republic");
        WeatherData weatherData = new WeatherData(date, 14.5F, 15.4F, 1050, 40F, 30F, "southwest" );
        locationService.save(prague);
        weatherDataLongGenericService.save(weatherData);

        prague.setWeatherData(weatherData);
        weatherDataLongGenericService.update(weatherData);

    }



}