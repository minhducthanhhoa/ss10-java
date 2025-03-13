package bai7;

public class GraduateStudent extends Student {
    private String researchTopic;
    private String supervisorName;

    public GraduateStudent(String name, String id, double gpa, String researchTopic, String supervisorName) {
        super(name, id, gpa);
        if (researchTopic == null || researchTopic.isEmpty() || supervisorName == null || supervisorName.isEmpty()) {
            System.err.println("Thông tin nghiên cứu không hợp lệ!");
        }
        this.researchTopic = researchTopic;
        this.supervisorName = supervisorName;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        if (researchTopic == null || researchTopic.isEmpty()) {
            System.out.println("Đề tài nghiên cứu không hợp lệ!");
            return;
        }
        this.researchTopic = researchTopic;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        if (supervisorName == null || supervisorName.isEmpty()) {
            System.out.println("Tên giảng viên hướng dẫn không hợp lệ!");
            return;
        }
        this.supervisorName = supervisorName;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Đề tài: " + researchTopic + ", Giảng viên hướng dẫn: " + supervisorName;
    }
}
