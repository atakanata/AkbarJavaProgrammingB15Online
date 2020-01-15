package day41;

/**
 * TV
 * attributes :
 * brand , isOn , currentChannel
 * String , boolean , int   (range from 1-50)
 * behaviours :
 * turnOn
 * turnOff
 * getCurrentChannel
 * setCurrentChannel (newChannelNumber)
 * moveForward
 * moveBackward
 */
public class TV {

    String name;
    boolean isOn;
    int currentChannel;

    /**
     * A method to return the value of current channel for the TV
     *
     * @return the value of current channel for the TV
     */
    public int getCurrentChannel() {
        return currentChannel;
    }


    public void turnOn() {


        if (isOn == false) { // checking for equality
            System.out.println("Turning on TV");
            isOn = true; // assigning the value of isOn to true
        }
    }

    public void turnOff() {

        // if(isOn){ // this will also
        if (isOn == true) {

            System.out.println("Turning off TV");
            isOn = false;

        }

    }


}
