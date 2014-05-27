/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contactlist;

/**
 *
 * @author JBZ
 * Child class that extends contact class and creates a personal contact
 */
public class PersonalContact extends Contact 

{
     private String contactType;
     private String dateOfBirth;

     /**
          Initializes the properties for the contact
          @param contact type type of contact
          @param firstName contact's first name
          @param lastName contact's last name
          @param address contact's street address
          @param city contact's city
          @param state contact's state
          @param zip contact's zip code
          @param phone contact's phone number
          @param email contact's email address
          @param date of birth contact's birthday
     */

     public PersonalContact(String contactType, String firstName, String lastName, String address, String city, String state,
                            String zip, String phone, String email, String dateOfBirth)
     {
          super(firstName, lastName, address, city, state, zip, phone, email);     

          this.contactType = contactType;
          this.dateOfBirth = dateOfBirth;

     }

     public PersonalContact() 

     {

          super();

     }

     // Methods to retrieve personal contact information
    

     /**

          Retrieves the contact's date of birth
          @return date of birth
     */

     public String getDateOfBirth()

     {

          return dateOfBirth;

     }

     // Methods to set personal contact information

     /**
          Sets the contact type
          @param contact type

     public void contactType(String contactType)

     {

          this.contactType = contactType;  

     }        

     /**
          sets the contact's date of birth
          @param date of birth
     */

     public void setDateOfBirth(String dateOfBirth)

     {

          this.dateOfBirth = dateOfBirth;

     }

     @Override
     public String toString()

     {

          return " Contact Type: " +contactType + 
          "\n Name: " +super.toString() + 
          "\n Address: " +super.getAddress() + " " +super.getCity() + ", " +super.getState() + " " +super.getZip() + 
          "\n Phone: " +super.getPhone() + 
          "\n Email: " +super.getEmail() + 
          "\n Date of Birth: " +dateOfBirth;

     }

}

