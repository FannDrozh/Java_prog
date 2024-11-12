package Zadanie6;
import java.util.ArrayList;
import java.util.List;
import Zadanie6.Eventies.BirthDay;
import Zadanie6.Eventies.Meeting;
import Zadanie6.Eventies.Custom;

public class Events {
//    BirthDay birthDay = new BirthDay("09/05/2003","10:00", "Илья",
//            "Ниж Движ", 21);
//    Meeting meeting = new Meeting("15","0", "Егор", "Клуб");
//    Custom custom = new Custom("15","0", "ЕГОР ЛОХ!");
//    private List<Event> events = new ArrayList<>();
//
//    public void add(Event event){
//        events.add(event);
//    }
//
//    public void Show(){
//        for(Event event : events) {
//            System.out.println();
////            System.out.println("День рождение: " + birthDay.toString() + " " +
////                    meeting.toString() + " " + custom.toString());
//        }
//    }
    private ArrayList<Event> eventArrayList;

    public Events(ArrayList<Event> eventArrayList){
        this.eventArrayList = eventArrayList;
    }

    public void addElements(Event event){
        eventArrayList.add(event);
    }

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
