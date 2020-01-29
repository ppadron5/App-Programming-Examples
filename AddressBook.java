package addbook;

public class AddressBook {

    int pages;
    double pagesd;
    private AddressBook(int pg) {

        pages = pg;
        System.out.println("AddressBook with " + pages + "pages has been created");
    }

    private AddressBook(double pg){

        pagesd = pg;
        System.out.println("AddressBook with " + pagesd + "pages has been created");
    }

    public static void main(String[] args){
        AddressBook a1 = new AddressBook(8);
        AddressBook a2 = new AddressBook(10);
        AddressBook a3 = new AddressBook(4.5);
    }
}