package aut.utcluj.isp.ex1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void testCreate() {
        final Person firstPerson = new Person("John", "Wick");
        assertEquals("First name should be 'John'", "John", firstPerson.getFirstName());
        assertEquals("Last name should be 'Wick'", "Wick", firstPerson.getLastName());

        final Person secondPerson = new Person("Harvey");
        assertEquals("First name should be 'Harvey'", "Harvey", secondPerson.getFirstName());
        assertEquals("Last name should be ''", "", secondPerson.getLastName());
    }

    @Test
    public void testPersonEquals() {
        final Person firstPerson = new Person("John", "Wick");
        final Person secondPerson = new Person("John", "Wick");
        assertTrue("Person instances should be equal", firstPerson.equals(secondPerson));
        assertEquals("Person information should be 'John Wick'", "John Wick", firstPerson.toString());
    }
}