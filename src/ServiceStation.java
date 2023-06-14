public class ServiceStation  {

    public void check(Car car) {
        car.checkWheels();

car.checkEngine();
    }public void check(Truck truck) {

        truck.checkWheels();

        truck.checkEngine();
        truck.checkTrailer();
    }

    public void check(Bicycle bicycle) {
        bicycle.checkWheels();




    }


}
