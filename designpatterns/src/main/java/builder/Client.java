package builder;

public class Client{
    public static void main(String[] args) {
        Student st = Student.getBuilder()
                .setName("Brijesh")
                .setEmail("afad@aaa.ck")
                .setPSP(70.4)
                .build();

        Student.setName("changed");
    }
}
