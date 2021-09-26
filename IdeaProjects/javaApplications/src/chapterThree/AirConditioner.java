package chapterThree;

public class AirConditioner {
    private boolean isOn;
    private String productName;
    private int temperature = 16;

    public void decreaseTemperature() {
        if (isOn == true) {
            if (temperature > 16) {
                temperature = temperature - 1;
            }
        }
    }
    public void increaseTemperature() {
        if (temperature < 30) {

        temperature = temperature + 1;
        }
    }

    public String getProductName(){

        return productName;
    }

    public int getTemperature(){
        return temperature;
    }
    public boolean isOn(){
        return isOn;
    }

    public void setOn(boolean onAc){

        if(onAc == true) {
            isOn = true;
        }
            if(onAc != true){
                isOn = false;
                temperature = 0;
        }
    }
    public void setProductName(String nameOfAc) {
        productName = nameOfAc;

    }
}
