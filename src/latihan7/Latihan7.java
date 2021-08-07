/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan7;

/**
 *
 * @author LENOVO
 */
public class Latihan7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriksA[][] = {{6,3,2},{4,2,3}};
        int matriksB[][] = {{1,2},{2,3},{3,2}};
        int hasilPerkalian[][] = new int [matriksA.length][matriksB[0].length];
        
        System.out.println("matriksA * matriksB :");
        
        for(int k=0; k<matriksA.length; k++){
            for(int l=0; l<matriksB[0].length; l++){
                for(int m=0; m<matriksB.length; m++){
                    hasilPerkalian [k][l] += matriksA [k][m] * matriksB [m][l]; 
                }
                System.out.print(hasilPerkalian [k][l] + " ");
            }
            System.out.println(" ");
        }
    }
    
}
