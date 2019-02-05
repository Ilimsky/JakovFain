package L_Input;

public class Fish extends Pet {
    int currentDepth = 0;
    final int DEFAULT_DIVING = 5;

    public int dive(){
        currentDepth = currentDepth + DEFAULT_DIVING;
        if (currentDepth > 100){
            System.out.println("Я маленькая рыбка и не могу нырять глубже 100 метров");
            currentDepth = currentDepth - DEFAULT_DIVING;
        }else {
            System.out.println("Погружаюсь на " + DEFAULT_DIVING + " м");
            System.out.println("Я на " + currentDepth + " метров ниже уровня моря");
        }
        return currentDepth;
    }

    public int dive(int howDeep){
        currentDepth = currentDepth + howDeep;
        if (currentDepth > 100){
            System.out.println("Я маленькая рыбка и не могу нырять глубже 100 метров");
            currentDepth = currentDepth - howDeep;
        }else {
            System.out.println("Погружаюсь на " + howDeep + " м");
            System.out.println("Я на " + currentDepth + " м ниже уровня моря");
        }
        return howDeep;
    }

    public String say(String something){
        return "Ты не знаешь, что рыбы не умеют разговаривать?";
    }

    Fish(int startingPosition){
        currentDepth = startingPosition;
    }
}
