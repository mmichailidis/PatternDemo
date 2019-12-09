package gr.mmichailidis.adapter;

public class Calculator {
    private Method method;

    public Calculator(Method method) {
        this.method = method;
    }

    public double runMethod(double x, double y) {
        return method.execute(x, y);
    }
}
