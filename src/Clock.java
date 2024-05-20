public class Clock {
    private int hour;
    private int minutes;

    public Clock(int initialHour, int initialMinutes) {
        if(initialHour < 0 || initialHour >23){
            System.out.println("Invalid hour");
        } else {
            this.hour = initialHour;
        }

        if(initialMinutes < 0 || initialMinutes > 59){
            System.out.println("Invalid minutes");
        } else {
            this.minutes = initialMinutes;
        }
    }

    public Clock() {
        System.out.println("Clock was created with default values");
    }

    public String getTime() {
        return "The time is " + this.hour + ":" + this.minutes;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setHour(int hour) {
        if(hour < 0 || hour >23){
            System.out.println("Invalid hour");
        } else {
            this.hour = hour;
        }
    }

    public void setMinutes(int someMinutes) {
        if(someMinutes < 0 || someMinutes > 59){
            System.out.println("Invalid minutes");
        } else {
            this.minutes = someMinutes;
        }
    }

}
