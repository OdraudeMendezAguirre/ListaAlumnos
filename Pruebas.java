/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoblegenericaalumnos;
import javax.swing.JOptionPane;

/**
 *
 * @author mende
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista lista=new Lista();
        Alumno alumno=new Alumno("Denisse",10);
        lista.insertar(alumno);
        Alumno alumno2=new Alumno("Odraude",9.5);
        lista.insertar(alumno2);
        Alumno alumno3=new Alumno("Jose",7.2);
        lista.insertar(alumno3);
        Alumno alumno4=new Alumno("Jony",8.6);
        lista.insertar(alumno4);
        Alumno alumno5=new Alumno("Maria",9.4);
        lista.insertar(alumno5);
        lista.mostrar();;
        System.out.println("------------------");
    }
}
