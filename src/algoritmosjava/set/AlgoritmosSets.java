/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algoritmosjava.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jezreel_avila
 * @since  03-jun-2019
 */
public class AlgoritmosSets {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlgoritmosSets as = new AlgoritmosSets();
        
        // Manejo de Set
        as.algoritmosSetOrden();        
        // Manejo de TreeSet
        as.algoritmosTreeSet();
    }
    
    public void algoritmosSetOrden() {
        // Manejo de Set
        Set<Student> set = new HashSet<>();
        
        set.add(new Student(1001, "Lorena Abigail","Carrillo","Franco",96.0,2008));
        set.add(new Student(1002, "Joel Ivan","Avila","Marino",79.0,2009));
        set.add(new Student(1003, "Juan Pablo","Miranda","Ramirez",89.0,2005));
        set.add(new Student(1004, "Ernesto Javier","Diaz","Mendoza",85.0,2010));
        set.add(new Student(1005, "Yadira Estefania","Avila","Fierros",81.0,2011));
        
        for(Student s : set)
            System.out.println("Set: " + s);
    }
    
    public void algoritmosTreeSet() {
        // Manejo de Set
        Set<Student> set = new TreeSet<>();
        System.out.println("---------");
        
        set.add(new Student(1001, "Lorena Abigail","Carrillo","Franco",96.0,2008));
        set.add(new Student(1002, "Joel Ivan","Avila","Marino",79.0,2009));
        set.add(new Student(1003, "Juan Pablo","Miranda","Ramirez",89.0,2005));
        set.add(new Student(1004, "Ernesto Javier","Diaz","Mendoza",85.0,2010));
        set.add(new Student(1005, "Yadira Estefania","Avila","Fierros",81.0,2011));
        
        for(Student s : set)
            System.out.println("Set: " + s);
    }

}
