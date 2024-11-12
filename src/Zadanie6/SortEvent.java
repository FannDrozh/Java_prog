package Zadanie6;

import java.util.ArrayList;

public class SortEvent {
    public static void sortByDate(ArrayList<Event> list){
        list.sort((o1, o2) -> o1.getDate().compareTo(o2.getDate()));
    }

}
