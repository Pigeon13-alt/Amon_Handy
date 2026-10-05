public class Handy {
    private String hersteller;
    private int speicher;
    private boolean dualSim;
    //Get-Methoden
    public String getHersteller() {
        return hersteller;
    }
    
    public int getSpeicher() {
        return speicher;
    }
    
    public boolean getDualSim() {
        return dualSim;
    }
    
    //Set-Methoden    
    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }
    
    public void setSpeicher(int speicher) {
        this.speicher = speicher;
    }
    
    public void setDualSim() {
        this.dualSim = dualSim;
    }
}