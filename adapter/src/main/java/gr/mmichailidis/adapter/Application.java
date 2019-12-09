package gr.mmichailidis.adapter;

import gr.mmichailidis.adapter.other.DivisionCoolMethod;
import gr.mmichailidis.adapter.other.MultiplyCoolMethod;

public class Application {
    public static void main(String[] args) {
        AddMethod addMethod = new AddMethod();
        Calculator addCalculator = new Calculator(addMethod);
        double addResult = addCalculator.runMethod(10, 5);
        System.out.println("Add result : " + addResult);

        MinusMethod minusMethod = new MinusMethod();
        Calculator minusCalculator = new Calculator(minusMethod);
        double minusResult = minusCalculator.runMethod(10, 5);
        System.out.println("Minus result : " + minusResult);

        MultiplyCoolMethod multiplyCoolMethod = new MultiplyCoolMethod();
        CoolMethodAdapter multiplyAdapter = new CoolMethodAdapter(multiplyCoolMethod);
        Calculator multiplyCalculator = new Calculator(multiplyAdapter);
        double multiplyResult = multiplyCalculator.runMethod(4, 10);
        System.out.println("Multiply result : " + multiplyResult);

        DivisionCoolMethod divisionCoolMethod = new DivisionCoolMethod();
        CoolMethodAdapter divisionAdapter = new CoolMethodAdapter(divisionCoolMethod);
        Calculator divisionCalculator = new Calculator(divisionAdapter);
        double divisionResult = divisionCalculator.runMethod(12, 4);
        System.out.println("Division result : " + divisionResult);
    }
}
