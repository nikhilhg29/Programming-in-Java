class Student {
    int studentId;
    String studentName;
    String department;

    void displayStudentDetails() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Department   : " + department);
    }
}

class UndergraduateStudent extends Student {
    int semester;
    double cgpa;

    void displayUGDetails() {
        System.out.println("Semester     : " + semester);
        System.out.println("CGPA         : " + cgpa);
    }
}

class PostgraduateStudent extends Student {
    String specialization;
    String researchTopic;

    void displayPGDetails() {
        System.out.println("Specialization : " + specialization);
        System.out.println("Research Topic : " + researchTopic);
    }
}

class Practicum2 {
    public static void main(String[] args) {

        // Undergraduate Student Object
        UndergraduateStudent ug = new UndergraduateStudent();
        ug.studentId = 101;
        ug.studentName = "Ravi";
        ug.department = "CSE";
        ug.semester = 5;
        ug.cgpa = 8.75;

        System.out.println("UNDERGRADUATE STUDENT");
        ug.displayStudentDetails();
        ug.displayUGDetails();

        System.out.println();

        // Postgraduate Student Object
        PostgraduateStudent pg = new PostgraduateStudent();
        pg.studentId = 201;
        pg.studentName = "Anita";
        pg.department = "ECE";
        pg.specialization = "AI";
        pg.researchTopic = "Computer Vision";

        System.out.println("POSTGRADUATE STUDENT");
        pg.displayStudentDetails();
        pg.displayPGDetails();
    }
}