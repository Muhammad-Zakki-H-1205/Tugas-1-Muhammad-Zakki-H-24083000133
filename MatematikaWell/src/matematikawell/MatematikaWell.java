/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematikawell;

/**
 *
 * @author ASUS
 */
public class MatematikaWell {
    int operasi;
    void pertambahan (int a, int b){
        operasi = a + b;
    }
    void pengurangan (int a, int b){
        operasi = a - b;
    }
    void perkalian (int a, int b){
        operasi = a * b;
    }
    void pembagian (int a, int b){
        operasi = a / b;
    }
    int operasi () {
        return operasi;
    }
}
