package homework;

public class Exercise4 {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone(14.5, 10.5, 6.3, 3, 3500, 4, 103);
        phone.printPhoneInfo();

        SmartWatch watch = new SmartWatch(5.5, 3.8, 3.8, 1, 1200, "black", 10.5);
        watch.printWatchInfo();

    }

    public static class SmartDevice {

        //Properties
        double screenSize;
        double deviceHeight;
        double deviceLength;
        int buttonsNumb;
        int batteryCapacity;

        //Constructor
        public SmartDevice(){

        }

        public SmartDevice(double screenSize, double deviceHeight, double deviceLength, int buttonsNumb, int batteryCapacity){
            this.screenSize = screenSize;
            this.deviceHeight = deviceHeight;
            this.deviceLength = deviceLength;
            this.buttonsNumb = buttonsNumb;
            this.batteryCapacity = batteryCapacity;

        }

        //Methods
        public void printInfo(){
            System.out.println("The screen size inches is: " + screenSize);
            System.out.println("The device height inches is: " + deviceHeight);
            System.out.println("The device length inches is: " + deviceLength);
            System.out.println("The buttons number is: " + buttonsNumb);
            System.out.println("The battery capacity in amps is: " + batteryCapacity);

        }

    }

    public static class SmartPhone extends SmartDevice{

        //Unique properties
        int camerasNumb;
        int principalCameraRes;

        //Constructor
        public SmartPhone(double screenSize, double deviceHeight, double deviceLength, int buttonsNumb, int batteryCapacity, int camerasNumb, int principalCameraRes) {
            super(screenSize, deviceHeight, deviceLength, buttonsNumb, batteryCapacity);
            this.camerasNumb = camerasNumb;
            this.principalCameraRes = principalCameraRes;

        }

        //Methods
        public void printPhoneInfo(){
            System.out.println("Smart phone properties");
            super.printInfo();
            System.out.println("The cameras number is: " + camerasNumb);
            System.out.println("The principal camera megapixel resolution is: " + principalCameraRes);
        }
    }

    public static class SmartWatch extends SmartDevice{

        //Unique properties
        String bandColor;
        double bandLength;

        //Constructor
        public SmartWatch(double screenSize, double deviceHeight, double deviceLength, int buttonsNumb, int batteryCapacity, String bandColor, double bandLength) {
            super(screenSize, deviceHeight, deviceLength, buttonsNumb, batteryCapacity);
            this.bandColor = bandColor;
            this.bandLength = bandLength;

        }

        //Methods
        public void printWatchInfo(){
            System.out.println("Smart watch properties");
            super.printInfo();
            System.out.println("The band watch color is: " + bandColor);
            System.out.println("The band watch length inches is: " + bandLength);

        }

    }

}
