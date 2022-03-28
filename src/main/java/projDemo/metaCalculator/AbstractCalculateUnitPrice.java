package projDemo.metaCalculator;

public class AbstractCalculateUnitPrice {
    private int firstP = 35,
            secondP = 50,
            thirdP = 70,
            forthP = 90,
            fifthP = 110,
            sixthP = 120,
            seventhP = 125; //

    private int price1,
                price2,
                price3,
                price4,
                price5,
                price6,
                price7;

    private Unit unit;
    public AbstractCalculateUnitPrice(Unit unit){
        this.unit = unit;
    }

    public void calculateUnitToPrice() throws InputValueException {
        if(unit.getInputUnit()<0){
            throw new InputValueException("InputValue Error");
        }
        else if(unit.getInputUnit()<=30){
            System.out.println("Unit Layers\t\t MMKs \t\t Cost");
            System.out.println("1 to 30 units\t  35   \t\t "+unitToPrice1()+"MMK"+
                                "\n total amount --> "+unitToPrice1()+"MMK");
    }
        else if(unit.getInputUnit()>=31 && unit.getInputUnit()<=50){
            System.out.println("Unit Layers\t\t MMKs \t\t Cost");
            System.out.println("1 to 30 units\t  35   \t\t 1050MMK");
            System.out.println("31 to 50 units\t  50   \t\t "+unitToPrice2()+"MMK"+
                                "\n total amount--> "+totalCostCalculate2()+"MMK");
        }
        else if(unit.getInputUnit()>=51 && unit.getInputUnit()<=75){
            System.out.println("Unit Layers\t\t MMKs \t\t Cost");
            System.out.println("1 to 30 units\t  35   \t\t 1050MMK");
            System.out.println("31 to 50 units\t  50   \t\t 1000MMK");
            System.out.println("51 to 75 units\t  70   \t\t "+unitToPrice3()+"MMK"+
                    "\n total amount--> "+totalCostCalculate3()+"MMK");
        }
        else if(unit.getInputUnit()>=76 && unit.getInputUnit()<=100){
            System.out.println("Unit Layers\t\t MMKs \t\t Cost");
            System.out.println("1 to 30 units\t  35   \t\t 1050MMK");
            System.out.println("31 to 50 units\t  50   \t\t 1000MMK");
            System.out.println("51 to 75 units\t  70   \t\t 1750MMK");
            System.out.println("76 to 100 units\t  90   \t\t "+unitToPrice4()+"MMK"+
                    "\n total amount--> "+totalCostCalculate4()+"MMK");
        }
        else if(unit.getInputUnit()>=101 && unit.getInputUnit()<=150){
            System.out.println("Unit Layers\t\t\t MMKs \t\t\t Cost");
            System.out.println("1 to 30 units\t\t  35   \t\t\t 1050MMK");
            System.out.println("31 to 50 units\t\t  50   \t\t\t 1000MMK");
            System.out.println("51 to 75 units\t\t  70   \t\t\t 1750MMK");
            System.out.println("76 to 100 units\t\t  90   \t\t\t 2250MMK");
            System.out.println("101 to 150 units\t  110   \t\t "+unitToPrice5()+"MMK"+
                    "\n total amount--> "+totalCostCalculate5()+"MMK");
        }
        else if(unit.getInputUnit()>=151 && unit.getInputUnit()<=200){
            System.out.println("Unit Layers\t\t\t MMKs \t\t\t Cost");
            System.out.println("1 to 30 units\t\t  35   \t\t\t 1050MMK");
            System.out.println("31 to 50 units\t\t  50   \t\t\t 1000MMK");
            System.out.println("51 to 75 units\t\t  70   \t\t\t 1750MMK");
            System.out.println("76 to 100 units\t\t  90   \t\t\t 2250MMK");
            System.out.println("101 to 150 units\t  110   \t\t 5500MMK");
            System.out.println("151 to 200 units\t  120   \t\t "+unitToPrice6()+"MMK"+
                    "\n total amount--> "+totalCostCalculate6()+"MMK");
        }
        else if(unit.getInputUnit()>=201){
            System.out.println("Unit Layers\t\t\t MMKs \t\t\t Cost");
            System.out.println("1 to 30 units\t\t  35   \t\t\t 1050MMK");
            System.out.println("31 to 50 units\t\t  50   \t\t\t 1000MMK");
            System.out.println("51 to 75 units\t\t  70   \t\t\t 1750MMK");
            System.out.println("76 to 100 units\t\t  90   \t\t\t 2250MMK");
            System.out.println("101 to 150 units\t  110   \t\t 5500MMK");
            System.out.println("151 to 200 units\t  120   \t\t 6000MMK");
            System.out.println("201 and over units\t  120   \t\t "+unitToPrice7()+"MMK"+
                    "\n total amount--> "+totalCostCalculate7()+"MMK");
        }
    }
    public int unitToPrice1(){
        price1 = unit.getInputUnit()*firstP;
        return price1;
    }
    public int unitToPrice2(){
        price1 = 30*firstP;
        price2 = (unit.getInputUnit()-30)*secondP;
        return price2;
    }
    public int totalCostCalculate2(){
        price1 = 30*firstP;
        price2 = (unit.getInputUnit()-30)*secondP;
        return price1+price2;
    }
    public int unitToPrice3(){
        price1 = 30*firstP;
        price2 = 20*secondP;
        price3 = (unit.getInputUnit()-50)*thirdP;
        return price3;
    }
    public int totalCostCalculate3(){
        price1 = 30*firstP;
        price2 = 20*secondP;
        price3 = (unit.getInputUnit()-50)*thirdP;
        return price1+price2+price3;
    }
    public int unitToPrice4(){
        price1 = 30*firstP;
        price2 = 20*secondP;
        price3 = 25*thirdP;
        price4 = (unit.getInputUnit()-75)*forthP;
        return price4;
    }
    public int totalCostCalculate4(){
        price1 = 30*firstP;
        price2 = 20*secondP;
        price3 = 25*thirdP;
        price4 = (unit.getInputUnit()-75)*forthP;
        return price1+price2+price3+price4;
    }
    public int unitToPrice5(){
        price1 = 30*firstP;
        price2 = 20*secondP;
        price3 = 25*thirdP;
        price4 = 25*forthP;
        price5 = (unit.getInputUnit()-100)*fifthP;
        return price5;
    }
    public int totalCostCalculate5(){
        price1 = 30*firstP;
        price2 = 20*secondP;
        price3 = 25*thirdP;
        price4 = 25*forthP;
        price5 = (unit.getInputUnit()-100)*fifthP;
        return price1+price2+price3+price4+price5;
    }
    public int unitToPrice6(){
        price1 = 30*firstP;
        price2 = 20*secondP;
        price3 = 25*thirdP;
        price4 = 25*forthP;
        price5 = 50*fifthP;
        price6 = (unit.getInputUnit()-150)*sixthP;
        return price6;
    }
    public int totalCostCalculate6(){
        price1 = 30*firstP;
        price2 = 20*secondP;
        price3 = 25*thirdP;
        price4 = 25*forthP;
        price5 = 50*fifthP;
        price6 = (unit.getInputUnit()-150)*sixthP;
        return price1+price2+price3+price4+price5+price6;
    }
    public int unitToPrice7(){
        price1 = 30*firstP;
        price2 = 20*secondP;
        price3 = 25*thirdP;
        price4 = 25*forthP;
        price5 = 50*fifthP;
        price6 = 50*sixthP;
        price7 = (unit.getInputUnit()-200)*seventhP;
        return price7;
    }
    public int totalCostCalculate7(){
        price1 = 30*firstP;
        price2 = 20*secondP;
        price3 = 25*thirdP;
        price4 = 25*forthP;
        price5 = 50*fifthP;
        price6 = 50*sixthP;
        price7 = (unit.getInputUnit()-200)*seventhP;
        return price1+price2+price3+price4+price5+price6+price7;
    }
}
