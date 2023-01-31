public class Main {


        public static void main(String[] args) {
                Phone Iphone = new Phone("Iphone", "12 MINI", 2020);
                Iphone.installAnApp("facebook");
                Iphone.installAnApp("youtube", "4.23.1");
                Iphone.installAnApp("twitter", "nightly-built", "Iphone-apps.com");

                List<String> apps = new ArrayList<>();
                apps.add("instagram");
                apps.add("tiktok");
                apps.add("google maps");

                Iphone.installAnApp(apps);

        }
}