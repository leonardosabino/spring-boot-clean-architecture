package com.clean.template.domain.entity;

public interface Person {
    String getName();
    String getCpf();
    String getRg();
    int getAge();
    void isCpfValid(String cpf) throws Exception;
}