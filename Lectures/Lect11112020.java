import java.util.*;

class Lect11112020 {
    class Event {
        private int year, month, day;
        private String activity;

        public Event(int year, int month, int day, String activity) {
            this.year = year;
            this.month = month;
            this.day = day;
            this.activity = activity;
        }

        public String toString() {
            return year + "-" + (month < 10 ? "0" : "") + month + "-" + (day < 10 ? "0" : "") + day + " " + activity;
        }

        public boolean equals(Object obj) {
            Event e = (Event) obj;
            return this.year == e.year && this.month == e.month && this.day == e.day;
        }

        public int hashCode() {
            return 10000 * year + 100 * month + day;
        }
    }

    class Test {
        public static void main(String[] args) {
            Event e1 = new Event(2016, 3, 14, "Hiking");
            System.out.println(e1); // --> 2016-03-14 Hiking
            /**
             * python | java list | ArrayList set | HashSet (key) dict | HashMap (key,
             * value) (kind of) dequeue | LinkedList
             * 
             * HashTables are used to implement HashSets and HashMaps
             */
            HashSet<Event> set = new HashSet<Event>();
            set.add(e1);
            System.out.println(set.contains(new Event(2017, 7, 2, "")));

            HashMap<Event, Integer> map = new HashMap<Event, Integer>();
            map.put(e1, 17);
            map.containsKey(new Event(2017, 7, 2, ""));
            map.get(new Event(2017, 7, 2, ""));
            // .containsValue(); is not efficient
            
        }
    }
}