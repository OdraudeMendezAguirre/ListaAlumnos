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
public class Alumno {
    protected String nombre;
    protected double calificacion;
    
    public Alumno(){
        nombre=null;
        calificacion=0.0;
    }
    public Alumno(String nombre, double calificacion)
    {
        this.calificacion=calificacion;
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public double getCalificacion(){
        return calificacion;
    }
}
