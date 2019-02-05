package N;

import java.util.Date;

public class Score {
    private String firstName;
    private String lastName;
    private int score;
    private Date playDate;

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        firstName = this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName){
        lastName = this.lastName;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        score = this.score;
    }

    public Date getPlayDate(){
        return playDate;
    }

    public void setPlayDate(Date playDate){
        playDate = this.playDate;
    }

    public String toString(){
        String scoreString = firstName + " " + lastName + " " + score + " " + playDate + System.getProperty("line.separator");
        return scoreString;
    }
}
