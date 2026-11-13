/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plannerproject;

/**
 *
 * @author colmm
 */
public class Planner {
    protected String subject;
    protected String date;
    

    public Planner(String subject, String topic, String date, String time, int duration) {
        this.subject = subject;
        this.date = date;
    }

    public Planner() {
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }



    public void setDate(String date) {
        this.date = date;
    }



    public String getSubject() {
        return subject;
    }



    public String getDate() {
        return date;
    }



    
    
    public String printDetails(){
        return "Study session details:";
    }
}
