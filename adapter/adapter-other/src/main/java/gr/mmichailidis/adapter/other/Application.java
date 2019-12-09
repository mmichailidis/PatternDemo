package gr.mmichailidis.adapter.other;

public class Application {
    public static void main(String[] args) {
        DivisionCoolMethod divisionCoolMethod = new DivisionCoolMethod();
        CoolCalculator divisionCoolCalculator = new CoolCalculator(divisionCoolMethod);
        double divisionResult = divisionCoolCalculator.doMath(10, 5);
        System.out.println("Division result : " + divisionResult);

        MultiplyCoolMethod multiplyCoolMethod = new MultiplyCoolMethod();
        CoolCalculator multiplyCoolCalculator = new CoolCalculator(multiplyCoolMethod);
        double multiplyResult = multiplyCoolCalculator.doMath(2, 5);
        System.out.println("Multiply result : " + multiplyResult);

    }
}
