public class ComplexFactory implements ComplexAbstractFactory{
    @Override
    public Complex CreateComplex(int real, int image) {
        return new Complex(real, image);
    }

    @Override
    public Complex createComplex() {
        return new Complex(0,0);
    }
}
