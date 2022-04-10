package bean;

public class Vehicle {
    private int vehicle_number;
    private String color;
    private String owner_name;

    public int getVehicle_number() {
        return vehicle_number;
    }

    public void setVehicle_number(int vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicle_number=" + vehicle_number +
                ", color='" + color + '\'' +
                ", owner_name='" + owner_name + '\'' +
                '}';
    }
}
