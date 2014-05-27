/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contactlist;

/**
 *
 * @author MLacy
 * Child class that extends contact class and creates a business contact.
 */
public class BusinessContact extends Contact 
{
     private String contactType;
     private String jobTitle;
     private String organization;

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
          @param job title contact's job title
          @param organization contact's organization
     */

     public BusinessContact(String contactType, String firstName, String lastName, String address, String city, String state,
                            String zip, String phone, String email, String jobTitle,
                            String organization)
     {
          super(firstName, lastName, address, city, state, zip, phone, email);

          this.contactType = contactType;
          this.jobTitle = jobTitle;
          this.organization = organization;

     }

     public BusinessContact()

     {
         super();
     }

     // Methods to retrieve business contact class information
 

     /**
          Retrieves the contact's job title
          @return job title
     */

     public String getJobTitle()

     {

          return jobTitle;

     }

     /**
          Retrieves the contact's organization
          @return organization
     */

     public String getOrganization()

     {

          return organization;

     }

     // Methods to set business contact class information
  

     /**
          Sets the contact's job title
          @param job title
     */

     public void setJobTitle(String jobTitle)

     {

          this.jobTitle = jobTitle;

     }

     /**
          Sets the contact's organization
     */

     public void setOrganization(String organization)

     {

          this.organization = organization;

     }     

     @Override
     public String toString()

     {

          return " Contact Type: " +contactType + 
          "\n Name: " +super.toString() + 
          "\n Address: " +super.getAddress() + " " +super.getCity() + ", " +super.getState() + " " +super.getZip() + 
          "\n Phone: " +super.getPhone() + 
          "\n Email: " +super.getEmail() + 
          "\n Job Title: " +jobTitle +
          "\n Organization: " +organization;

     }
}
