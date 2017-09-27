/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

/**
 *
 * @author RJ
 */
public class Alumno {
    private String nombre; //con private solo la misma clase puede ver el valor de la variable (nombre en este caso)
    private String apellido; 
    private float notaMatematicas;
    private float notaEdFisica;
    private float notaCatalan;
    private float notaMedia;
    private float notaMaxima;
    
    //Constructores
    public Alumno() {
    }

    public Alumno(String nombre, String apellido, float notaMatematicas, float notaEdFisica, float notaCatalan) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notaMatematicas = notaMatematicas;
        this.notaEdFisica = notaEdFisica;
        this.notaCatalan = notaCatalan;
        this.notaMedia = notaMedia;
        this.notaMedia = notaMaxima;
    }
    
    //Los "GET" se utilizan para recuperar datos
    //Metodo de recuperación de datos
    public String getNombre() {    
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public float getNotaMatematicas() {
        return notaMatematicas;
    }

    public float getNotaEdFisica() {
        return notaEdFisica;
    }

    public float getNotaCatalan() {
        return notaCatalan;
    }
    
    public float getNotaMedia() {
        return notaMedia;
    }
    public float getNotaMaxima() {
        return notaMaxima;
    }
    //Los "SET" se utilizan para meter datos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNotaMatematicas(float notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public void setNotaEdFisica(float notaEdFisica) {
        this.notaEdFisica = notaEdFisica;
    }

    public void setNotaCatalan(float notaCatalan) {
        this.notaCatalan = notaCatalan;
    }
    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }
    public void setNotaMaxima(float notaMaxima) {
    this.notaMaxima = notaMaxima;
    }
    
    //Función para calcular la media
    public float notamedia (float nota1, float nota2, float nota3){ 
        float resultado = (nota1 + nota2 + nota3) / 3;
        return resultado;
        //También se podria hacer de la siguiente manera, esto es más optimo porque solo lee una linea el prgrama
        //return (nota1 + nota2 + nota3) / 3;
}
    public float notamaxima (float nota1, float nota2, float nota3){
        Math.max(nota1, nota2); //Se queda con la nota maxima de nota1 y nota2
        float mayor = Math.max(nota1, nota2); //Guarda en la variable mayor la nota maxima
        Math.max(mayor, nota3); //Se queda con la nota maxima de mayor y nota3
        float mayor2 = Math.max(mayor, nota3);//Guarda en la variable mayor2 la nota maxima de mayor y nota3
        return Math.max(mayor, nota3); //Devuelve la nota máxima de nota1, nota2 y nota3
       //return Math.max(Math.max(nota1, nota2),nota3); --> Esta es la manera optima para realizar todo en una línea
    
    }
 
    
    
    
    
    
    
}


