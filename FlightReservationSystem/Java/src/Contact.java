public class Contact extends Passenger
{
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email)
    {
        this.name =name;
        this.phone=phone;
        this.email=email;
    }


    private String getContactDetails() {
        return name +","+ phone+","+ email;
    }
    public void updateContactDetails(String name, String phone , String email)
    {
        this.name = name;
        this.phone =phone;
        this.email =email;
    }
}
