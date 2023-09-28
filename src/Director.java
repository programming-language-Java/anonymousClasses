public class Director {
    public void request(ProfessionalCommittee professionalCommittee, int months) {
        String report = professionalCommittee.generateReport(months);
        System.out.println(report);
    }
}
