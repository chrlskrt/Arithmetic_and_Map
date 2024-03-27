package Arithmetic;

public class Arithmetic <Number1 extends Number, Number2 extends Number> {
    Number1 num1;
    Number2 num2;
    public Arithmetic(Number1 num1, Number2 num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public Number add(){
        return num1.doubleValue() + num2.doubleValue();
    }

    public Number subtract(){
        return num1.doubleValue() - num2.doubleValue();
    }

    public Number multiply(){
        return num1.doubleValue() * num2.doubleValue();
    }

    public Number divide(){
        if (num2.doubleValue() == 0){
            throw new ArithmeticException("Cannot divide by 0.");
        }

        return num1.doubleValue() / num2.doubleValue();
    }

    public Number getMin(){
        if (num1.doubleValue() < num2.doubleValue()){
            return num1;
        }

        return num2;
    }

    public Number getMax(){
        if (num1.doubleValue() > num2.doubleValue()){
            return num1;
        }

        return num2;
    }

    /* USING WILDCARD as return type */
//    public <N extends Number> N add(){
//        double res = num1.doubleValue() + num2.doubleValue();
//        return getType(res);
//    }
//
//    public <N extends Number> N subtract(){
//        double res = num1.doubleValue() - num2.doubleValue();
//        return getType(res);
//    }
//
//    public <N extends Number> N multiply(){
//        double res = num1.doubleValue() * num2.doubleValue();
//        return getType(res);
//    }
//
//    public double divide(){
//        if (num2.doubleValue() == 0){
//            throw new ArithmeticException("Cannot divide by 0.");
//        }
//
//        return num1.doubleValue() / num2.doubleValue();
//    }

//    public <N extends Number> N getMin(){
//        if (num1.doubleValue() < num2.doubleValue()){
//            return (N) num1;
//        }
//
//        return (N) num2;
//    }
//
//    public <N extends Number> N getMax(){
//        if (num1.doubleValue() > num2.doubleValue()){
//            return (N) num1;
//        }
//
//        return (N) num2;
//    }
//
//    public <N extends Number> N getType(double res){
//        if (num1.getClass().equals(Double.class) || num2.getClass().equals(Double.class)){
//            return (N) Double.valueOf(res);
//        }
//
//        if (num1.getClass().equals(Float.class) || num2.getClass().equals(Float.class)){
//            return (N) Float.valueOf((float) res);
//        }
//
//        if (num1.getClass().equals(Long.class) || num2.getClass().equals(Long.class)){
//            return (N) Long.valueOf((long) res);
//        }
//
//        if (num1.getClass().equals(Integer.class) || num2.getClass().equals(Integer.class)){
//            return (N) Integer.valueOf((int) res);
//        }
//
//        if (num1.getClass().equals(Short.class) || num2.getClass().equals(Short.class)){
//            return (N) Short.valueOf((short) res);
//        }
//
//        return null;
//    }
}
