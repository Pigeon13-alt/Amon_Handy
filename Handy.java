public class Handy {
    private String hersteller;
    private int speicher;
    private boolean dualSim;

    public String getHersteller() { return hersteller; }
    public int getSpeicher()      { return speicher; }
    public boolean isDualSim()    { return dualSim; }

    public void setHersteller(String hersteller) { this.hersteller = hersteller; }
    public void setSpeicher(int speicher)        { this.speicher = speicher; }
    public void setDualSim(boolean dualSim)      { this.dualSim = dualSim; }

    public Handy() {
        this("UNKN", 0, false);
    }

    public Handy(String hersteller, int speicher, boolean dualSim) {
        setHersteller(hersteller);
        setSpeicher(speicher);
        setDualSim(dualSim);
    }
}