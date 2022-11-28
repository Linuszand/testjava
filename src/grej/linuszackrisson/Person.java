package grej.linuszackrisson;

public class Person {
    /*
    En person skall ha:
    förnamn: String
    efternamn: String
    födelseår: date
    adress: String
     */
    private String firstName;
    private String lastName;
    private Short birthYear;
    private Address address;

    /*
    För heltal har vi ett antal olika typer att välja på
    byte, 1 byte lång, kan lagra tal mellan -128 upp till 127
    short, 2 byte lång, kan lagra tall mellan -32768 upp till 32767
    int, 4 bytes lång, kan lagra tal mellan -2,147,483,648 upp till 2,147,483,647
    long, 8 bytes lång, kan lagra tal mellan -9,223,372,036,854,775,808 upp till 9,223,372,036,854,775,807
     */
    public Person(String firstName, String lastName, Short birthYear){
        this(firstName, lastName, birthYear, new Address("", "", "", ""));
    }

    public Person(String firstName, String lastName, Short birthYear, Address address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.address = address;
    /*
    Vi har två konstruktorer med olika mängd argument. Vilken som används beror
    på de argument som skickas med när vi gör new Person()
     */
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Short getBirthYear() {
        return birthYear;
    }
    public Address getAddress() {
        return address;
    }

    public void sayHello() {
        System.out.println("Hejsan, jag är en Person som heter " + getFirstName() + getLastName() + " och är född: " + getBirthYear());
    }

    public String toString() {
        return "Person:" +
                " first name: " + firstName + "," +
                " last name: " + lastName + "," +
                " birth year: " + birthYear + "," +
                "adress =" + address;

    }

    public static void main(String[] args) {
        Person b = new Person("Linus", "Zackrisson", (short) 1995);
        Person l = new Person("Louise", "Kjellgren", (short) 2005, new Address("Gatan", "13", "12145", "Göteborg"));
        System.out.println(b);
        System.out.println(l);

        l.sayHello();
    }
}

