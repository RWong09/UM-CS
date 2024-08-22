public class Phantom {
    private double accuracy = 1.0;
    private double critRate = 1.0;

    public Phantom(double accuracy, double critRate) {
        this.accuracy = accuracy;
        this.critRate = critRate;
    }

    public void setAccuracy(double newAccuracy) {
        if (newAccuracy >= 0.0 && newAccuracy <= 1.0) {
            this.accuracy = newAccuracy;
        }
        else {
            System.out.println("Invalid accuracy.Please change the accuracy to double between 0.00 to 1.00");
        }
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setCrisRate(double newCritRate) {
        if (newCritRate >= 0.0 && newCritRate <= 1.0) {
        this.critRate = newCritRate;
        }
        else {
            System.out.println("Invalid critRate.Please change the crisRate to double between 0.00 to 1.00");
        }
    }

    public double getCrisrate() {
        return critRate;
    }

}
