public class Handy {
    private String hersteller;
    private int speicher;
    private boolean dualSim;
    //Get-Methoden
    public String getHersteller() {
        return hersteller;
    }
    
    public int getSpeicher()      { 
        return speicher; 
    }
    
    public boolean isDualSim()    { 
        return dualSim; 
    }
    //Set-Methoden
    public void setHersteller(String hersteller) { 
        this.hersteller = hersteller; 
    }
    
    public void setSpeicher(int speicher)        { 
        this.speicher = speicher; 
    }
    
    public void setDualSim(boolean dualSim)      { 
        this.dualSim = dualSim; 
    }

    public Handy() {
        this.hersteller = "UNKN";
        this.speicher = 0;
        this.dualSim = false;
    }

    public Handy(String hersteller, int speicher, boolean dualSim) {
        setHersteller(hersteller);
        setSpeicher(speicher);
        setDualSim(dualSim);
    }
}