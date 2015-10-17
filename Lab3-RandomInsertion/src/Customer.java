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
public class Customer {
    private int SSN;
    private String name;
    private String address;
    private String phone;
    
    private static Random random = new Random();
    private static final String[] names = new String[] {
        "Dolores Tietjen",
        "Faviola Katzer",
        "Santana Broadus",
        "Kelvin Hunn",
        "Willian Kohan",
        "Marietta Mcgowin",
        "Bok Damm",
        "Sulema Kushner",
        "Yajaira Olivieri",
        "Vilma Graziano",
        "Merrie Kromer",
        "Timmy Sather",
        "Effie Coston",
        "Earnest Shetley",
        "Rosina Thornberry",
        "Florencio Bedsole",
        "Loree Ansell",
        "Adela Lavin",
        "Yuriko Nichols",
        "William Mccoy",
        "Aletha Mckendrick",
        "Kaye Medal",
        "Lindsay Banach",
        "Lory Platts",
        "Cristie Albaugh",
        "Lupe Claycomb",
        "Sherryl Easler",
        "Delcie Pryor",
        "Armand Harrod",
        "Hector Ashurst",
        "Ai Hardrick",
        "Evelyne Rafter",
        "Rosa Hempstead",
        "Karole Hoang",
        "Marti Lydon",
        "Eneida Stalling",
        "Calandra Giancola",
        "Tasha Rolando",
        "Consuela Spengler",
        "Sheba Suther",
        "Debera Counter",
        "Vito Tseng",
        "Nicola Coder",
        "Jacqueline Ladouceur",
        "Sabra Frier",
        "Cassandra Mccuin",
        "Beatrice Beeler",
        "Daniel Carner",
        "Leif Bernardini",
        "Wiley Shick",
        "Annita Breed",
        "Dotty Salmi",
        "Felisha Harper",
        "Maryetta Emmons",
        "Karine Mohammed",
        "Charlette Dipiazza",
        "Zelma Creegan",
        "Noel Degree",
        "Shawna Mero",
        "Kendal Aikins",
        "Joana Corchado",
        "Violeta Rotolo",
        "Krystina Sparacino",
        "Daron Proehl",
        "Dagny Bragan",
        "Gertie Gertz",
        "Lamar Lewandowski",
        "Marisha Decastro",
        "Antonia Sanabria",
        "Clarence Hurlbut",
        "Moriah Crume",
        "Kristian Witte",
        "Roseanne Salais",
        "Tiana Kleinman",
        "Tonita Riddle",
        "Li Ulm",
        "Thaddeus Spells",
        "Clemente Dechant",
        "Fatima Masser",
        "Chantay Bustos",
        "Florencio Cogdill",
        "Elissa Emert",
        "Pearlie Toliver",
        "Hortensia Vansickle",
        "Farrah Escalona",
        "Roscoe Keathley",
        "Delana Mcneely",
        "Daphne Fielden",
        "Magan Laroque",
        "Katy Cannon",
        "Tamar Weyant",
        "Erminia Shao",
        "Lurline Torry",
        "Buster Helsley",
        "Krystle Kernan",
        "Larisa Gingras",
        "Claude Victor",
        "Zane Hilton",
        "Shala Stocker",
        "Barrett Cruise"
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
    
    public Customer() {
        SSN = getRandomSSN();
        name = getRandomName();
        address = getRandomAddress();
        phone = getRandomPhone();
    }
    
    private String getRandomName() {
        int randomIndex = random.nextInt(names.length - 1);
        return names[randomIndex];
    }
    
    private int getRandomSSN() {
        int randomSSN = random.nextInt(999999999 - 111111111) + 111111111;
        return randomSSN;
    }
    
    private String getRandomAddress() {
        StringBuilder addressBuilder = new StringBuilder();
        int randAddrNumNdx = random.nextInt(addrNums.length - 1);
        int randStreetNdx = random.nextInt(streets.length - 1);
        int randCityNdx = random.nextInt(cities.length - 1);
        int randStateNdx = random.nextInt(states.length - 1);
        int randZipNdx = random.nextInt(zips.length - 1);
        
        addressBuilder.append(addrNums[randAddrNumNdx]);
        addressBuilder.append(" ").append(streets[randStreetNdx]);
        addressBuilder.append(", ").append(cities[randCityNdx]);
        addressBuilder.append(", ").append(states[randStateNdx]);
        addressBuilder.append(", ").append(zips[randZipNdx]);
        
        return addressBuilder.toString();
    }
    
    private String getRandomPhone() {
        StringBuilder phoneBuilder = new StringBuilder();
        int areaCode = random.nextInt(999 - 100) + 100;
        phoneBuilder.append("(").append(areaCode).append(")");
        int prefix = random.nextInt(999 - 100) + 100;
        phoneBuilder.append(prefix).append("-");
        int suffix = random.nextInt(9999 - 1000) + 1000;
        phoneBuilder.append(suffix);
        
        return phoneBuilder.toString();
    }
    
    public String getName() {
        return name;
    }
    
    public int getSSN() {
        return SSN;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getPhone() {
        return phone;
    }
}
