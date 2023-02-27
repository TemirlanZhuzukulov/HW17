public class Home extends Family{
    public Home(Person[] people) {
        super(people);
    }

    @Override
    public void comService() {
     int summa=500* (people.length+1);
        System.out.println(summa);
    }
}
