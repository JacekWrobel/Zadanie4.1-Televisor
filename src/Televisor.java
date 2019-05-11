public class Televisor {
    boolean status = false;

    boolean turnOn(){
        return status = true;
    }
    boolean turnOff(){
        return status = false;
    }
    String showStatus(){
        return "Televisor jest właczony: " +status;
    }
}
