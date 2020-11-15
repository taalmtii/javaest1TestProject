public class Calculator {

    public static Integer times = 0;

    public Integer add(Integer firstNumber, Integer secondNumber){
       return addPrivate(firstNumber, secondNumber);
    }

    private Integer addPrivate(Integer first, Integer second){
        return first + second;
    }

    public Boolean isBiggerThan(Integer value, Integer compareValue){
        return value > compareValue;
    }

    public Integer division(Integer firstNumber, Integer secondNumber){
        if(secondNumber == 0){
            throw new ArithmeticException("divide by 0");
        }
        return firstNumber / secondNumber;
    }

    public Boolean isBiggerThanZero(Integer value){
        return value > 0;
    }


}
