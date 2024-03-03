public class NonSubscriberPassenger extends Passenger{
    private boolean discountCoupon;

    public NonSubscriberPassenger(String name, String ID, Car reservedCar, double tripCost, boolean discountCoupon) {
        super(name, ID, reservedCar, tripCost);
        this.discountCoupon = discountCoupon;
    }

    public NonSubscriberPassenger(String name, String ID) {
        super(name, ID);
    }

    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }

    @Override
    public void reservation(Car car) throws Exception{

        if(car.getAvailableSeat()==0){
            throw new Exception("car: "+car.getCode()+" is full");
        }else {
            car.setAvailableSeat(car.getAvailableSeat()-1);
            super.setReservedCar(car);
        }

        if(discountCoupon){
            super.setTripCost(car.getFixedRoute().getTripCost()-(car.getFixedRoute().getTripCost()*0.1));
        }else super.setTripCost(car.getFixedRoute().getTripCost());
    }
    @Override
    public void reservationDetails(){
        System.out.println(super.getName()+" reserved car: "+super.getReservedCar().getCode()+
                "\nsubscription type: non-subscribed"+
                "\ndiscountCoupon: "+ discountCoupon +
                "\npickUp loc: "+ super.getReservedCar().getFixedRoute().getPickUp()+
                "\ndestination: "+ super.getReservedCar().getFixedRoute().getDestination()+
                "\nprice is: "+  super.getTripCost());

    }


}
