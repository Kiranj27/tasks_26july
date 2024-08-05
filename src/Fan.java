public class Fan {
    private String color;
    private String dimension;
    private boolean isOn;

    public Fan(String color, String dimension) {
        this.color = color;
        this.dimension = dimension;
        this.isOn = false;
    }

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
    }

    public boolean isSwitchedOn() {
        return isOn;
    }

    public void printSpecification() {
        System.out.println("Fan Color: " + color);
        System.out.println("Fan Dimension: " + dimension);
        System.out.println("Fan is " + (isOn ? "On" : "Off"));
    }

    public static void main(String[] args) {
        Fan fan = new Fan("Black", "16 inches");
        fan.printSpecification();
        fan.switchOn();
        System.out.println("Is fan switched on? " + fan.isSwitchedOn());
        fan.printSpecification();
    }
}
