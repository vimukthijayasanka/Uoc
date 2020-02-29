package lk.uot.vimukthi;

    public class sensors {


    public String name;

    public sensors(String name, double value) {
        this.name = name;
        this.value = value;
    }
        private double value;

    @Override
    public String toString() {
        return "Sensors{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public String getName() { return name; }

    public void setName(String name) {this.name = name; }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
