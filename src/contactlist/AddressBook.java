/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contactlist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JBZ
 * Class with main method that runs contact program
 */
public class AddressBook 
{
    public static void main(String[] args)

     {

          // Local variable

          int swValue;
          Scanner keyIn = new Scanner(System.in);

          ArrayList<Contact> contacts = new ArrayList<>();
          while (true)

          {

          // Displays menu graphics

          System.out.println("----------------------------------------");
          System.out.println("|              Contact Book            |");
          System.out.println("----------------------------------------");
          System.out.println("|  Available Options:                  |");
          System.out.println("|     1. Add a Business Contact        |");
          System.out.println("|     2. Add a Personal Contact        |");
          System.out.println("|     3. Display Contacts              |");
          System.out.println("|     4. Quit                          |");
          System.out.println("----------------------------------------");
          System.out.println(" Please select an option: ");
          swValue = keyIn.nextInt();

          // Switch construct for implementing options
          
          switch (swValue)

          {

               case 1:
                    addBusiness(contacts);
                    break;
               case 2:
                    addPersonal(contacts);
                    break;
               case 3:
                    getContacts(contacts);
                    break;
               case 4:
                   System.exit(0);
                   break;
               default:
                    System.out.println(" Invalid Selection ");
                    break;

          }

     }

}

public static void addBusiness(ArrayList<Contact> contacts)

{

     //Get input from user to populate contact information

     Scanner textIn = new Scanner(System.in);

     String contactType = "Business";

     System.out.println("First name: ");
     String firstName = textIn.nextLine();
     System.out.println("Last name: ");
     String lastName = textIn.nextLine();
     System.out.println("Address: ");
     String address = textIn.nextLine();
     System.out.println("City: ");
     String city = textIn.nextLine(); 
     System.out.println("State: ");
     String state = textIn.nextLine(); 
     System.out.println("Zip: ");
     String zip = textIn.nextLine(); 
     System.out.println("Phone: ");
     String phone = textIn.nextLine(); 
     System.out.println("Email: ");
     String email = textIn.nextLine(); 
     System.out.println("Job Title: ");
     String jobTitle = textIn.nextLine(); 
     System.out.println("Organization: ");
     String organization = textIn.nextLine();      

     BusinessContact aBusinessContact = new BusinessContact(contactType, firstName, lastName, 
                     address, city, state, zip, phone, email, jobTitle, organization);
     contacts.add(aBusinessContact);

}               
             
public static void addPersonal(ArrayList<Contact> contacts)

{

     //Get input from user to populate contact information

     Scanner textIn = new Scanner(System.in);

     String contactType = "Personal";

     System.out.println("First name: ");
     String firstName = textIn.nextLine();
     System.out.println("Last name: ");
     String lastName = textIn.nextLine();
     System.out.println("Address: ");
     String address = textIn.nextLine();
     System.out.println("City: ");
     String city = textIn.nextLine(); 
     System.out.println("State: ");
     String state = textIn.nextLine(); 
     System.out.println("Zip: ");
     String zip = textIn.nextLine(); 
     System.out.println("Phone: ");
     String phone = textIn.nextLine(); 
     System.out.println("Email: ");
     String email = textIn.nextLine(); 
     System.out.println("Date of Birth");
     String dateOfBirth = textIn.nextLine();      

     PersonalContact aPersonalContact = new PersonalContact(contactType, firstName, lastName, 
                     address, city, state, zip, phone, email, dateOfBirth);
     contacts.add(aPersonalContact);

}                         

public static void getContacts(ArrayList<Contact> contacts)

{

     Scanner keyIn = new Scanner(System.in);
     System.out.println("All Contacts: ");
     for (int i= 0; i < contacts.size(); i++)

     {

          System.out.println(i + ") " + contacts.get(i).getFirstName() + " " + contacts.get(i).getLastName());
     }

     System.out.println("Please enter the number of the contact you would like to view: ");
     int choice = keyIn.nextInt();
        
        System.out.println(contacts.get(choice).toString());

     }

}
