/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.salchicha.negocio;

/**
 * Sumar 2 valores
 * a->valor 1
 * b->valor 2
 * Resultado: suma de a+b
 * @author Victor Rocha
 * 
 * Definir si una oracion es palindroma o no
 * Para ello vamos a convertir todo a minusculas y retirar los caracteres especiales
 */
public class Operacion {
    
    public static int sumar(int a, int b){
        return a+b;
    }
    
    public boolean esPalindromo(String oracion){
        
        
        // limpiar la oracion de los caracteres especiales
        oracion = oracion.toLowerCase().replace
        ("á", "a").replace
        ("é", "e").replace
        ("í", "i").replace
        ("ó", "o").replace
        ("ú", "u").replace
        (" ", "").replace
        ("!", "").replace
        ("¡", "").replace
        (",", "").replace
        (".", "");
        
        
        //Guardar cada caracter en un array
        char [] caracteres = oracion.toCharArray();
        
        String reversa="";
        
        //Usamos el ciclo form para comenzar del ultimo caracter de la cadena de texto para ir analizando/comparando una por una
        for(int a = caracteres.length-1; a>=0; a--){
            reversa += caracteres[a];
        }
                
                
        return oracion.equals(reversa);
    }
    
}
