/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lgapapp;

/**
 *
 * @author ssjbj
 */
public class Learning {
    protected String goals, progress;

    public Learning(String goals, String progress) {
        this.goals = goals;
        this.progress = progress;
    }

    public Learning() {
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }
    
    public String getDetails(){
        return "Your goal: "+goals+", progress: "+progress;
    }
}
