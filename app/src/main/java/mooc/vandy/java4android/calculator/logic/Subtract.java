package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract extends Calculator{

    Subtract(int argOne,int argTwo){
            super(argOne,argTwo);
        }

        @Override
        public void calc() {
            result = argOne - argTwo;
        }
    }
