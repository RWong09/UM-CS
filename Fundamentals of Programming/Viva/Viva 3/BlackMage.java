public class BlackMage {
    private int hp;
    private double critResistance;
    private double evasion;


    public BlackMage () {
        hp = 100;
        critResistance = 0.1;
        evasion = 0.05;
    }

    public double getCrisResistance() {
        return critResistance;
    }
    public void setCrisRate(double critResistance) {
        this.critResistance = critResistance;
    }
    public double getEvasion() {
        return evasion;
    }
    public void setEvasion(double evasion) {
        this.evasion = evasion;
    }
    public int getHP() {
        return hp;
    }
    public void setHP(int hp) {
        this.hp = hp;
    }

}


