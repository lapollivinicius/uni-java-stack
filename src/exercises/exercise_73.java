package src.exercises;

public class exercise_73 {

    Runtime runtime = Runtime.getRuntime();

    public Stats getStatsInstance() {
        return new Stats(
                runtime.freeMemory(),
                (runtime.totalMemory()  - runtime.freeMemory()),
                runtime.totalMemory()
        );
    }

    public static class Stats {

        long free;
        long used;
        long total;

        public Stats(long free, long used, long total) {
            this.free = free;
            this.used = used;
            this.total = total;
        }

        @Override
        public String toString() {
            return "Stats{" +
                    "free=" + free +
                    ", used=" + used +
                    ", total=" + total +
                    '}';
        }
    }

    public static void main(String[] args) {

        exercise_73 ex = new exercise_73();
        System.out.println(ex.getStatsInstance());

    }

}
