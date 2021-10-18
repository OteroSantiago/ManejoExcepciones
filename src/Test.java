/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno Mañana
 */
public class Test {
    public static void main(String[] args) {
        int res = 0;
        
        try {
            res = 10/0;
        } catch (Exception e) {
            e.printStackTrace(System.out);//imprememe todo el stack de excepciones
        }
        
    }
}
