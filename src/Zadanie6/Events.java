package Zadanie6;
import java.util.ArrayList;
import java.util.List;
import Zadanie6.Eventies.BirthDay;
import Zadanie6.Eventies.Meeting;
import Zadanie6.Eventies.Custom;

public class Events {

    private ArrayList<Event> eventArrayList;

    public Events(ArrayList<Event> eventArrayList){
        this.eventArrayList = eventArrayList;
    }

    public void addElements(Event event){
        eventArrayList.add(event);
    }

    public  void clearElemets(){ eventArrayList.clear();}

    public void printArrayEvent(){
        for(Event event : eventArrayList)
            System.out.printf("Date: '" + event.getDate() + "', Time: '" + event.getTime() + "'\n");
    }

    public ArrayList<Event> getEventArrayList() {
        return eventArrayList;
    }

    public void setEventArrayList(ArrayList<Event> eventArrayList) {
        this.eventArrayList = eventArrayList;
    }
}
