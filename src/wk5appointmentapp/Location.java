package wk5appointmentapp;

import java.util.Map;
import java.util.HashMap;

public class Location {

    // learning how to use a map so each building can be stored with its relevant room options
    // to my understanding, 'final' prevents contents from ever being overwritten
    // Map<String, int[]> — maps building names to their list of rooms
    private static final Map<String, int[]> buildingRooms = new HashMap<>();

    static {
        // .put() — stores each building and its room array
        buildingRooms.put("Building1", new int[]{101, 102, 205, 209});
        buildingRooms.put("Building2", new int[]{204, 207, 304});
        buildingRooms.put("Building3", new int[]{105, 107, 302, 303});
    }


}
