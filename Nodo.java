/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoblegenericaalumnos;

/**
 *
 * @author mende
 */
public class Nodo {
    Alumno alumno;
    Nodo siguiente;
    public Nodo(){
        siguiente=null;
    }
    public Nodo(Alumno alumno,Nodo sig){
       siguiente=sig;
       this.alumno=alumno;
    }
}
