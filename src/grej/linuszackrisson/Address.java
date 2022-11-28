package grej.linuszackrisson;

public class Address {
    private String street;
    private String streetNo;
    private String zipCode;
    private String city;


    public Address(String street, String streetNo, String zipCode, String city){
        this.street = street;
        this.streetNo = streetNo;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String toString(){
        return "Address(" +
                "street = " + street + "," +
                " street number = " + streetNo + "," +
                " zip code = " + zipCode + "," +
                " city = " + city +
                ")";
    }

    public static void main(String[] args) {
        Address a = new Address("Forsskålsgatan 13", "9b", "12145", "Stockholm");
        System.out.println(a);
    }
}
