public abstract class Passenger {
    private String name;
    private String ID;
    private Car reservedCar;
    private double tripCost;

    public Passenger(String name, String ID, Car reservedCar, double tripCost) {
        this.name = name;
        this.ID = ID;
        this.reservedCar = reservedCar;
        this.tripCost = tripCost;
    }
    public Passenger(String name,String ID){
        this.name=name;
        this.ID=ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public void reservationDetails(){
        System.out.println(name+" reserved car: "+reservedCar.getCode()+
                "\nsubscriptionType: non subscribed"+
                "\npickUp loc: "+ reservedCar.getFixedRoute().getPickUp()+
                "\ndestination: "+ reservedCar.getFixedRoute().getDestination()+
                "\nprice is: "+  tripCost);

    }

    public abstract void reservation(Car car) throws Exception;

}
