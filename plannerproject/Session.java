/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plannerproject;

/**
 *
 * @author colmm
 */
public class Session extends Planner{
    private String topic;
    private String date;

    public Session(String subject, String topic, String date, String time, int duration) {
        super(subject, topic, date, time, duration);
        this.topic = topic;
        this.date = date;
    }

    public Session() {
    }

    public String getTopic() {
        return topic;
    }
    @Override
    public String getDate() {
        return date;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
    @Override
    public void setDate(String date) {
        this.date = date;
    }
    
    
}
