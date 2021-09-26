package chapterThree;

public class Bike {
    private boolean isOn;
    private int acceleration;
    private String gearName;



    public void speed(int currentSpeed) {
        acceleration = currentSpeed;
    }

    public void turnOn(boolean onBike) {
        if (onBike == true) {
            isOn = true;
        }
        if (onBike == false) {
            acceleration = 0;
            isOn = false;
        }

    }


    public void accelerateByAutomatedGears() {
        if (isOn == true) {
            if (acceleration >= 0 && acceleration <= 20) {
                acceleration = acceleration + 1;
                gearName = "gear one";

            }
            if (acceleration >= 21 && acceleration <= 30) {
                acceleration = acceleration + 2;
                gearName = "gear two";
            }
            if (acceleration > 30 && acceleration <= 40) {
                acceleration = acceleration + 3;
                gearName = "gear three";
            }
            if (acceleration > 40) {
                acceleration = acceleration + 4;
                gearName = "gear four";
            }

        }
    }


    public void decelerateByAutomatedGears() {
        if (isOn == true) {
            if (acceleration >= 0 && acceleration <= 20) {
                acceleration = acceleration - 1;
                gearName = "gear one";

            }
            if (acceleration > 20 && acceleration <= 30) {
                acceleration = acceleration - 2;
                gearName = "gear two";
            }
            if (acceleration > 30 && acceleration <= 40) {
                acceleration = acceleration - 3;
                gearName = "gear three";
            }
            if (acceleration > 40) {
                acceleration = acceleration - 4;
                gearName = "gear four";
            }

        }
    }

    public void displayGearNumber(){
        System.out.println(gearName);
    }


    public int getAcceleration(){

        return  acceleration;
    }
    public boolean isOn(){
        return isOn;

    }
    public String getGearName(){
        return gearName;

    }

}
