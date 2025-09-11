class TaskSep11 {
    public static void main(String[] args){
        int id = 1;
        String name = "Sowmya";
        int age = 23;
        int quizScore = 85;
        int examScore = 88;
        int assignmnetScore = 90;
        int totalClasses = 100;
        int attendedClasses = 70;
        int totalScore = quizScore + examScore + assignmnetScore;
        int averageScore = totalScore / 3;
        boolean result = averageScore > 75;
        attendedClasses = attendedClasses + 1;
        int attendancePercentage = (attendedClasses * 100) / totalClasses;
        boolean award = (averageScore >= 80 && attendancePercentage > 75);

        System.out.println("ID:" + id);
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Quiz Score:" + quizScore);
        System.out.println("Exam Score:" + examScore);
        System.out.println("AssignmentScore:" + assignmnetScore);
        System.out.println("Attendance Percentage:" + attendancePercentage);
        System.out.println("Total Score:" + totalScore);
        System.out.println("Average SCore:" + averageScore);
        System.out.println("Result:" + result);
         System.out.println("Attendance: " + attendedClasses + "/" + totalClasses + " = " + attendancePercentage + "%");
        System.out.println("Award:" + award);
    }
}