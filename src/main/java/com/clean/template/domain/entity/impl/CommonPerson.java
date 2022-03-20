package com.clean.template.domain.entity.impl;

import br.com.caelum.stella.validation.CPFValidator;
import com.clean.template.domain.entity.Person;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CommonPerson implements Person {

    private String name;
    private String cpf;
    private String rg;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("The name can not be blank or empty");
        } else {
            this.name = name;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.isEmpty() || cpf.isBlank()) {
            throw new IllegalArgumentException("The cpf can not be blank or empty");
        } else {
            isCpfValid(cpf);
            this.cpf = cpf;
        }
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        if (rg.isEmpty() || rg.isBlank()) {
            throw new IllegalArgumentException("The rg can not be blank or empty");
        } else {
            this.rg = rg;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age == 0) {
            throw new IllegalArgumentException("The age must be informed");
        } else {
            this.age = age;
        }
    }

    public void isCpfValid(String cpf) {
        CPFValidator cpfValidator = new CPFValidator();
        cpfValidator.assertValid(cpf);
    }

}
