/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasusperulanganno.pkg5bintang;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class StudiKasusPerulanganNo5Bintang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bintang yang dimasukkan  = ");
        int bintang = input.nextInt();
        for(int a=0;a<=bintang; a++){
            for(int b = 0;b < a; b++){
                System.out.print("*");
            }
            System.out.println();
    }
    }
}
