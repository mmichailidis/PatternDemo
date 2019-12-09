package gr.mmichailidis.adapter;

import gr.mmichailidis.adapter.other.DivisionCoolMethod;
import gr.mmichailidis.adapter.other.MultiplyCoolMethod;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void runMethod() {
        AddMethod addMethod = new AddMethod();
        Calculator addCalculator = new Calculator(addMethod);
        double addResult = addCalculator.runMethod(10, 5);
        assertEquals("Add result was wrong", 15, addResult, 2);

        MinusMethod minusMethod = new MinusMethod();
        Calculator minusCalculator = new Calculator(minusMethod);
        double minusResult = minusCalculator.runMethod(10, 5);
        assertEquals("Minus result was wrong", 5, minusResult, 2);

        MultiplyCoolMethod multiplyCoolMethod = new MultiplyCoolMethod();
        CoolMethodAdapter multiplyAdapter = new CoolMethodAdapter(multiplyCoolMethod);
        Calculator multiplyCalculator = new Calculator(multiplyAdapter);
        double multiplyResult = multiplyCalculator.runMethod(4, 10);
        assertEquals("Multiply result was wrong", 40, multiplyResult, 2);

        DivisionCoolMethod divisionCoolMethod = new DivisionCoolMethod();
        CoolMethodAdapter divisionAdapter = new CoolMethodAdapter(divisionCoolMethod);
        Calculator divisionCalculator = new Calculator(divisionAdapter);
        double divisionResult = divisionCalculator.runMethod(12, 4);
        assertEquals("Division result was wrong", 3, divisionResult, 2);
    }
}