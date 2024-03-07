package secondTask;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add( "89233364","Ivanov");
        phoneBook.add( "89456387","Petrov");
        phoneBook.add( "89675521","Sidorov");
        phoneBook.add( "89453809","Ivanov");
        phoneBook.add( "89126729","Petrov");
        phoneBook.add( "89564893","Mihailov");

        phoneBook.get("Ivanov");
    }
}
