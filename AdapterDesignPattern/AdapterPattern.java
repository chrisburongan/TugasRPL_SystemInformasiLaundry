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
public class AdapterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Mesincuci mesincuci = new Mesincuci(); 
        Setrika Setrika = new setrikasaya();
     
          
  
        // kita bungkus Cuci ke dalam class Cuci adapter  
        // supaya kita bisa menggunkan 
        Setrika cuciAdapter = new CuciAdapter(mesincuci);  
  
        System.out.println("Cara pemesanan mesin cuci.."); 
        mesincuci.CuciKering(); 
        mesincuci.Cucibasah(); 
  
        System.out.println("Setrika..."); 
        Setrika.SetrikaCepat(); 
  
        // Pemesanan yang yang dimana baju dicuci dan di setrika (Yang merupakan hasil class adapter)
        System.out.println("CuciAdapter..."); 
        cuciAdapter.SetrikaCepat(); 
    }
    
}
