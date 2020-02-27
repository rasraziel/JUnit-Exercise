public class MyDate {
    private int day = 1, month = 1, year = 1904;

    public MyDate(){}

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String dayOfWeek(){
        int myYear = year;
        int myDay = day;
        int myMonth = month;
        int c;
        String dayName = "";

        if (myMonth < 3) {
            myYear--;
            myMonth = myMonth +10;
        }
        else {
            myMonth = myMonth -2;
        }

        c = myYear/100;
        myYear = myYear%100;

        int monthTerm = (int) Math.floor((2.6 * myMonth) - 0.2);
        int A = myDay + monthTerm + myYear + (myYear / 4) + (c / 4) - (2 * c);

        int x = A % 7;

        if (x < 0) {
            x+=7;
        }
            switch (x) {
                case 0:
                    dayName = "Sunday";
                    break;
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
            }
        return dayName;
    }


    public void addDays(int days) {
       // days += day;
        while (days >= 365) {
            if (isLeapYear(year)) {
                if (days >= 366) {
                    year++;
                    days -= 366;
                } else {
                    break;
                }
            } else {
                    year++;
                    days -= 365;
                }
            }


          while (days>=daysInMonth()){
              days -= daysInMonth();
          if(month==12){
              month = 1;
          } else {
              month++;
          }
        }
            day = days + 1;
    }

    public void nextDay(){
        addDays(1);
    }

    public int daysInMonth(){
        int x = 0;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                x = 31;
                break;
            case 2:
                if(isLeapYear(year)){
                    x = 29;
                } else {
                    x = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                x = 30;
                break;
        }
    return  x;
    }


    public boolean isLeapYear(int year){
        if ((year%4==0)&&(year%100!=0)||(year%400==0)){
            return true;
        } else {
            return false;
        }
    }

}
