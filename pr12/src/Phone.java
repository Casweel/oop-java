public class Phone {
    private String number;

    public Phone(String number) {
        this.number = number;
    }

    public String printNumber() {
        String from = this.number;
        String to;
        if (from.charAt(0) == '+')
            from = from.substring(1, from.length());
        to = "+" + from.substring(0, 7) + "-" + from.substring(7, 9) + "-"+from.substring(9, 11);
        return to;
    }
}
//“+79175655655 89175655655 -> +8917565-55-65
