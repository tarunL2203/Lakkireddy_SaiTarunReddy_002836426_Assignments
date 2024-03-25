/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.Persona.Transcript;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Department department = new Department("Information Systems");
        CourseCatalog courseCatalog = department.getCourseCatalog();
        
         System.out.println("Northeastern University");
        System.out.println("//========//========");
        System.out.println("College of Engineering");
        System.out.println("//========//========");
        System.out.println("Department Name: MGEN Information Systems");
        System.out.println("//========//========");


        // Add courses
       Course coreCourse = courseCatalog.newCourse("AED", "Core Course 1", 3);
        Course electiveCourse1 = courseCatalog.newCourse("Cloud", "Elective Course 1", 3);
        Course electiveCourse2 = courseCatalog.newCourse("Algorithms", "Elective Course 2", 4);
        Course coreCourse2 = courseCatalog.newCourse("Webd", "Core Course 2", 3);
        Course electiveCourse3 = courseCatalog.newCourse("Data_Management", "Elective Course 3", 3);
        Course electiveCourse4 = courseCatalog.newCourse("Data_Structures", "Elective Course 4", 4);

        Course electiveCourse5 = courseCatalog.newCourse("Java", "Elective Course 5", 3);
        Course electiveCourse6 = courseCatalog.newCourse("Python", "Elective Course 6", 4);

        Course electiveCourse7 = courseCatalog.newCourse("Business_Process_Automation", "Elective Course 7", 3);
        Course electiveCourse8 = courseCatalog.newCourse("Program_structures", "Elective Course 8", 4);


        // Add professors
        Person professor1 = department.getPersonDirectory().newPerson("Prof1");
        FacultyProfile facultyProfile1 = department.getFacultyDirectory().newFacultyProfile(professor1);
        Person professor2 = department.getPersonDirectory().newPerson("Prof2");
        FacultyProfile facultyProfile2 = department.getFacultyDirectory().newFacultyProfile(professor2);
        Person professor3 = department.getPersonDirectory().newPerson("Prof3");
        FacultyProfile facultyProfile3= department.getFacultyDirectory().newFacultyProfile(professor3);

        Person professor4= department.getPersonDirectory().newPerson("Prof4");
        FacultyProfile facultyProfile4= department.getFacultyDirectory().newFacultyProfile(professor4);

        Person professor5= department.getPersonDirectory().newPerson("Prof5");
        FacultyProfile facultyProfile5 = department.getFacultyDirectory().newFacultyProfile(professor5);


        
        CourseSchedule courseSchedule = department.newCourseSchedule("Spring2024");

        // Add course offers
        CourseOffer coreCourseOffer = courseSchedule.newCourseOffer(coreCourse.getCOurseNumber());
        CourseOffer electiveCourse1Offer = courseSchedule.newCourseOffer(electiveCourse1.getCOurseNumber());
        CourseOffer electiveCourse2Offer = courseSchedule.newCourseOffer(electiveCourse2.getCOurseNumber());

        // Assign professors to course offers
        coreCourseOffer.AssignAsTeacher(facultyProfile1);
        electiveCourse1Offer.AssignAsTeacher(facultyProfile2);
        electiveCourse2Offer.AssignAsTeacher(facultyProfile1);

        // Add student Profiles
        Person student1 = department.getPersonDirectory().newPerson("Sam");
        StudentProfile studentProfile1 = department.getStudentDirectory().newStudentProfile(student1);
        Person student2 = department.getPersonDirectory().newPerson("Peter");
        StudentProfile studentProfile2 = department.getStudentDirectory().newStudentProfile(student2);
        Person student3 = department.getPersonDirectory().newPerson("Kal");
        StudentProfile studentProfile3 = department.getStudentDirectory().newStudentProfile(student3);

        Person student4 = department.getPersonDirectory().newPerson("Andy");
        StudentProfile studentProfile4 = department.getStudentDirectory().newStudentProfile(student4);

        Person student5 = department.getPersonDirectory().newPerson("Steve");
        StudentProfile studentProfile5 = department.getStudentDirectory().newStudentProfile(student5);

        Person student6 = department.getPersonDirectory().newPerson("Jobs");
        StudentProfile studentProfile6 = department.getStudentDirectory().newStudentProfile(student6);

        Person student7 = department.getPersonDirectory().newPerson("Adam");
        StudentProfile studentProfile7= department.getStudentDirectory().newStudentProfile(student7);

        Person student8= department.getPersonDirectory().newPerson("Ron");
        StudentProfile studentProfile8 = department.getStudentDirectory().newStudentProfile(student8);
        Person student9 = department.getPersonDirectory().newPerson("Ana");
        StudentProfile studentProfile9 = department.getStudentDirectory().newStudentProfile(student9);
        Person student10= department.getPersonDirectory().newPerson("Richard");
        StudentProfile studentProfile10= department.getStudentDirectory().newStudentProfile(student10);



         
        Scanner scanner = new Scanner(System.in);
     
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Course Catalog");
            System.out.println("2. Course Schedule");
            System.out.println("3. Student Registrations");
            System.out.println("4. Generate Report");
           
            System.out.println("Please select an option:");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    CourseCatalogs(courseCatalog, scanner);
                    break;
                case 2:
                    courseSchedules(courseCatalog, department, scanner);
                    break;
                case 3:
                    studentreg(department, scanner);
                    break;
                case 4:
                    generateReport(department, scanner);
                    break;
               
                default:
                    System.out.println("Invalid option selected.");
            }
        }
    }

    public static void CourseCatalogs(CourseCatalog courseCatalog, Scanner scanner) {
        System.out.println("course catalog:");
        System.out.println("1. Add Courses");
        System.out.println("2. Browse Courses");
        System.out.println("Please select an option:");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                addCourse(courseCatalog, scanner);
                break;
            case 2:
                browseCourse(courseCatalog);
                break;
            default:
                System.out.println("Invalid option selected.");
        }
    }

    public static void courseSchedules(CourseCatalog courseCatalog, Department department, Scanner scanner) {
        System.out.println("course schedule:");
        System.out.println("1. Create Course Schedule for New Semester");
        System.out.println("2. Add Course Offers");
       
        System.out.println("Please select an option:");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                createCourseSchedule(department, scanner);
                break;
            case 2:
                addCourseOffers(courseCatalog, department, scanner);
                break;
             default:
                System.out.println("Invalid option selected.");
        }
    }

    public static void createCourseSchedule(Department department, Scanner scanner) {
        System.out.println("Enter the details for the new semester:");
        System.out.println("Semester name:");
        String semesterName = scanner.next();
        // Add more details as needed

        CourseSchedule newSchedule = department.newCourseSchedule(semesterName);
        System.out.println("New course schedule created for " + semesterName);
    }

    public static void addCourseOffers(CourseCatalog courseCatalog, Department department, Scanner scanner) {
        System.out.println("Select a course to add an offer:");
        browseCourse(courseCatalog);

        System.out.println("Enter the course number:");
        String courseNumber = scanner.next();

        Course course = courseCatalog.getCourseByNumber(courseNumber);
        if (course != null) {
            CourseOffer courseOffer = department.getCourseSchedule(courseNumber).newCourseOffer(courseNumber);

            if (courseOffer != null) {
                System.out.println("Course offer added for " + courseNumber);
            } else {
                System.out.println("Failed to add course offer.");
            }
        } else {
            System.out.println("Course not found.");
        }
    }


    public static void browseCourse(CourseCatalog coursecatalog) {
        System.out.println("You selected: Browse Course");
        ArrayList<Course> courseList = coursecatalog.getCourseList();
        System.out.println("Available Courses:");
        for (Course course : courseList) {
            System.out.println(course.getCOurseNumber() + " (" + course.getCredits() + " credits)");
        }
    }

    public static void addCourse(CourseCatalog coursecatalog, Scanner scanner) {
        System.out.println("You selected: Add Courses");
        scanner.nextLine();
        System.out.println("Enter the course name:");
        String cname = scanner.nextLine();
        System.out.println("Enter the course credits:");
        int credits = scanner.nextInt();
        System.out.println("Enter the course number:");
        String cnumber = scanner.next();

        
        Course newCourse = coursecatalog.newCourse(cname, cnumber, credits);
        System.out.println("Course Added");
    }

    public static void studentreg(Department department, Scanner scanner) {
        System.out.println("Manage student course registrations:");
        System.out.println("Enter student Name:");
        String studentId = scanner.next();

        StudentProfile student = department.getStudentDirectory().findStudent(studentId);
        if (student != null) {
            System.out.println("Student found: " + studentId);
            System.out.println("Select a course offer to register for:");
            browseCourse(department.getCourseCatalog());

            System.out.println("Enter the course number:");
            String courseNumber = scanner.next();

            CourseOffer courseOffer = department.getCourseSchedule(courseNumber).getCourseOfferByNumber(courseNumber);
            if (courseOffer != null) {
                if (courseOffer.assignEmptySeat(student.getCurrentCourseLoad())) {
                    System.out.println("Student registered for course: " + courseNumber);
                } else {
                    System.out.println("Failed to register student for course.");
                }
            } else {
                System.out.println("Course offer not found.");
            }
        } else {
            System.out.println("Student not found.");
        }
    }

public static void generateReport(Department department, Scanner scanner) {
    System.out.println("Report for Semester");
    System.out.println("--------------------------------------");

    // Hardcoded tuition fees per credit
    double tuitionPerCredit = 100.0; // Example value, adjust as needed

    for (StudentProfile student : department.getStudentDirectory().getStudentList()) {
        CourseLoad courseLoad = student.getCourseLoadBySemester("Spring2024");

        if (courseLoad != null) {
            double totalTuition = 0;
            for (SeatAssignment seatAssignment : courseLoad.getSeatAssignments()) {
                CourseOffer courseOffer = seatAssignment.getCourseOffer();
                Course course = courseOffer.getSubjectCourse();

               
                System.out.println("Course Name: " + course.getName());

                FacultyProfile facultyProfile = courseOffer.getFacultyProfile();
                if (facultyProfile != null) {
                    System.out.println("Professor: " + facultyProfile.getPerson().getPersonId());
                } else {
                    System.out.println("Professor: Not assigned");
                }

                Float grade = seatAssignment.getGrade();
                System.out.println("Grade: " + (grade != null ? grade : "Not available"));

                // Calculate tuition fees for the course
                double tuition = course.getCredits() * tuitionPerCredit;
                totalTuition += tuition;
                System.out.println("Tuition Fees: $" + tuition);

                System.out.println("--------------------------------------");
            }

            // Display total tuition fees for all courses
            System.out.println("Total Tuition Fees: $" + totalTuition);

            double semesterGPA = student.calculateGPABySemester("Spring2024");
            System.out.println("Average GPA for Semester: " + semesterGPA);
            System.out.println("--------------------------------------");
        } else {
            System.out.println("No courses registered for Spring2024 semester.");
            System.out.println("--------------------------------------");
        }
    }
}
        
    
}

               
