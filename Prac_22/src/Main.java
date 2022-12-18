import java.util.Stack;

public class Main {
    public static double RPNcalc(String input){
        Stack<Double> numbers = new Stack<Double>();
        while (!input.isEmpty()){
            //System.out.println(numbers);
            if (Character.isDigit(input.charAt(0))){
                numbers.add(((double) input.charAt(0))-48);
                input = input.substring(1);
            }
            else{
                switch (input.charAt(0)){
                    case '+':
                        numbers.add(numbers.pop()+numbers.pop());
                        break;
                    case '-':
                        numbers.add(-numbers.pop()+numbers.pop());
                        break;
                    case '*':
                        numbers.add(numbers.pop()*numbers.pop());
                        break;
                    case '/':
                        numbers.add(1/numbers.pop()*numbers.pop());
                        break;
                }
                input = input.substring(1);
            }
        }
        return numbers.pop();
    }
    public static void main(String[] args) {
        System.out.println(Main.RPNcalc("23+"));
        System.out.println(Main.RPNcalc("23*45*+"));
        System.out.println(Main.RPNcalc("23456*+-/"));

    }
}