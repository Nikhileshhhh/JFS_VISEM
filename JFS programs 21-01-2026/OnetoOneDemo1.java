import java.util.Scanner;
class Passport {
    int passportNo;
    String nationality;
    Passport(int passportNo, String nationality) {
        this.passportNo = passportNo;
        this.nationality = nationality;
    }
}
class Person {
    int id;
    String name;
    Passport pass;   // One-to-One mapping
    Person(int id, String name, Passport pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
    }
}
public class OnetoOneDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        Person[] persons = new Person[n];
        // Input details dynamically
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Passport Number: ");
            int passportNo = sc.nextInt();
            System.out.print("Nationality: ");
            String nationality = sc.next();
            Passport p = new Passport(passportNo, nationality);
            persons[i] = new Person(id, name, p);
        }
        // Search by ID
        System.out.print("\nEnter ID to search: ");
        int searchId = sc.nextInt();
        boolean found = false;
        for (Person person : persons) {
            if (person.id == searchId) {
                System.out.println("\nPerson Details");
                System.out.println("ID: " + person.id);
                System.out.println("Name: " + person.name);
                System.out.println("Passport Number: " + person.pass.passportNo);
                System.out.println("Nationality: " + person.pass.nationality);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Person with given ID not found.");
        }
        sc.close();
    }
}
