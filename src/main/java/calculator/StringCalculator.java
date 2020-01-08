package calculator;

public class StringCalculator {
    public String add(String numbers){
        if (numbers.isEmpty())
            return "";

        String[] numberList = numbers.split(",");
        int result = 0;
        for (String s : numberList) {
            result += Integer.parseInt(s);
        }
        return String.valueOf(result);
    }
}
