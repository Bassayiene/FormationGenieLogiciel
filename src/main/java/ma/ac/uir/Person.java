package ma.ac.uir;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Représente une personne avec un name, un surname et une date de naissance.
 */
public final class Person {

    // attributs
    /** name de la personne. */
    private final String givenName;

    /** surname de la personne. */
    private final String surname;

    /** date de naissance de la personne. */
    private final LocalDate dateOfBirth;


    /**
     * Constructeur d'une personne.
     *
     * @param newGivenName  prénom (final)
     * @param newSurname     nom de famille (final)
     * @param newDateOfBirth date de naissance (final)
     */
    Person(final String newGivenName,
        final String newSurname,
        final LocalDate newDateOfBirth) {
        this.givenName = newGivenName;
        this.surname = newSurname;
        this.dateOfBirth = newDateOfBirth;
    }

    /**
     * Retourne le nom complet au format "Surname, GivenName".
     * @return nom complet
     */
    public String getDisplayName() {
        return surname + ", " + givenName;
    }

    /**
     * Calcule l'âge actuel de la personne.
     * @return âge en années
     */
    public long getAge() {
        return ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now());
    }

    /**
     * Point d'entrée pour tester la classe Person.
     * @param args arguments de la ligne de commande (final)
     */
    public static void main(final String[] args) {
        Person person = new Person(
        "Joey",
        "Doe",
        LocalDate.parse("2013-01-12")
        );
        System.out.println(
            person.getDisplayName()
            + ": "
            + person.getAge()
            + " years"
        );
 }
}
