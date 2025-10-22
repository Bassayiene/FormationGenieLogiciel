package ma.ac.uir;

class Person {

    // attributs

    private final String givenName;
    private final String surname;

    // méthodes 

    Person(String givenName, String surname) {
        this.givenName = givenName;
        this.surname = surname;
    }
    String getDisplayName() {
        return surname + ", " + givenName;
    }
}