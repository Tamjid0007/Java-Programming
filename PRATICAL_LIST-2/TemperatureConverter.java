public class TemperatureConverter {

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double fahrenheitValue = 93.1;
        double celsiusValue = converter.fahrenheitToCelsius(fahrenheitValue);
        System.out.println(fahrenheitValue + " Fahrenheit is equal to " + celsiusValue + " Celsius.");

        celsiusValue = 29;
        fahrenheitValue = converter.celsiusToFahrenheit(celsiusValue);
        System.out.println(celsiusValue + " Celsius is equal to " + fahrenheitValue + " Fahrenheit.");
    }
}
