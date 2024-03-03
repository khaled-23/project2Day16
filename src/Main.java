import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Route route1 = new Route("pickupLoc1", "dropLoc1",17);
        Route route2 = new Route("pickupLoc2","dropLoc2",23);


        Car car1 = new Car("c01",route1, 5);
        Car car2 = new Car("c02",route2, 0);

        SubscriberPassenger sp1 = new SubscriberPassenger("ahmed","sp001");
        NonSubscriberPassenger nsp1 = new NonSubscriberPassenger("omar","nsp001");
        NonSubscriberPassenger nsp2 = new NonSubscriberPassenger("nasser","nsp002");
        nsp2.setDiscountCoupon(true);

        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        passengers.add(sp1);
        passengers.add(nsp1);
        passengers.add(nsp2);

        System.out.println("if the car has available seats:-");
        System.out.println("available seat: "+car1.getAvailableSeat());
        for(Passenger p:passengers){
            try {
                p.reservation(car1);
                p.reservationDetails();

            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("-------------------");
            System.out.println("available seat: "+car1.getAvailableSeat());
        }

        System.out.println("if the car doesn't have available seats:-");
        try{
            nsp1.reservation(car2);
            nsp1.reservationDetails();
        }catch(Exception e){
            System.out.println(e);
        }



    }
}