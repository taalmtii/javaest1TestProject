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


}
