/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikawell;

/**
 *
 * @author ASUS
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mtk = new MatematikaCanggih();
        
        mtk.pertambahan(5, 5);
        System.out.println("pertambahan 5 + 5 = " + mtk.operasi);
        mtk.perkalian(5, 2);
        System.out.println("perkalian 5 * 2 = " + mtk.operasi);
        int hasilModulus = mtk.modulus(10, 3);
        System.out.println("hasil modulus = " + hasilModulus);
    }
}
