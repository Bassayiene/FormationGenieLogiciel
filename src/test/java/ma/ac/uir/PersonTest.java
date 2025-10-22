package ma.ac.uir;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void testGetDisplayName() {
        Person person = new Person("Josh", "Hayden");
        String displayName = person.getDisplayName();
        assertEquals("Hayden, Josh", displayName);

    }
}
