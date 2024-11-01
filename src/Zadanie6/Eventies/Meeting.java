package Zadanie6.Eventies;

import Zadanie6.Event;

public class Meeting extends Event {
    String person;
    String place;

    public Meeting (String date, String time, String person, String place){
        super(date, time);
        this.person = person;
        this.place = place;
    }

    @Override
    public String toString(){
        return "Zadanie6.Event.Meeting{" +
                "person ='" + person + '\'' +
                "place ='" + place + '\''+
                '}';
    }

    public String getPerson() {
        return person;
    }
    public String getPlace() {
        return place;
    }

    public void setPerson(String person) {
        this.person = person;
    }
    public void setPlace(String place) {
        this.place = place;
    }
}
