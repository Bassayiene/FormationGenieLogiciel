package ma.ac.uir;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void testGetDisplayName() {
        LocalDate birthDate = LocalDate.of(1982, 5, 23);
        Person person = new Person("Josh", "Hayden", birthDate);
        String displayName = person.getDisplayName();
        assertEquals("Hayden, Josh", displayName);

    }

    @Test
    void testGetAge() {
        Person person = new Person("Joey", "Doe", LocalDate.parse("2013-01-12"));
        long age = person.getAge();
        assertEquals(12, age);
    }
}
