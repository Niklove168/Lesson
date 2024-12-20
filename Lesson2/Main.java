public class Main {
    public static void main(String[] args) {

        Park.Attractions attraction1= new Park.Attractions("Attraction1", "9:00-18:00", 6.30);
        Park.Attractions attraction2 = new Park.Attractions("Attraction2", "9:30-19:00", 5.50);
        Park.Attractions attraction3 = new Park.Attractions("Attraction3", "10:00-19:00", 4.80);
        System.out.println(attraction1.getName());
        System.out.println(attraction2.getTime());
        System.out.println(attraction3.getCost());
        attraction2.setName("New Attraction");
        System.out.println(attraction2.getName());
        attraction3.setCost(5.20);
        System.out.println(attraction3.getCost());
        attraction1.setTime("10.00-18.00");
        System.out.println(attraction1.getTime());

    }
}