/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

/**
 *
 * @author David.Castro
 */
public class Utilities {

    public static boolean saveFile(LinkedList<Estudiante> le) throws IOException {
        boolean t = false;
        FileWriter fileWriter = new FileWriter("estudiantes.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        for (int i = 0; i < le.size(); i++) {
            Estudiante get = le.get(i);
            printWriter.println(get.toString());
            
        }
        t=true;
        printWriter.close();
        return t;
        //printWriter.printf("Product name is %s and its price is %d $", "iPhone", 1000);
    }

    public LinkedList<Estudiante> ordering(LinkedList<Estudiante> le) {
        LinkedList<Estudiante> lorden = new LinkedList<>();

        return lorden;
    }
}
