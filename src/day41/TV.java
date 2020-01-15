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

    // we can not set a channel if the TV is off!!!
    public void setCurrentChannel(int newChannel) {

        if (isOn == true) {
            currentChannel = newChannel;
        } else {
            System.out.println("TURN ON THE TV FIRST");
        }

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


    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
