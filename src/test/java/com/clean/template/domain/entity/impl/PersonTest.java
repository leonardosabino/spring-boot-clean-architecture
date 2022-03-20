package com.clean.template.domain.entity.impl;

import br.com.caelum.stella.validation.InvalidStateException;
import com.clean.template.domain.entity.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    @DisplayName("Throw exception when cpf is invalid")
    public void testInvalidCpf() {
        Person person = new CommonPerson("Chico", "12345678910", "123456789", 30);
        Assertions.assertThrows(InvalidStateException.class, () -> person.isCpfValid(person.getCpf()));
    }

    @Test
    @DisplayName("Throw exception when name is empty")
    public void testSetEmptyName() {
        Person person = new CommonPerson();
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> ((CommonPerson) person).setName(""));
        assertEquals("The name can not be blank or empty", exception.getMessage());
    }

    @Test
    @DisplayName("Throw exception when name is blank")
    public void testSetBlankName() {
        Person person = new CommonPerson();
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> ((CommonPerson) person).setName("   "));
        assertEquals("The name can not be blank or empty", exception.getMessage());
    }

    @Test
    @DisplayName("Throw exception when cpf is empty")
    public void testSetEmptyCpf() {
        Person person = new CommonPerson();
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> ((CommonPerson) person).setCpf(""));
        assertEquals("The cpf can not be blank or empty", exception.getMessage());
    }

    @Test
    @DisplayName("Throw exception when cpf is blank")
    public void testSetBlankCpf() {
        Person person = new CommonPerson();
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> ((CommonPerson) person).setCpf("   "));
        assertEquals("The cpf can not be blank or empty", exception.getMessage());
    }

    @Test
    @DisplayName("Throw exception when rg is empty")
    public void testSetEmptyRg() {
        Person person = new CommonPerson();
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> ((CommonPerson) person).setRg(""));
        assertEquals("The rg can not be blank or empty", exception.getMessage());
    }

    @Test
    @DisplayName("Throw exception when rg is blank")
    public void testSetBlankRg() {
        Person person = new CommonPerson();
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> ((CommonPerson) person).setRg("   "));
        assertEquals("The rg can not be blank or empty", exception.getMessage());
    }

    @Test
    @DisplayName("Throw exception when age is invalid")
    public void testSetInvalidAge() {
        Person person = new CommonPerson();
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> ((CommonPerson) person).setAge(0));
        assertEquals("The age must be informed", exception.getMessage());
    }

}
