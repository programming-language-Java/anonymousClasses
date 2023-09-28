public class Main {
    public static void main(String[] args) {
        // —оздание объекта реализующего метода и передача его в качестве параметра
        ProfessionalCommittee professionalCommittee = new ProfessionalCommittee();
        Director director = new Director();
        director.request(professionalCommittee, 5);

        // »спользование анонимного класса
        director.request(new ProfessionalCommittee() {
            @Override
            public String generateReport(int months) {
                return "ќтчет профкома за " + months + " мес€цев";
            }
        }, 8);
    }
}