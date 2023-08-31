package com.Andrey.style;

public class newTime {
    public static void main(String[] args) {
        com.Andrey.style.time time = creatTime();

        time time2 = new time(time.totalSeconds());
        System.out.println(time2.totalSeconds());

        time2.print();

        time sum = time.sum(time2);
        sum.print();

    }

    private static time creatTime() {
        time time = new time(3,6,2);
        System.out.println(time.totalSeconds());
        return time;
    }

}
