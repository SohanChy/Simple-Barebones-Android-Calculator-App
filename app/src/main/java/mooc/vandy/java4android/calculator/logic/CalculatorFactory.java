package mooc.vandy.java4android.calculator.logic;

//Factory Class to construct appropriate Calculator Subclass
public class CalculatorFactory {
    public static Calculator getCalculator(int argOne,int argTwo,int calcType){

        Calculator Calc;

        if(calcType == Calculator.ADD){
            Calc = new Add(argOne,argTwo);
        }
        else if(calcType == Calculator.SUBTRACT){
            Calc = new Subtract(argOne,argTwo);
        }
        else if(calcType == Calculator.MULTIPLY){
            Calc = new Multiply(argOne,argTwo);
        }
        else if(calcType == Calculator.DIVIDE){
            Calc = new Divide(argOne,argTwo);
        }
        else{
            Calc = null;
        }

        return Calc;
    }
}
