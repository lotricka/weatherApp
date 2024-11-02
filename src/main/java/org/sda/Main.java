package org.sda;

import org.sda.daos.GenericDao;
import org.sda.models.Location;
import org.sda.services.GenericService;


public class Main {
    public static void main(String[] args) {

        GenericDao<Location, Long> locationDao = new GenericDao<>(Location.class);
        GenericService<Location, Long> locationService = new GenericService<>(locationDao);

        Location prague = new Location(14.421389, 50.0875, "Prague", "Czech Republic");
        locationService.save(prague);

    }



}