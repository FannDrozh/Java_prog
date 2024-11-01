package Zadanie5;

public class ContactBook {
    int Id;
    String firstName;
    String lastName;
    String address;
    int phone;
    String note;

    public ContactBook(String firstName, String lastName, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString(){
        return "Zadanie5.ContactBook{" +
                "Id ='" + Id + '\''+
                ", firstName ='" + firstName + '\''+
                ", lastName ='" + lastName + '\''+
                ", address ='" + address + '\''+
                ", phone ='" + phone + '\''+
                ", note ='" + note + '\''+
                '}';
    }

    public int getId() {
        return Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public String getNote() {
        return note;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
