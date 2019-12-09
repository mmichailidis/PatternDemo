package gr.mmichailidis.adapter.other;

public class CoolCalculator {
    CoolMethod coolMethod;

    public CoolCalculator(CoolMethod coolMethod) {
        this.coolMethod = coolMethod;
    }

    public double doMath(double x, double y) {
        return coolMethod.doMath(x, y);
    }
}
