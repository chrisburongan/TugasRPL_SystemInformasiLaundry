package AdapterDesignPattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public interface Setrika {



    public void SetrikaCepat(); 
} 
  //Implements setrika saya merujuk ke interface Setrik
 class setrikasaya implements Setrika 
{ 
    @Override
    public void SetrikaCepat() 
    { 
        System.out.println("Baju dan celana anda akan di setrika.."); 
    } 
} 

