/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterDesignPattern;
import AdapterDesignPattern.Setrika;
import AdapterDesignPattern.AdapterPattern;
import BuilderDesignPattern.cuci_kering;
import ChainOfReliabilityDesignPattern.ChainOR;
import ChainOfReliabilityDesignPattern.Dimension;
import ChainOfReliabilityDesignPattern.OneDimension;
import ChainOfReliabilityDesignPattern.TwoDimension;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Program Penerapan Design Pattern dalam Bahasa Java");
        System.out.println("Silahkan pilih program yang anda inginkan: ");
        System.out.println("1. Builder Creational Design Pattern ");
        System.out.println("2. Adapter Structural Design Pattern");
        System.out.println("3. Chain Of Responsibility Behavioural Design Pattern");
        System.out.println("Masukkan Pilihan Anda: ");
        Scanner pilihan1=new Scanner (System.in);
        int pilih = pilihan1.nextInt();
        
        if (pilih == 1){
            cuci_kering laundry = new cuci_kering.Builder()
                .setnopesan (01)
                .setreguler ("Rp 6.000")
                .setkilat ("Rp 9.000")
                .setexpress ("Rp 10.000")
                .build();
        
        System.out.println (laundry);
        }
        else if (pilih == 2){
            Mesincuci mesincuci = new Mesincuci(); 
        Setrika setrika = new setrikasaya();
     
          
  
        // kita bungkus Cuci ke dalam class Cuci adapter  
        // supaya kita bisa menggunkan 
         Setrika cuciAdapter = new CuciAdapter(mesincuci);  
  
        System.out.println("Cara pemesanan mesin cuci.."); 
        mesincuci.CuciKering(); 
        mesincuci.Cucibasah(); 
  
        System.out.println("Setrika..."); 
        setrika.SetrikaCepat(); 
  
        // Pemesanan yang yang dimana baju dicuci dan di setrika (Yang merupakan hasil class adapter)
        System.out.println("CuciAdapter..."); 
        cuciAdapter.SetrikaCepat(); 
        }
        
        else if(pilih==3){
        ChainOR c1 = new OneDimension();
        ChainOR c2 = new TwoDimension();

        c1.setNext(c2);
        
        Scanner pilihan=new Scanner (System.in);
        System.out.println("-Sistem Informasi Laundry-");
        System.out.println("Halo Sobat Laundry Cintah");
        System.out.println("Yuuuu kepoin laundry kami...");
        System.out.println("1. Layanan yang tersedia");
        System.out.println("2. Hubungi Kami ");
        System.out.println("Masukkan kode pilihan kalian: ");
        c1.setNext(c2);
        int lihat = pilihan.nextInt();
        if (lihat == 1){
            c1.process(new Dimension (1));
        }
        else if(lihat == 2){
            c1.process(new Dimension (5, 7));
        }
       
        }
        
        
        
        
    }
    
}
