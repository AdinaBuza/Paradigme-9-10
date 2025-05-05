package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ExportToFile implements Exporter {
    private String filename;

    public ExportToFile(String filename) {
        this.filename = filename;
    }

    @Override
    public void export(ArrayList<Person> persons) {
        try {
            PrintWriter writer = new PrintWriter(new File(filename));
            for (Person person : persons) {
                writer.println(person.getNume() + " " + person.getVarsta());
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}



