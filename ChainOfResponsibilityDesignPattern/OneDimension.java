/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibilityDesignPattern;

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class OneDimension implements ChainOR{
    private ChainOR nextInChainOR;
   @Override
   public void setNext (ChainOR c){
       this.nextInChainOR = c;
   }
    @Override
   public void process (Dimension request){
       if (request.getcoordinate().length==1){
           int a= request.getcoordinate().length;
           if (a==1){
               System.out.println("Layanan yang tersedia: ");
               System.out.println("1. Cuci Kering");
               System.out.println("2. Cuci Setrika");
           }
       }
       else{
           nextInChainOR.process (request);
       }
   }
    
}
