package mooc.vandy.java4android.calculator.logic;

//Abstract Base class Calculator for maximum code reuse.
abstract class Calculator implements CalcOperateInterface{
    protected int argOne,argTwo,result;

    Calculator(int argOne,int argTwo){
        this.argOne = argOne;
        this.argTwo = argTwo;
        calc();
    }

    //Main calculation logic is abstracted
    abstract public void calc();

    public int operate() {
        calc();
        return getResult();
    }

    public int operate(int argOne, int argTwo) {
        setArgs(argOne,argTwo);
        return operate();
    }


    @Override
    public String toString() {
        return String.valueOf(getResult());
    }

    //get methods
    public int getResult() {
        return result;
    }

    public int getArgOne() {
        return argOne;
    }

    public int getArgTwo() {
        return argTwo;
    }

    //set methods
    public void setArgs(int argOne, int argTwo) {
        this.argOne = argOne;
        this.argTwo = argTwo;
    }

    public void setArgOne(int argOne) {
        this.argOne = argOne;
    }

    public void setArgTwo(int argTwo) {
        this.argTwo = argTwo;
    }
}