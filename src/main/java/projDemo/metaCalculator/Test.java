package projDemo.metaCalculator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InputValueException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Total Units ^^");
        Unit unit = new Unit();
        try {
            unit.setInputUnit(scan.nextInt());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        AbstractCalculateUnitPrice abstractUnitCondition = new AbstractCalculateUnitPrice(unit);
        abstractUnitCondition.calculateUnitToPrice();
        scan.close();
    }
}
