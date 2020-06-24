/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alterodd;

/**
 *
 * @HaripriyaHp
 */
public class AlterOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N=100;
        for(int i=1;i<=N;i++)
            if(i%2!=0)
                System.out.println(i);
    }
    
}
