package com.clean.template.domain.factory;

import com.clean.template.domain.entity.Person;

public interface PersonFactory {
    Person create(String name, String cpf, String rg, int age);
}
