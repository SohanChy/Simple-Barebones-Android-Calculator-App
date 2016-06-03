package mooc.vandy.java4android.calculator.logic;

//Interface for all Calculator Classes
public interface CalcOperateInterface{
    public static final int ADD = 1;
    public static final int SUBTRACT = 2;
    public static final int MULTIPLY = 3;
    public static final int DIVIDE = 4;

    public void calc();
    public int operate();
    public int operate(int argOne,int argTwo);

    public int getArgOne();
    public int getArgTwo();
    public int getResult();

    public void setArgs(int argOne, int argTwo);
    public void setArgOne(int argOne);
    public void setArgTwo(int argTwo);
}