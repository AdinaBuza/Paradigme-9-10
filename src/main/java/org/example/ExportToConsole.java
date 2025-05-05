package org.example;

import java.util.ArrayList;

public class ExportToConsole implements Exporter {
    @Override
    public void export(ArrayList<Person> persons) {
        for (Person person : persons) {
            person.afiseaza();
        }
    }
}