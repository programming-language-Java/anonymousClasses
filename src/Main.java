public class Main {
    public static void main(String[] args) {
        // �������� ������� ������������ ������ � �������� ��� � �������� ���������
        ProfessionalCommittee professionalCommittee = new ProfessionalCommittee();
        Director director = new Director();
        director.request(professionalCommittee, 5);

        // ������������� ���������� ������
        director.request(new ProfessionalCommittee() {
            @Override
            public String generateReport(int months) {
                return "����� �������� �� " + months + " �������";
            }
        }, 8);
    }
}