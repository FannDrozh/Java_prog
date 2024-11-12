package Zadanie6.Eventies;

import Zadanie6.Event;

public class BirthDay extends Event {
    private String hero;
    private String place;
    private int age;
//конструктор
    public BirthDay(String date, String time, String hero, String place, int age)
    {
        super(date, time);
        this.hero = hero;
        this.place = place;
        this.age = age;
    }
//вывод
    @Override
    public String toString(){
        return  "date ='" + super.getDate() + '\'' +
                "time ='" + super.getTime() + '\'' +
                "hero ='" + hero + '\'' +
                "place ='" + place + '\''+
                "age ='" + age + '\'';
    }
//get
    public String getHero() {
        return hero;
    }

    public String getPlace() {
        return place;
    }

    public int getAge() {
        return age;
    }
//set
    public void setHero(String hero) {
        this.hero = hero;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
