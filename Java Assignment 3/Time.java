/* Q.5 Write a class Time with three data members to store hr, min and seconds. Create two constructors and apply checks to set valid time. (hr<24, min<60, sec<60). 
Also create display function which displays all data members. */

public class Time {
    private int min,sec,hr;

    public Time(int min, int sec, int hr) {
        this.min = min;
        this.sec = sec;
        this.hr = hr;
    }
    public Time() {

    }
    public void setTime(){
        if (hr<24 && min<60 && sec<60){
            System.out.println("valid time");
        }else {
            System.out.println("Invalid time");
        }
    }
}
class TestTime{
    public static void main(String[] args) {
        Time time=new Time(23,56,4);
        time.setTime();
    }
}


/* Output:
valid time

*/