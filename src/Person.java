public class Person {
    private String quantity;

    public Person(String quantity) {
        this.quantity = String.valueOf(quantity);
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = String.valueOf(quantity);
    }

    @Override
    public String toString() {
        return "Person{" +
                "quantity=" + quantity +
                '}';
    }
}
