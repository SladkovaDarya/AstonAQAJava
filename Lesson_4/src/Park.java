public class Park {
    public static class Attraction {
        String nameOfAttraction;
        String workingHours;
        int cost;

        public Attraction(String nameOfAttraction, String workingHours, int cost) {
            this.nameOfAttraction = nameOfAttraction;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return nameOfAttraction + " - " + workingHours + ", " + cost + "rub.";
        }
    }
}
