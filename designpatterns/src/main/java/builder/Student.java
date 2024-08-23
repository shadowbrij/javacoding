package builder;

public class Student {
    private int id;
    private final String name;
    private final double psp;
    private String batch;
    private final String email;
    private String phone;
    private Student(StudentBuilder studentBuilder){
        this.name = studentBuilder.name;
        this.email = studentBuilder.email;
        this.psp = studentBuilder.psp;
    }

    public String getName() {
        return name;
    }
    public static void setName(String name){
        //these validation methods can be helpful in validations here too.
        if(!StudentBuilder.isNameValid(name)){
            throw new  IllegalArgumentException("");
        }
    }
    public double getPsp() {
        return psp;
    }

    public String getBatch() {
        return batch;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public static StudentBuilder getBuilder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private String name;
        private String email;
        private double psp;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder setPSP(double psp) {
            this.psp = psp;
            return this;
        }

        public Student build() {
            //do validations
            if(!isNameValid(this.name)){
                throw  new IllegalArgumentException("name must be not empty");
            }
            return new Student(this);
        }

        private static boolean isNameValid(String name) {
            return name.length() > 5 && !name.isBlank();
        }
    }
}
