package CreationalDesignPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
                .id(10)
                .name("Tushar Bansal")
                .age(24)
                .email("bansaltushar1213@gmail.com")
                .batchName("Dec22 Advanced")
                .psp(100)
                .gradYear(2021)
                .phoneNumber("9914550644")
                .universityName("PUP")
                .build();

        System.out.println(student.toString());

        Student student2 = Student.builder()
                .id(10)
                .name("Tushar Bansal")
                .age(24)
                .batchName("Dec22 Advanced")
                .gradYear(2021)
                .phoneNumber("9914550644")
                .build();

        System.out.println(student2.toString());
    }
}
