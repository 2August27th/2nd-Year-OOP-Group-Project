package project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colmm
 */
public class StudyPlanner {
    private String subject;
    private String topic;
    private String date;
    private String time;
    private int duration;
    
    public StudyPlanner(){
    }

    public StudyPlanner(String subject, String topic, String date, String time, int duration) {
        this.subject = subject;
        this.topic = topic;
        this.date = date;
        this.time = time;
        this.duration = duration;
    }

    public String getSubject() {
        return subject;
    }

    public String getTopic() {
        return topic;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getDuration() {
        return duration;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    
}
