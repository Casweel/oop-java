public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Name", "name@xmail.ru", 'M');
        System.out.println(author.toString());
        author.setEmail("new@xmail.ru");
        System.out.println(author.toString());
    }
}
