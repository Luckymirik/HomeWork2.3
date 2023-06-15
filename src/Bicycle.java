public class Bicycle extends Transport  {


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
@Override
public void updateTyre() {
    System.out.println("Обслуживаем " + getModelName());
    for (int i = 0; i < this.getWheelsCount(); i++) {
        System.out.println("Меняем покрышку");
    }
}

    @Override
    public void doService() {

        updateTyre();

    }

}
