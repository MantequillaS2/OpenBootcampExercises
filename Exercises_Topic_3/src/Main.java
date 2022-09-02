public class Main {
    public static void main(String[] args) {
        int result;
        result = addition(5, 6, 10);
        System.out.println("The sum is equal to:");
        System.out.println(result);

        Car myCar = new Car();
        myCar.add_door();
        System.out.println("Number of doors: ");
        System.out.println(myCar.door);
    }
    public static int addition(int a, int b, int c){
            return a + b + c;
        }
    static class Car {
        public int door =  2;
        public void add_door() {
            this.door++;
        }
}
}
