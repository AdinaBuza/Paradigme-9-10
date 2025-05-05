package org.example;

public class Person {
    String nume;
    int varsta;

    Person(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    void afiseaza() {
        System.out.println(nume + " " + varsta);
    }

    String getNume() {
        return nume;
    }

    void setNume(String nume) {
        this.nume = nume;
    }

    int getVarsta() {
        return varsta;
    }

    void setVarsta(int varsta) {
        this.varsta = varsta;
}


}