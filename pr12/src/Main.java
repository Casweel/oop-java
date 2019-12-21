public class Main {

    public static void main(String[] args) {
        {
            String[] shirts = {
                    "S001,Black Polo Shirt,Black,XL",
                    "S002,Black Polo Shirt,Black,L",
                    "S003,Blue Polo Shirt,Blue,XL",
                    "S004,Blue Polo Shirt,Blue,M",
                    "S005,Tan Polo Shirt,Tan,XL"};
            for (int i = 0; i < shirts.length; i++)
                System.out.println(shirts[i]);
            System.out.println();

            Shirt[] information = new Shirt[shirts.length];
            for (int i = 0; i < shirts.length; i++) {
                information[i] = new Shirt(shirts[i]);
            }
            for (int i = 0; i < information.length; i++) {
                System.out.println(information[i].toString());
                System.out.println();
            }
        }

        {
            String phone = "+79175655655";
            System.out.println("Phone: " + new Phone(phone).printNumber());
            phone = "89171234567";
            System.out.println("Phone: " + new Phone(phone).printNumber());
        }
    }
}
