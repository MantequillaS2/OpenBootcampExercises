public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setAge(25);
        int age = person.getAge();
        System.out.println(age);

        person.setName("Manuel");
        System.out.println(person.getName());

        person.setPhone("55 48 07 56 40");
        System.out.println(person.getPhone());
    }
}

class Person {
    private int age;
    private String name;
    private String phone;

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return this.phone;
    }
}