/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoblegenericaalumnos;

import java.util.ArrayList;

/**
 *
 * @author mende
 */
public class Lista {
    Nodo fin;
    Nodo inicio;
    public Lista(){
        fin=inicio=null;
    }
    public boolean estavacia(){
        return inicio==null;
    }
    public void insertar(Alumno alumno){
        if(estavacia()){
        inicio= new Nodo(alumno,inicio);
        fin=inicio;
        }
        else
            inicio= new Nodo(alumno,inicio);
    }
    
    public String mostrar(){
        String mensaje="";
        Nodo aux;
        aux=inicio;
        if(aux==null){
            mensaje="La lista esta Vacia";
        }
        while(aux!=null){
            mensaje=mensaje+"Alumno: "+aux.alumno.getNombre()+" calificacion: "+aux.alumno.getCalificacion()+"\n";
            aux=aux.siguiente;
        }
        return mensaje;
    }
    
    public String buscar(String nombre){
        Nodo aux=inicio;
        while(aux!=null){
        if(aux.alumno.getNombre().equals(nombre)){
            return ("Alumno: "+aux.alumno.getNombre()+" calificacion: "+aux.alumno.getCalificacion());
        }
        aux=aux.siguiente;
        }
        return ("El alumno no existe");
    }
    
    public void eliminar(String nombre){
        Nodo aux=inicio;
        Nodo aux2=inicio.siguiente;
        if(aux.alumno.getNombre().equals(nombre)){
            inicio=aux.siguiente;
        }
        while(aux2!=null){
            if(aux2.alumno.getNombre().equals(nombre)){
                aux.siguiente=aux2.siguiente;
            }
            aux=aux.siguiente;
            aux2=aux2.siguiente;
        }
    }
    
    public Lista modificar(String nombreA,String nomN,double cal){
        Nodo aux=inicio;
        while(aux!=null){
        if(aux.alumno.getNombre().equals(nombreA)){
            aux.alumno.nombre=nomN;
            aux.alumno.calificacion=cal;
            return this;
        }
        aux=aux.siguiente;
        }
        return null;
    }
    
    public Lista ordenarCalif(){
        
        Nodo max=inicio;
        //for(max=inicio;max!=null;max=max.siguiente){
        Nodo aux = inicio;
        
        while(aux!=null){
            //for(int c=10;c>=0;c++){
            if(max.alumno.calificacion<aux.alumno.calificacion){
                max=aux;
                eliminar(aux.alumno.getNombre());
                inicio= new Nodo(max.alumno,inicio);
                //aux=aux.siguiente;
            }
            if(max.alumno.calificacion==10){
                max=max.siguiente;
            }
            aux=aux.siguiente;
            }
        //}
        return this;
    }
    
}
