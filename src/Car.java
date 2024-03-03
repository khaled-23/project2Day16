public class Car {
    private String code;
    private Route  fixedRoute;
    private int maximumCapacity; // of passenger per trip
    private int availableSeat;

    public Car(String code, Route fixedRoute, int maximumCapacity) {
        this.code = code;
        this.fixedRoute = fixedRoute;
        this.maximumCapacity = maximumCapacity;
        this.availableSeat = maximumCapacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getFixedRoute() {
        return fixedRoute;
    }

    public void setFixedRoute(Route fixedRoute) {
        this.fixedRoute = fixedRoute;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public int getAvailableSeat() {
        return availableSeat;
    }

    public void setAvailableSeat(int availableSeat) {
        this.availableSeat = availableSeat;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }
}
