import java.time.Duration;
import java.util.*;

class TrafficLight {
    String color;
    double duration;

    TrafficLight(String color, double duration) {
        this.color = color;
        this.duration = duration;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getDuration() {
        return this.duration;
    }

    public void changeColor(double duration) {
        this.duration = duration;
        if(this.duration==100)
        {
            this.color = "Red";
        }
        if(this.duration==200)
        {
            this.color = "green";
        }
    }
        
       
    }
}

public class problem8 {
    public static void main(String[] args) {

    }
}