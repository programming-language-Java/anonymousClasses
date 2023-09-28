import interfaces.IProfessionalCommittee;

public class ProfessionalCommittee implements IProfessionalCommittee {
    @Override
    public String generateReport(int months) {
        return "Отчет профкома за " + months + " месяцев";
    }
}