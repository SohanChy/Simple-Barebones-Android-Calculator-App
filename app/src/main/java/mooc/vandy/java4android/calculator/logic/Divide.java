package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide extends Calculator{

    //Special variable in Divide subclass for extended functionality
    private int remainder;

    Divide(int argOne,int argTwo){
        super(argOne,argTwo);
    }

    @Override
    public void calc() {

        if(argTwo != 0) {
            result = argOne / argTwo;
            remainder = argOne % argTwo;
        }
        else {
            result = remainder = 0;
        }

    }

    @Override
    public String toString() {
        return super.toString()+" R: "+remainder;
    }
}
