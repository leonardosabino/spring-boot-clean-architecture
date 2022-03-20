package com.clean.template.domain.factory.impl;

import com.clean.template.domain.entity.Person;
import com.clean.template.domain.entity.impl.CommonPerson;
import com.clean.template.domain.factory.PersonFactory;

public class CommonPersonFactory implements PersonFactory {

    @Override
    public Person create(String name, String cpf, String rg, int age) {
        return new CommonPerson(name, cpf, rg, age);
    }

}