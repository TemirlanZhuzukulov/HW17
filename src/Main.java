public class Main {
    public static void main(String[] args) {
    Person person1= new Person("Aman");
    Person person2= new Person("Uson");
    Person person3= new Person("Asan");
    Person person4= new Person("Aktan");
    Person person5= new Person("Altyn");

    Person [] peopleInHome={person1,person2,person3,person4,person5};


    Person person6= new Person("Sanjar");
    Person person7= new Person("Abdumomun");
    Person person8= new Person("Erjgit");

    Person[] peopleInAppartment={person6,person7,person8};

    Person person9= new Person("Aizat");
    Person person10= new Person("Ernazar");

    Person [] peopleInHotel={person9,person10};

    Home home= new Home(peopleInHome);
        System.out.println(home);
    home.comService();

    Apartment apartment= new Apartment(peopleInAppartment);
        System.out.println(apartment);
        apartment.comService();

        Hotel hotel= new Hotel(peopleInHotel);
        System.out.println(hotel);
        hotel.comService();

    }
}