package bean;
import bean.Vehicle;
public class Car {
    private String Company,model;
    private Vehicle vehicle;

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Company='" + Company + '\'' +
                ", model='" + model + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }
}
