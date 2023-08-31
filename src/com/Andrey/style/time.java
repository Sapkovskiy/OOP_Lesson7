package com.Andrey.style;

/**
 * 1. Создать класс, описывающий промежуток времени.
 * Сам промежуток времени должен задаваться тремя свойствами:
 * секундами, минутами, часами.
 * 2. Создать метод для получения полного количества секунд в обьекте.
 * 3. Создать 2 конструктора: первый принимаает общее количесвто секунд,
 * второй часы,минуты, секунды по отдельности.
 * 4. Создать метод для вывода данных.
 */
public class time {

        private int sec;

        private int min;

        private int hour;


        public time(int sec, int min, int hour) {
                this.sec = sec;
                this.min = min;
                this.hour = hour;
        }
        public int totalSeconds(){
                return sec+min*60+hour*60*60;
        }
        public time(int totalSeconds){
                this.hour=totalSeconds/3600;
                this.min=totalSeconds%3600/60;
                this.sec=totalSeconds%3600%60;
        }
        public void print(){
                System.out.println("h= "+hour+", min= "+min+", sec= "+sec);

        }
        public time sum(time secs){
                return new time(this.totalSeconds()+secs.totalSeconds());
        }
}
