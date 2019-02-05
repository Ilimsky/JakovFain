package A_Example;

public class Fish extends Pet{
    int currentDepth = 0;

    public int dive(int howDeep){
        currentDepth = currentDepth + howDeep;

        if (currentDepth > 100){
            System.out.println("Я маленькая рыбка " +
                    "и не могу плавать глубже 100 метров");
            currentDepth = currentDepth - howDeep;
        } else {
            System.out.println("Погружаюсь еще на " + howDeep + " метров");
            System.out.println("Я на глубине " + currentDepth + " метров");
        }
        //System.out.println("Ныряю на глубину " + howDeep + " футов ниже уровня моря");
        //System.out.println("Я на глубине " + currentDepth + " футов ниже уровня моря");
        return currentDepth;
    }

    public String say(String something){
        //return "Ты че не знаешь, что рыбы не разговаривают?";
        return "Разве вы не знаете, что рыбы не разговаривают?";
    }
}
