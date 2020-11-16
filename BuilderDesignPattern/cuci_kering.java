/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderDesignPattern;

/**
 *
 * @author ASUS
 */
public class cuci_kering {
    private long biasa;
    
    public String reguler;
    public String kilat;
    public String express;
    
    private cuci_kering (Builder builder){
        reguler = builder.reguler;
        kilat = builder.kilat;
        express = builder.express;
        biasa = builder.biasa;
        
    }
    
    public static class Builder {
        private long biasa;
    
        private String reguler;
        private String kilat;
        private String express;
        
        public Builder setnopesan (long biasa){
            this.biasa = biasa;
            return this;
        }
        
        public Builder setreguler (String reguler){
            this.reguler =reguler;
            return this;
        }
        
        public Builder setkilat (String kilat){
            this.kilat = kilat;
            return this;
        }
        
        public Builder setexpress (String express){
            this.express = express;
            return this;
        }
        
        public cuci_kering build (){
            return new cuci_kering (this);
        }   // TODO code application logic here
    }

    @Override
    public String toString (){
        return "********Laundry Penuh Cinta*********" + ("\n") 
                + "Cuci Kering per/kg Reguler = " + reguler + ("\n")
                + "Cuci Kering per/kg Kilat = " + kilat + ("\n") 
                + "Cuci Kering per/kg Express = " + express + ("\n");
    }
    
}
