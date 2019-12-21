public class Shirt {
    private String code;
    private String description;
    private String color;
    private String size;

    public Shirt(String information) {
        String a[] = information.split(",");
        this.code = a[0];
        this.description = a[1];
        this.color = a[2];
        this.size = a[3];
    }

    @Override
    public String toString() {
        return "Code: " + code +"\nDescription: " + description +
                "\nColor: "+color + "\nSize: "+size;
    }

}
