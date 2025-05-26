import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        double KLOC = 100;
        double a = 3.6, b = 1.20, c = 2.5, d = 0.32;

        Map<String, Double> costDrivers = new HashMap<>();
        costDrivers.put("RELY", 1.00);
        costDrivers.put("DATA", 1.00);
        costDrivers.put("CPLX", 1.15);
        costDrivers.put("TIME", 1.10);
        costDrivers.put("STOR", 1.06);
        costDrivers.put("VIRT", 1.00);
        costDrivers.put("TURN", 1.00);
        costDrivers.put("ACAP", 0.85);
        costDrivers.put("AEXP", 0.88);
        costDrivers.put("PCAP", 0.88);
        costDrivers.put("VEXP", 1.00);
        costDrivers.put("LEXP", 0.90);
        costDrivers.put("MODP", 1.00);
        costDrivers.put("TOOL", 0.95);
        costDrivers.put("SCED", 1.00);

        double EAF = 1.0;
        for (double value : costDrivers.values()) {
            EAF *= value;
        }

        double PM = a * Math.pow(KLOC, b) * EAF;
        double TM = c * Math.pow(PM, d);
        double SS = PM / TM;
        double P = KLOC / PM;

        System.out.printf("EAF = %.3f%n", EAF);
        System.out.printf("PM = %.2f людино-місяців%n", PM);
        System.out.printf("TM = %.2f місяців%n", TM);
        System.out.printf("SS = %.2f осіб%n", SS);
        System.out.printf("P = %.3f KLOC/люд.-міс%n", P);
    }
}
