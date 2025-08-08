public class Time {

    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Time(int hour) {
        this.hour = hour;
    }

    public Time() {
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }
    public void setTime(int hour) {
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }

    public String showUniversalTime(){
        return formatTime(hour) + ":" + formatTime(minute) + ":" + formatTime(second);
    }

    public String showDefaultTime(){

        String strHour = null, sufixe = null;

        if(this.hour == 12){ // meio-dia
            strHour = "12";
            sufixe = "PM";
        }
        else if(this.hour == 0){ //meia-noite
            strHour = "12";
            sufixe = "AM";
        }
        else if(this.hour >= 1 && this.hour <= 11){
            strHour = formatTime(this.hour);
            sufixe = "AM";
        }
        else if(this.hour >= 13 && this.hour <= 23){
            strHour = formatTime(this.hour - 12);
            sufixe = "PM";
        }

        return strHour + ":" + formatTime(minute) + ":" + formatTime(second) + " " + sufixe;
    }

    private String formatTime(int number){

        if(number < 10){
            return "0" + number;
        }

        return String.valueOf(number);
    }

}
