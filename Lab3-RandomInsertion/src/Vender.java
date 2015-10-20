/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;

/**
 *
 * @author yangpan
 */
public class Vender {
    private int vId;
    private String name;
    private String location;
    
    private static Random random = new Random();
    private static final String[] venders = new String[] {
        "100 Grand",
        "Amazon.com",
        "AT&T",
        "Allstate",
        "BMW",
        "Banana Republic",
        "Best Buy",
        "Budweiser",
        "Burger King",
        "Butterfinger",
        "Carl’s Jr.",
        "Comcast",
        "Costco",
        "Chevron",
        "Foot Locker",
        "Geico",
        "Gucci",
        "Hotels.com",
        "Hotwire.com",
        "Hyundai",
        "iTunes",
        "J.C. Penney",
        "Kohl’s",
        "Lowe’s",
        "LG",
        "MGM",
        "Ocean Pacific",
        "Pizza Hut",
        "Pizza Pizza"
    };
    private static final int[] addrNums = new int[] {
        1334, 23, 1921, 1761, 2531, 97, 638, 1702, 21, 342,
        563, 8913, 2341, 453, 92, 18, 3592, 801, 482, 9401
    };
    private static final String[] streets = new String[] {
        "Clearance Blvd", "Mission Ave", "First St", "Third St", "Lakefront Ln",
        "Kingdom Blvd", "Main St", "Frontview Ave", "Ocean Ave", "Pier Ln"
    };
    private static final String[] cities = new String[] {
        "Hollywood", "New York", "San Francisco", "Seattle", "Las Vegas"
    };
    private static final String[] states = new String[] {
        "CA", "MI", "TX", "NY", "VA"
    };
    private static final int[] zips = new int[] {
        93701, 93205, 41023, 31056, 92542
    };
    
    public Vender(int id) {
        vId = id;
        name = getRandomName();
        location = getRandomLocation();
    }
    
    private String getRandomName() {
        int randNameNdx = random.nextInt(venders.length - 1);
        return venders[randNameNdx];
    }
    
    private String getRandomLocation() {
        StringBuilder locBuilder = new StringBuilder();
        int randAddrNumNdx = random.nextInt(addrNums.length - 1);
        int randStreetNdx = random.nextInt(streets.length - 1);
        int randCityNdx = random.nextInt(cities.length - 1);
        int randStateNdx = random.nextInt(states.length - 1);
        int randZipNdx = random.nextInt(zips.length - 1);
        
        locBuilder.append(addrNums[randAddrNumNdx]).append(" ");
        locBuilder.append(streets[randStreetNdx]).append(", ");
        locBuilder.append(cities[randCityNdx]).append(", ");
        locBuilder.append(states[randStateNdx]).append(", ");
        locBuilder.append(zips[randZipNdx]);
        
        return locBuilder.toString();
    }
    
    public String getName() {
        return name;
    }
    
    public String getLocation() {
        return location;
    }
    
    public int getId() {
        return vId;
    }
}
