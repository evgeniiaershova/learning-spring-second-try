package events;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

public class Event {

    String msg;
    Date date;
    int id = new Random().nextInt(10000 - 1) + 1;
    DateFormat df;

    public Event(Date date, DateFormat df) {
        this.date = date;
        this.df = df;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "events.Event{" +
                "msg='" + msg + '\'' +
                ", date=" + df.format(date) +
                ", id=" + id +
                '}';
    }

}
