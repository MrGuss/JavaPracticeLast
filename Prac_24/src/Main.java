public class Main {
    public static void main(String[] args) {
        ComplexFactory factory = new ComplexFactory();
        Complex testNull = factory.createComplex();
        Complex testFull = factory.CreateComplex(1,2);
        System.out.println(testNull);
        System.out.println(testFull);
    }
}