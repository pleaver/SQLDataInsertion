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
public class CreditCard {
    private String number;
    private String type;
    private int creditLimit;
    private double currentBalance;
    
    private static Random random = new Random();
    private static final String[] types = new String[] {
        "AmEx", "Discover", "Visa", "MasterCard"
    };
    
    public CreditCard() {
        number = getRandomNumber();
        type = getRandomType();
        creditLimit = getRandomLimit();
        currentBalance = 0;
    }
    
    private String getRandomNumber() {
        int randomNumber = random.nextInt(2099999999 - 1111111111) + 1111111111;
        return Integer.toString(randomNumber);
    }
    
    private String getRandomType() {
        int randomTypeNdx = random.nextInt(types.length - 1);
        return types[randomTypeNdx];
    }
    
    private int getRandomLimit() {
        return random.nextInt(5000 - 1000) + 1000;
    }
    
    
    public String getNumber() {
        return number;
    }
    
    public String getType() {
        return type;
    }
    
    public int getCreditLimit() {
        return creditLimit;
    }
    
    public double getBalance() {
        return currentBalance;
    }
    
    public void addBalance(double amount) {
        currentBalance += amount;
    }
}
