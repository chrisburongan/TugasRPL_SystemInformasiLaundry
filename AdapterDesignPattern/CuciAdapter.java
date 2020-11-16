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
 class CuciAdapter implements Setrika
{ 
    // You need to implement the interface your 
    // client expects to use. 
    Cuci cuci; 
    public CuciAdapter (Cuci cuci) 
    { 
        // referensi object 
      
        this.cuci = cuci; 
    } 
  
    @Override
    public void SetrikaCepat() 
    { 
        
        cuci.CuciKering();
    } 
} 
