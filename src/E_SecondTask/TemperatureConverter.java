package E_SecondTask;

public class TemperatureConverter {

    public String convertTemp(int temperature, char convertTo){
        String stringTemperature = null;
        if (convertTo == 'F'){
            stringTemperature = temperature + " по Фаренгейту";
        }else if(convertTo == 'C'){
            stringTemperature = temperature + " по Цельсию";
        }
        return stringTemperature;
    }

    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        System.out.println(temperatureConverter.convertTemp(1000, 'F'));
    }
}