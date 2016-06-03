package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add extends Calculator{

    Add(int argOne,int argTwo){
        super(argOne,argTwo);
       }

    @Override
    public void calc() {
        result = argOne + argTwo;
    }
}
