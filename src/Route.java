public class Route {
    private String pickUp;
    private String destination;
    private double tripCost;

    public Route(String pickUp, String destination, double tripCost) {
        this.pickUp = pickUp;
        this.destination = destination;
        this.tripCost = tripCost;
    }

    public String getPickUp() {
        return pickUp;
    }

    public void setPickUp(String pickUp) {
        this.pickUp = pickUp;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

}
