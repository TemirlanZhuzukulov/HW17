public class Apartment extends Family {

    public Apartment(Person[] people) {
        super(people);
    }

    @Override
    public void comService() {
       int summa=3000* (people.length)+500*(people.length);
        System.out.println(summa);
    }
}
