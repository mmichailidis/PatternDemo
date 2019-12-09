package gr.mmichailidis.adapter;

import gr.mmichailidis.adapter.other.CoolMethod;

public class CoolMethodAdapter implements Method {
    private CoolMethod coolMethod;

    public CoolMethodAdapter(CoolMethod coolMethod) {
        this.coolMethod = coolMethod;
    }

    public double execute(double x, double y) {
        return coolMethod.doMath(x, y);
    }
}
