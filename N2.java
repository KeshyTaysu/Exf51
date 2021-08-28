/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exf5;

/**
 *
 * @author user
 */
public class N2 {
    static void depende(int n1){
        
        if (n1 >10){
           System.out.println("Você não pode mais usar o parquinho");
        }
        else {
            System.out.println("Vai lá pirralho");
        }
    }
    public static void main(String[] args){
        
        int n1=(9*8);
        depende(n1);
    
    }
}
