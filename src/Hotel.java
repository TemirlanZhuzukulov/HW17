public class Hotel extends Family{
    public Hotel(Person[] people) {
        super(people);
    }

    @Override
    public void comService() {
      int summa=2*500;
        System.out.println(summa);
    }
}
