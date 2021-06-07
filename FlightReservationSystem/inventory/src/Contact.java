public class Contact
{
 String contactName;
 String contactPhone;
 String contactEmail;

 String getContactDetails()
 {
     return contactName +","+ contactPhone+","+contactEmail;
 }
 void updateContactDetails(String contactName, String contactPhone,String contactEmail)
 {
     this.contactEmail=contactEmail;
     this.contactPhone=contactPhone;
     this.contactName=contactName;
 }
}
