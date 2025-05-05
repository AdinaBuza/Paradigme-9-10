package org.example;

import java.io.*;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static ArrayList<Person> lista() {
        ArrayList<Person> persoane = new ArrayList<>();
        persoane.add(new Person("Ana", 27));
        persoane.add(new Person("Bob", 28));
        persoane.add(new Person("Charles", 29));
        persoane.add(new Person("David", 30));
        persoane.add(new Person("Dan", 31));
        return persoane;
    }

    public static void writeToConsole(ArrayList<Person> persoane) {
        for (Person person : persoane) {
            person.afiseaza();
        }
    }

    public static void writeToFile(ArrayList<Person> persoane) {
        try {
            PrintWriter writer = new PrintWriter(new File("output.txt"));
            for (Person person : persoane) {
                writer.println(person.getNume() + " " + person.getVarsta());
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void export(ArrayList<Person> lista, Exporter exporter) {
        exporter.export(lista);
    }

    public static void main(String[] args) {
        ArrayList<Person> lista = lista();

        Exporter exporter = new ExportToFile("output.txt");
        export(lista, exporter);

}
}
