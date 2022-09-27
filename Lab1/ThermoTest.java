// Coded 25/09/2022
public class ThermoTest {
    public static void main(String[] args) {
        Thermometer thermA = new Thermometer();

        System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
        thermA.setCelsius(20.0);
        System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );

        Thermometer thermB = new Thermometer();

        thermB.setCelsius(10.0);

        double tempB = thermB.getCelsius();

        System.out.println("Temp. of Thermometer B is " + tempB);
    }
}
