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
    
    public Customer() {
        SSN = getRandomSSN();
        name = getRandomName();
        
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
        
    }
    
    public String getRandomPhone() {
        
    }
}
