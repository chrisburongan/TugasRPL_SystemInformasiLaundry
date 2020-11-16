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
    interface Cuci 
{ 
  
    public void CuciKering(); 
    public void Cucibasah(); 
} 
  //implements itu merujuk ke interface
class Mesincuci implements Cuci 
{ 
 
    @Override
    public void CuciKering() 
    { 
        System.out.println("Baju anda akan di cuci dan di Setrika.. "); 
    } 
    @Override
    public void Cucibasah () 
    { 
        System.out.println("Baju anda akan hanya di cuci"); 
    } 
} 

