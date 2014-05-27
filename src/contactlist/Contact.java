/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contactlist;

/**
 *
 * @author MLacy
 * Super class that creates a contact and allows it to be retrieved.
 */
public class Contact 
{
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;
    
    /**
          Initializes the properties for the contact
          @param firstName contact's first name
          @param lastName contact's last name
          @param address contact's street address
          @param city contact's city
          @param state contact's state
          @param zip contact's zip code
          @param phoneNumber contact's phone number
          @param emailAddress contact's email address
     */

     public Contact(String firstName, String lastName, String address, String city, String state, 
                    String zip, String phone, String email)
 
     {

          this.firstName = firstName;
          this.lastName = lastName;
          this.address = address;
          this.city = city;
          this.state = state;
          this.zip = zip;
          this.phone = phone;
          this.email = email;

     }

     public Contact()
   
     {
     }

     // Methods to retrieve contact class information

          /**
          Retrieves the contact's first name
          @return first name
     */

     public String getFirstName()

     {
 
          return firstName;

     }

     /**
          Retrieves the contact's last name
          @return last name
     */

     public String getLastName()
     {
          return lastName;

     }

     /**
          Retrieves contact's street address
          @return street address
     */

     public String getAddress()

     {

          return address;

     }

     /**
          Retrieves contact's city
          @return city
     */

     public String getCity()

     {

          return city;

     }

     /**
          Retrieves contact's state
          @return state
     */

     public String getState()

     {

          return state;

     }

     /**

          Retrieves contact's zip code
          @return zip
     */

     public String getZip()

     {

          return zip;

     }

     /**
          Retrieves contact's phone number
          @return phone
     */

     public String getPhone()
     
     {

          return phone;

     }

     /**
          Retrieves contact's email address
          @return email
     */

     public String getEmail()

     {

          return email;

     }

     // Methods to set contact class information

     /**
          Sets the contact's first name
          @param first name
     */     

     public void setFirstName(String firstName)

     {

          this.firstName = firstName;

     }

     /**
          Sets the contact's last name
          @param last name
     */

     public void setLastName(String lastName)
     
     {

          this.lastName = lastName;

     }

     /**
          Sets the contact's street address
          @param address
     */

     public void setAddress(String address)

     {

          this.address = address;

     }

     /**
          Sets the contact's city
          @param city
     */

     public void setCity(String city)

     {

          this.city = city;

     }

     /**
          Sets the contact's state
          @param state
     */

     public void setState(String state)

     {

          this.state = state;

     }

     /**
          Sets the contact's zip code
          @param zip
     */

     public void setZip(String zip)

     {

          this.zip = zip;

     }

     /**
          sets the contact's phone number
          @param phone
     */

     public void setPhone(String phone)

     {

          this.phone = phone;

     }

     /**
          Sets the contact's email address
          @param email
     */

     public void setEmail(String email)

     {

          this.email = email;

     }

     @Override
     public String toString()

     {

     return firstName + " " +lastName;

     }

}

