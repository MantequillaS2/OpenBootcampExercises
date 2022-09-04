public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.age = 40;
        client.name = "Aldo";
        client.phone = "55 5680 2034";
        client.credit = 30000;
        System.out.println("Age: " + client.age + " Name: " + client.name + " Phone: " + client.phone + " Credit: " + client.credit);

        Worker worker = new Worker();
        worker.age = 45;
        worker.name = "Ruben";
        worker.phone = "55 4532 6589";
        worker.income = 12000;
        System.out.println("Age: " + worker.age + " Name: " + worker.name + " Phone: " + worker.phone + " Income: " + worker.income);
    }
}
class Person {
    public int age;
    public String name;
    public String phone;
}
class Client extends Person {
    public int credit;
}
class Worker extends Person {
    public int income;
}