/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikawell;

/**
 *
 * @author ASUS
 */
public class MatematikaMudahBukan {
    public static void main(String[] args) {
        MatematikaWell mtk = new MatematikaWell();
        mtk.pertambahan(250, 250);
        System.out.println("pertambahan 250 + 250 = " + mtk.operasi);
        mtk.pengurangan(50, 25);
        System.out.println("pengurangan 50 - 25 = " + mtk.operasi);
        mtk.perkalian(10, 10);
        System.out.println("perkalian 10 * 10 = " + mtk.operasi);
        mtk.pembagian(100, 50);
        System.out.println("pembagian 100 / 50 = " + mtk.operasi);
    }
}
