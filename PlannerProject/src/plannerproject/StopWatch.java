/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plannerproject;

/**
 *
 * @author colmm
 */
public class StopWatch extends Planner{
    private String time;
    private int duration;

    public StopWatch(String subject, String topic, String date, String time, int duration) {
        super(subject, topic, date, time, duration);
        this.time = time;
        this.duration = duration;
    }

    public StopWatch() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    
    
    

    

    

    
    
    
}
