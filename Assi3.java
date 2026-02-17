class Staff {
    int staffId;
    String name;

    Staff(int staffId, String name) {
        this.staffId = staffId;
        this.name = name;
    }

    void displayStaffDetails() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + name);
    }
}

class TeachingStaff extends Staff {
    String subject;

    TeachingStaff(int staffId, String name, String subject) {
        super(staffId, name);
        this.subject = subject;
    }

    void displayTeachingInfo() {
        displayStaffDetails();
        System.out.println("Subject: " + subject);
    }
}

class NonTeachingStaff extends Staff {
    String department;

    NonTeachingStaff(int staffId, String name, String department) {
        super(staffId, name);
        this.department = department;
    }

    void displayDepartmentInfo() {
        displayStaffDetails();
        System.out.println("Department: " + department);
    }
}
