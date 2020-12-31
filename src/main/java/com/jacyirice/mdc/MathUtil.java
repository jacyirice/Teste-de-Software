/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacyirice.mdc;

/**
 *
 * @author compo
 */
public class MathUtil {

    public static int mdc(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        
        //Propriedade 6
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;
        
        if (isPrimo(a)){
            if (a==b){
                return a;
            }
            return 1;
        }
        if (a == b && a > 0) {
            return a;
        }
        
        if (b > 0 && a % b == 0) {
            return b;
        }

        if (b == 0) {
            return Math.abs(a);
        }

        if (a % b != 0) {
            return 1;
        }
        return -1;
    }
    
    public static boolean isPrimo(final long numero){
        if(numero <= 1){
            return false;
        }

        for(long i = 2; i < numero; i++){
            if(numero%i==0){
                return false;
            }
        }

        return true;
    }
}
