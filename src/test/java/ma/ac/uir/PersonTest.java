package ma.ac.uir;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PersonTest {

    // Testing Pattern AAA : Arrange Act Assert
    @Test
    void testGetDisplayName() {

        // Arrange
        LocalDate birthDate = LocalDate.of(1982, 5, 23);
        Person person = new Person("Josh", "Hayden", birthDate);
        // Act
        String displayName = person.getDisplayName();
        // Assert
        assertEquals("Hayden, Josh", displayName);
    }

    @Test
    void testGetAge() {
        // Arrange
        Person person = new Person("Joey",
         "Doe",
         LocalDate.parse("2013-01-12")
         );
        // Act
        long age = person.getAge();
        // Assert
        assertEquals(12, age);
    }
}
