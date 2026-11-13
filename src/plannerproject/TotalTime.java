/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plannerproject;

/**
 *
 * @author colmm
 */
public class TotalTime extends Planner {
    private String time;
    private int totalDuration;

    public TotalTime(String time, int totalDuration, String subject, String topic, String date) {
        super(subject, topic, date, time, totalDuration);
        this.time = time;
        this.totalDuration = totalDuration;
    }

    public TotalTime() {
        
    }

    public String getTime() {
        return time;
    }

    public int getTotalDuration() {
        return totalDuration;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setTotalDuration(int totalDuration) {
        this.totalDuration = totalDuration;
    }
    
    
}
