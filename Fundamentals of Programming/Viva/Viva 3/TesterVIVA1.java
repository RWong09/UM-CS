import java.util.Random;

public class TesterVIVA1 {
    public static void main(String[] args) {
        TesterVIVA1 tester = new TesterVIVA1();
        System.out.println(tester.toString());

    }

    protected static int damage(BlackMage blackMage, Phantom phantom) {
        Random rd = new Random();
        double totalEffectiveAccuracy = (phantom.getAccuracy()) * (1 - (blackMage.getEvasion()));
        double totalEffectiveCritRate = (phantom.getCrisrate()) - (blackMage.getCrisResistance());
        double accuracyRandom = rd.nextDouble();
        double critRandom = rd.nextDouble();

        if (critRandom <= totalEffectiveCritRate) {
            return 4;
        } else if (accuracyRandom <= totalEffectiveAccuracy) {
            return 2;
        } else {
            return 0;
        }

    }

    public String toString() {
        BlackMage blackMage = new BlackMage();
        Phantom phantom = new Phantom(0.9, 0.2);
        int hp = blackMage.getHP();
        StringBuilder result = new StringBuilder();
        while (hp > 0) {
            int damage = damage(blackMage, phantom);
            if ((hp - damage) < 0) {
                result.append("[NORM] Phantom has dealt ").append(damage).append(" damage to the Black Mage (0/100)\n");
            } else {
                result.append("[NORM] Phantom has dealt ").append(damage).append(" damage to the Black Mage (")
                        .append(hp - damage).append("/100)\n");
            }
            hp -= damage;
        }

        return result.toString();
    }

}
