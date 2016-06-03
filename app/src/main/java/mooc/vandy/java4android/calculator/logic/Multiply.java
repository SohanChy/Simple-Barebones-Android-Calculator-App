package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply extends Calculator{

    Multiply(int argOne,int argTwo){
        super(argOne,argTwo);
    }

    @Override
    public void calc() {
        result = argOne * argTwo;
    }
}
