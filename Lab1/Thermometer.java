public class Thermometer {
    private double celsius;

    public Thermometer() {
        this.celsius = 0;
    }

    public Thermometer(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}
