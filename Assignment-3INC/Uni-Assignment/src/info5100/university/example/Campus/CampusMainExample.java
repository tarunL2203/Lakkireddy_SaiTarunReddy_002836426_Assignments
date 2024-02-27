/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Campus;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author kal bugrara
 */
public class CampusMainExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        0. Create Address object  
        1. create campus object
        2. Create and add buildings
        3. Create and floors
        4. Create and add rooms
        5. Assign sprinkers.
        6. Write methods to determine is campus safe => are builinds safe etc.
*/

        // Step 1: Create a Campus object
        Address campusAddress = new Address(1, "Campus St", "12345", "40.7128° N, 74.0060° W");
        Campus campus = new Campus(campusAddress);

        // Step 2: Create and add buildings
        Address building1Address = new Address(1, "Building 1 St", "12345", "40.7128° N, 74.0060° W");
        Building building1 = new Building(1, building1Address);
        //campus.addBuilding(building1);

        Address building2Address = new Address(2, "Building 2 St", "12345", "40.7128° N, 74.0060° W");
        Building building2 = new Building(2, building2Address);
        //campus.addBuilding(building2);
        
        ArrayList<Building> buildings = new ArrayList<>(Arrays.asList(building1, building2));
        campus.setBuildings(buildings);

        // Step 3: Create and add floors
        Floor floor1Building1 = building1.addNewFloor(1);
        Floor floor2Building1 = building1.addNewFloor(2);

        Floor floor1Building2 = building2.addNewFloor(1);
        Floor floor2Building2 = building2.addNewFloor(2);

        // Step 4: Create and add rooms
        floor1Building1.newRoom(101);
        floor1Building1.newRoom(102);
        floor2Building1.newRoom(201);
        floor2Building1.newRoom(202);

        floor1Building2.newRoom(101);
        floor1Building2.newRoom(102);
        floor2Building2.newRoom(201);
        floor2Building2.newRoom(202);

        // Step 5: Assign sprinklers
        campus.getBuildings().forEach(building -> building.getFloors().forEach(floor -> floor.getRooms().forEach(room -> room.setSprinkler("Model", "Serial"))));

        // Step 6: Check if campus is safe
        System.out.println("Is campus safe? " + campus.isCampusSafe());
        
        
        // Create a department
        Department department = new Department("Department of Psychology");

        // Create a course catalog
        CourseCatalog courseCatalog = new CourseCatalog(department);

        // Add courses to the catalog
        Course course1 = courseCatalog.newCourse("Introduction to Psychology", "PSY7000", 4);
        Course course2 = courseCatalog.newCourse("Developmental Psychology", "PSY7007", 4);
            Course course3 = courseCatalog.newCourse("General Psychology", "PSY7001", 4);
              Course course4 = courseCatalog.newCourse("General Psychology", "7002", 4); 
        Course course5 = courseCatalog.newCourse("Cognitive Psychology", "PSY7003", 4);
Course course6 = courseCatalog.newCourse("Abnormal Psychology", "PSY7004", 4);
Course course7 = courseCatalog.newCourse("Social Psychology", "PSY7005", 4);
Course course8 = courseCatalog.newCourse("Clinical Psychology", "PSY7006", 4);
Course course9 = courseCatalog.newCourse("Industrial-Organizational Psychology", "PSY7008", 4);


        // Browse the course catalog
        ArrayList<Course> courses = courseCatalog.getCourseList();
        for (Course course : courses) {
            System.out.println(course.getCourseNumber() + ": " + course.getName() + " - Credits: " + course.getCredits());
        }

        // Creating a course schedule for the Fall semester
        CourseSchedule fallSemesterSchedule = new CourseSchedule("Fall 2024", courseCatalog);

        // Adding course offers to the schedule and assign teachers
        Person Paul = new Person("id1");
        FacultyProfile faculty1 = new FacultyProfile(Paul); 
        fallSemesterSchedule.newCourseOffer("PSY7001").AssignAsTeacher(faculty1);

        Person Sam = new Person("id2");
        FacultyProfile faculty2 = new FacultyProfile(Sam); // Assuming you have another faculty profile
        fallSemesterSchedule.newCourseOffer("PSY7002").AssignAsTeacher(faculty2);
        
        Person john = new Person("id3");
FacultyProfile faculty3 = new FacultyProfile(john);
fallSemesterSchedule.newCourseOffer("PSY7003").AssignAsTeacher(faculty3);

Person alice = new Person("id4");
FacultyProfile faculty4 = new FacultyProfile(alice);
fallSemesterSchedule.newCourseOffer("PSY7004").AssignAsTeacher(faculty4);

Person mike = new Person("id5");
FacultyProfile faculty5 = new FacultyProfile(mike);
fallSemesterSchedule.newCourseOffer("PSY7005").AssignAsTeacher(faculty5);

Person emma = new Person("id6");
FacultyProfile faculty6 = new FacultyProfile(emma);
fallSemesterSchedule.newCourseOffer("PSY7006").AssignAsTeacher(faculty6);

Person lily = new Person("id7");
FacultyProfile faculty7 = new FacultyProfile(lily);
fallSemesterSchedule.newCourseOffer("PSY7007").AssignAsTeacher(faculty7);

Person sophia = new Person("id8");
FacultyProfile faculty8 = new FacultyProfile(sophia);
fallSemesterSchedule.newCourseOffer("PSY7008").AssignAsTeacher(faculty8);




        // Assign another teacher to a course offer
        CourseOffer cs101Offer = fallSemesterSchedule.getCourseOfferByNumber("CS101");
        if (cs101Offer != null) {
            cs101Offer.AssignAsTeacher(faculty2);
        }

        // Calculate total revenues
        int totalRevenues = fallSemesterSchedule.calculateTotalRevenues();
        System.out.println("Total Revenues: $" + totalRevenues);
    


        }
    
}
