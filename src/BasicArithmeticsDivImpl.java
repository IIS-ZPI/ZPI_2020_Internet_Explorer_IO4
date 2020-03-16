public class BasicArithmeticsDivImpl implements IArithmeticsDiv {
    @Override
    public double Division(double a, double b) {
        //remember to catch this exception!!!
        if(a == 0 && b == 0) throw new ArithmeticException("Remember to not perform that operation: 0/0");
        return a/b;
    }
}
