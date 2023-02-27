import java.util.Arrays;

public class Family implements Comservice{
    Person [] people;
    @Override
    public void comService() {

    }

    public Family(Person[] people) {
        this.people = people;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Family{" +
                "people=" + Arrays.toString(people) +
                '}';
    }
}
