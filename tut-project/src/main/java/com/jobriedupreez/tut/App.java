package com.jobriedupreez.tut;

//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.File;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        //JSONParser parser = new JSONParser();
        //ObjectMapper objectMapper = new ObjectMapper();
        //
        //// Parse venues.json
        //try {
        //    List<Venues> venues = objectMapper.readValue(new File("venues.json"), new TypeReference<List<Venues>>() {});
        //    System.out.println("Venues:");
        //    for (Venues venue : venues) {
        //        System.out.println(venue.getName() + " - " + venue.getBuilding() + " - Available Times: " +
        //                venue.getAvailableTimes() + " - Seats: " + venue.getSeats());
        //    }
        //} catch (Exception e) {
        //    e.printStackTrace();
        //    return;
        //}

        
        // Parse modules.json
       // try {
       //     List<Modules> modules = objectMapper.readValue(new File("modules.json"), new TypeReference<List<Modules>>() {});
       //     System.out.println("\nModules:");
       //     for (Modules module : modules) {
       //         System.out.println(module.getName() + " - Lecturer: " + module.getLecturer() + " - Available Times: " +
       //                 module.getAvailableTimes() + " - Students: " + module.getStudents());
       //     }
       // } catch (Exception e) {
       //     e.printStackTrace();
       //     return;
       // }
    }
}
