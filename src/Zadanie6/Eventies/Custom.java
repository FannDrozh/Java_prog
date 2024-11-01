package Zadanie6.Eventies;

import Zadanie6.Event;

public class Custom extends Event {
    String description;

    public Custom(String date, String time, String description){
        super(date, time);
        this.description = description;
    }

    @Override
    public String toString(){
        return "Zadanie6.Event.Meeting{" +
                "description ='" + description + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
