public class SubscriberPassenger extends Passenger{



    public SubscriberPassenger(String name, String ID, Car reservedCar, double tripCost) {
        super(name, ID, reservedCar, tripCost);
    }

    public SubscriberPassenger(String name, String ID) {
        super(name, ID);
    }

    @Override
    public void reservation(Car car) throws Exception{
        if(car.getAvailableSeat()==0){
            throw new Exception("car: "+car.getCode()+" is full");
        }else {
            car.setAvailableSeat(car.getAvailableSeat()-1);
            super.setReservedCar(car);
        }
        super.setTripCost(car.getFixedRoute().getTripCost()-(car.getFixedRoute().getTripCost()*0.5));
    }
    @Override
    public void reservationDetails(){
        System.out.println(super.getName()+" reserved car: "+super.getReservedCar().getCode()+
                "\nsubscription type: Subscribed"+
                "\npickUp loc: "+ super.getReservedCar().getFixedRoute().getPickUp()+
                "\ndestination: "+ super.getReservedCar().getFixedRoute().getDestination()+
                "\nprice is: "+  super.getTripCost());

    }
}
