/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibilityDesignPattern;

/**
 *
 * @author ASUS
 */
public class TwoDimension implements ChainOR{
    private ChainOR nextInChainOR;
   @Override
   public void setNext (ChainOR c){
       this.nextInChainOR = c;
   }
    @Override
   public void process (Dimension request){
       if (request.getcoordinate().length==2){
           int a= request.getcoordinate().length;
           if (a==2){
               System.out.println("Contact Person");
               System.out.println("WA: 081234342289");
               System.out.println("Alamat: Jl. Simpang Cemara Raya II");
           }
       }
       else{
           nextInChainOR.process (request);
       }
   }
    
}
