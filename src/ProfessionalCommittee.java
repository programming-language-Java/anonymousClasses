import interfaces.IProfessionalCommittee;

public class ProfessionalCommittee implements IProfessionalCommittee {
    @Override
    public String generateReport(int months) {
        return "����� �������� �� " + months + " �������";
    }
}