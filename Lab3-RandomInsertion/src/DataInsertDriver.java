/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author yangpan
 */
public class DataInsertDriver {
    private static Random random = new Random();
    
    public static void main(String[] args) throws IOException {

        File custFile = new File("CustomerInsert.txt");
        FileWriter custWriter = new FileWriter(custFile);       
        ArrayList<Customer> customers = new ArrayList<Customer>();
        
        for (int i = 0; i < 1000; i++) {
            Customer cust = new Customer(i + 5);
            customers.add(cust);
            
            custWriter.write("insert into customer(SSN, id, name, address, phone) " 
                    + "values(" + cust.getSSN() + ", " + cust.getId() + ", \"" + cust.getName() + "\", \"" 
                    + cust.getAddress() + "\", \"" + cust.getPhone() + "\");\n");     
        }
        custWriter.flush();
        custWriter.close();
        
        
        File cardFile = new File("CreditCardInsert.txt");
        FileWriter cardWriter = new FileWriter(cardFile);
        ArrayList<CreditCard> cards = new ArrayList<CreditCard>();
        
        for (int i = 0; i < 1000; i++) {
            CreditCard card = new CreditCard();
            cards.add(card);
            
            cardWriter.write("insert into creditcard(number, type, creditLimit, currentBalance) " 
                    + "values(\"" + card.getNumber() + "\", \"" + card.getType() 
                    + "\", " + card.getCreditLimit() + ", " + card.getBalance() 
                    + ");\n");
        }
        cardWriter.flush();
        cardWriter.close();
        
        
        File vendFile = new File("VenderInsert.txt");
        FileWriter vendWriter = new FileWriter(vendFile);
        ArrayList<Vender> venders = new ArrayList<Vender>();
        
        for (int i = 0; i < 100; i++) {
            Vender vend = new Vender(i + 5);
            venders.add(vend);
            
            vendWriter.write("insert into vender(name, location) " 
                    + "values(\"" + vend.getName() + "\", \"" 
                    + vend.getLocation() + "\");\n");
        }
        vendWriter.flush();
        vendWriter.close();
        
        
        File ownFile = new File("OwnershipInsert.txt");
        FileWriter ownWriter = new FileWriter(ownFile);
        
        for (int i = 0; i < customers.size(); i++) {
            /*for (int j = 0; j < random.nextInt(3 - 1) + 1; j++) {
                ownWriter.write("insert into ownership(customerId, creditCardNumber, isCurrent) " 
                    + "values(" + customers.get(j).getId() + ", \"" + cards.get(i).getNumber() + "\", " + random.nextBoolean() + ");\n");
            }*/
            if (i % 3 == 0) {
                ownWriter.write("insert into ownership(customerId, creditCardNumber, isCurrent) "
                    + "values (" + customers.get(i).getId() + ", \"" + cards.get(i).getNumber() + "\", " + random.nextBoolean() + ");\n");
                
                ownWriter.write("insert into ownership(customerId, creditCardNumber, isCurrent) "
                    + "values (" + customers.get(i).getId() + ", \"" + cards.get((cards.size() - 1) - i).getNumber() + "\", " + random.nextBoolean() + ");\n");
                
                ownWriter.write("insert into ownership(customerId, creditCardNumber, isCurrent) "
                    + "values (" + customers.get(i).getId() + ", \"" + cards.get((cards.size() - 1) - random.nextInt(cards.size() - 1)).getNumber() + "\", " + random.nextBoolean() + ");\n");
            }
            else if (i % 2 == 0) {
                ownWriter.write("insert into ownership(customerId, creditCardNumber, isCurrent) "
                    + "values (" + customers.get(i).getId() + ", \"" + cards.get(i).getNumber() + "\", " + random.nextBoolean() + ");\n");
                
                ownWriter.write("insert into ownership(customerId, creditCardNumber, isCurrent) "
                    + "values (" + customers.get(i).getId() + ", \"" + cards.get(cards.size() - i).getNumber() + "\", " + random.nextBoolean() + ");\n");
            }
            else {
                ownWriter.write("insert into ownership(customerId, creditCardNumber, isCurrent) "
                    + "values (" + customers.get(i).getId() + ", \"" + cards.get(i).getNumber() + "\", " + random.nextBoolean() + ");\n");
            }
            
        }
        ownWriter.flush();
        ownWriter.close();
        
        
        File transFile = new File("TransactionInsert.txt");
        FileWriter transWriter = new FileWriter(transFile);
        
        for (int i = 0; i < 2000; i++) {
            transWriter.write("insert into transaction(date, customerId, creditCardNumber, venderId, amount) " 
                    + "values(\"10/20/2015\", " + customers.get(random.nextInt(customers.size() - 1)).getId() 
                    + ", \"" + cards.get(random.nextInt(cards.size() - 1)).getNumber() + "\", " 
                    + venders.get(random.nextInt(venders.size() - 1)).getId() 
                    + ", " + random.nextInt(100) + ");\n");
        }
        transWriter.flush();
        transWriter.close();
        
        
        File payFile = new File("PaymentInsert.txt");
        FileWriter payWriter = new FileWriter(payFile);
        
        for (int i = 0; i < 100; i++) {
            payWriter.write("insert into payment(date, amount, creditCardNumber) " 
                    + "values(\"10/20/2015\", " + random.nextInt(50) + ", \"" 
                    + cards.get(random.nextInt(cards.size() - 1)).getNumber() + "\");\n");
        }
        payWriter.flush();
        payWriter.close();
    }
}
