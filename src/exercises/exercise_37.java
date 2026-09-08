package src.exercises;

public class exercise_37 {

    public interface calculator {
        double calculate(double n1, double n2);
    }

    public enum Operators implements calculator {
        ADD('+') {

            @Override
            public double calculate(double n1, double n2) {
                return n1 + n2;
            }
        },
        SUB('-') {

            @Override
            public double calculate(double n1, double n2) {
                return n1 - n2;
            }
        },
        MUL('*') {

            @Override
            public double calculate(double n1, double n2) {
                return n1 * n2;
            }
        },
        DIV('/') {

            @Override
            public double calculate(double n1, double n2) {
                return n1 / n2;
            }
        };

        public final char operator;

        Operators(char operator) {
            this.operator = operator;
        }

        @Override
        public String toString() {
            return String.valueOf(this.operator);
        }
    }

    public static void main(String[] args) {

        double n1 = 10.0;
        double n2 = 20.0;

        Operators op = Operators.ADD;
        System.out.println(n1 + " " + op + " " + n2 + " = " + op.calculate(n1, n2));

        op = Operators.SUB;
        System.out.println(n1 + " " + op + " " + n2 + " = " + op.calculate(n1, n2));

        op = Operators.MUL;
        System.out.println(n1 + " " + op + " " + n2 + " = " + op.calculate(n1, n2));

        op = Operators.DIV;
        System.out.println(n1 + " " + op + " " + n2 + " = " + op.calculate(n1, n2));


    }

}
