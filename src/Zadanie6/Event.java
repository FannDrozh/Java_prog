package Zadanie6;


public class Event {
    private String date;
    private String time;

    public Event(String date, String time){
        this.date = date;
        this.time = time;
    }

    public String getDate() {
        return date;
    }
    public String getTime() {
        return time;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void setTime(String time) {
        this.time = time;
    }
}
