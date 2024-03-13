/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package Business;

import ucode.Business;
import ucode.CourseCatalog.CourseCatalog;
import ucode.CourseSchedule.CourseOffer;
import ucode.CourseSchedule.CourseSchedule;
import ucode.Person.Person;
import ucode.Person.PersonDirectory;
import ucode.profiles.EmployeeDirectory;
import ucode.profiles.EmployeeProfile;

import ucode.UserAccounts.UserAccount;
import ucode.UserAccounts.UserAccountDirectory;
import ucode.profiles.FacultyAssignment;
import ucode.profiles.FacultyDirectory;
import ucode.profiles.FacultyProfile;
import ucode.profiles.ProfessorProfile;
import ucode.profiles.StudentDirectory;
import ucode.profiles.StudentProfile;

/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {

    static Business initialize() {
        Business business = new Business("Information Systems");

// Create Persons
        PersonDirectory persondirectory = business.getPersonDirectory();
// person representing Administrator       
//        
        Person administrator = persondirectory.newPerson("name", 50, "adminNEU@gmail.com");

// Create person objects to represent 10 professors.
Person professor01 = persondirectory.newPerson("professorA", 25, "professorA@example.com");
Person professor02 = persondirectory.newPerson("professorB", 25, "professorB@example.com");
Person professor03 = persondirectory.newPerson("professorC", 25, "professorC@example.com");
Person professor04 = persondirectory.newPerson("professorD", 25, "professorD@example.com");
Person professor05 = persondirectory.newPerson("professorE", 25, "professorE@example.com");
Person professor06 = persondirectory.newPerson("professorF", 25, "professorF@example.com");
Person professor07 = persondirectory.newPerson("professorG", 25, "professorG@example.com");
Person professor08 = persondirectory.newPerson("professorH", 25, "professorH@example.com");
Person professor09 = persondirectory.newPerson("professorI", 25, "professorI@example.com");
Person professor10 = persondirectory.newPerson("professorJ", 25, "professorJ@example.com");

// Create person objects to represent 20 students.
Person student001 = persondirectory.newPerson("student1", 22, "student1@example.com");
Person student002 = persondirectory.newPerson("student2", 22, "student2@example.com");
Person student003 = persondirectory.newPerson("student3", 22, "student3@example.com");
Person student004 = persondirectory.newPerson("student4", 22, "student4@example.com");
Person student005 = persondirectory.newPerson("student5", 22, "student5@example.com");
Person student006 = persondirectory.newPerson("student6", 22, "student6@example.com");
Person student007 = persondirectory.newPerson("student7", 22, "student7@example.com");
Person student008 = persondirectory.newPerson("student8", 22, "student8@example.com");
Person student009 = persondirectory.newPerson("student9", 22, "student9@example.com");
Person student010 = persondirectory.newPerson("student10", 22, "student10@example.com");
Person student011 = persondirectory.newPerson("student11", 22, "student11@example.com");
Person student012 = persondirectory.newPerson("student12", 22, "student12@example.com");
Person student013 = persondirectory.newPerson("student13", 22, "student13@example.com");
Person student014 = persondirectory.newPerson("student14", 22, "student14@example.com");
Person student015 = persondirectory.newPerson("student15", 22, "student15@example.com");
Person student016 = persondirectory.newPerson("student16", 22, "student16@example.com");
Person student017 = persondirectory.newPerson("student17", 22, "student17@example.com");
Person student018 = persondirectory.newPerson("student18", 22, "student18@example.com");
Person student019 = persondirectory.newPerson("student19", 22, "student19@example.com");
Person student020 = persondirectory.newPerson("student20", 22, "student20@example.com");

// Create Students
StudentDirectory studentDir = business.getStudentDirectory();
StudentProfile studentProf001 = studentDir.newStudentProfile(student001);
StudentProfile studentProf002 = studentDir.newStudentProfile(student002);
StudentProfile studentProf003 = studentDir.newStudentProfile(student003);
StudentProfile studentProf004 = studentDir.newStudentProfile(student004);
StudentProfile studentProf005 = studentDir.newStudentProfile(student005);
StudentProfile studentProf006 = studentDir.newStudentProfile(student006);
StudentProfile studentProf007 = studentDir.newStudentProfile(student007);
StudentProfile studentProf008 = studentDir.newStudentProfile(student008);
StudentProfile studentProf009 = studentDir.newStudentProfile(student009);
StudentProfile studentProf010 = studentDir.newStudentProfile(student010);
StudentProfile studentProf011 = studentDir.newStudentProfile(student011);
StudentProfile studentProf012 = studentDir.newStudentProfile(student012);
StudentProfile studentProf013 = studentDir.newStudentProfile(student013);
StudentProfile studentProf014 = studentDir.newStudentProfile(student014);
StudentProfile studentProf015 = studentDir.newStudentProfile(student015);
StudentProfile studentProf016 = studentDir.newStudentProfile(student016);
StudentProfile studentProf017 = studentDir.newStudentProfile(student017);
StudentProfile studentProf018 = studentDir.newStudentProfile(student018);
StudentProfile studentProf019 = studentDir.newStudentProfile(student019);
StudentProfile studentProf020 = studentDir.newStudentProfile(student020);

// Create Admins to manage the business
EmployeeDirectory empDir = business.getEmployeeDirectory();
EmployeeProfile empProf00 = empDir.newEmployeeProfile(administrator);

// Create Professors
FacultyDirectory facultyDir = business.getFacultyDirectory();
FacultyProfile facultyProf01 = facultyDir.newFacultyProfile(professor01);
FacultyProfile facultyProf02 = facultyDir.newFacultyProfile(professor02);
FacultyProfile facultyProf03 = facultyDir.newFacultyProfile(professor03);
FacultyProfile facultyProf04 = facultyDir.newFacultyProfile(professor04);
FacultyProfile facultyProf05 = facultyDir.newFacultyProfile(professor05);
FacultyProfile facultyProf06 = facultyDir.newFacultyProfile(professor06);
FacultyProfile facultyProf07 = facultyDir.newFacultyProfile(professor07);
FacultyProfile facultyProf08 = facultyDir.newFacultyProfile(professor08);
FacultyProfile facultyProf09 = facultyDir.newFacultyProfile(professor09);
FacultyProfile facultyProf10 = facultyDir.newFacultyProfile(professor10);

// Create User accounts that link to Student profiles
UserAccountDirectory uaDir = business.getUserAccountDirectory();

UserAccount userAcc001 = uaDir.newUserAccount(studentProf001, studentProf001.getPerson().getName(), studentProf001.getPerson().getName());
UserAccount userAcc002 = uaDir.newUserAccount(studentProf002, studentProf002.getPerson().getName(), studentProf002.getPerson().getName());
UserAccount userAcc003 = uaDir.newUserAccount(studentProf003, studentProf003.getPerson().getName(), studentProf003.getPerson().getName());
UserAccount userAcc004 = uaDir.newUserAccount(studentProf004, studentProf004.getPerson().getName(), studentProf004.getPerson().getName());
UserAccount userAcc005 = uaDir.newUserAccount(studentProf005, studentProf005.getPerson().getName(), studentProf005.getPerson().getName());
UserAccount userAcc006 = uaDir.newUserAccount(studentProf006, studentProf006.getPerson().getName(), studentProf006.getPerson().getName());
UserAccount userAcc007 = uaDir.newUserAccount(studentProf007, studentProf007.getPerson().getName(), studentProf007.getPerson().getName());
UserAccount userAcc008 = uaDir.newUserAccount(studentProf008, studentProf008.getPerson().getName(), studentProf008.getPerson().getName());
UserAccount userAcc009 = uaDir.newUserAccount(studentProf009, studentProf009.getPerson().getName(), studentProf009.getPerson().getName());
UserAccount userAcc010 = uaDir.newUserAccount(studentProf010, studentProf010.getPerson().getName(), studentProf010.getPerson().getName());
UserAccount userAcc011 = uaDir.newUserAccount(studentProf011, studentProf011.getPerson().getName(), studentProf011.getPerson().getName());
UserAccount userAcc012 = uaDir.newUserAccount(studentProf012, studentProf012.getPerson().getName(), studentProf012.getPerson().getName());
UserAccount userAcc013 = uaDir.newUserAccount(studentProf013, studentProf013.getPerson().getName(), studentProf013.getPerson().getName());
UserAccount userAcc014 = uaDir.newUserAccount(studentProf014, studentProf014.getPerson().getName(), studentProf014.getPerson().getName());
UserAccount userAcc015 = uaDir.newUserAccount(studentProf015, studentProf015.getPerson().getName(), studentProf015.getPerson().getName());

  



// Generating semesters
CourseSchedule fall23Schedule = business.newCourseSchedule("Fall 2023");
CourseSchedule summer24Schedule = business.newCourseSchedule("Summer 2024");
CourseSchedule spring24Schedule = business.newCourseSchedule("Spring 2024");

// Creating courses
// Generating faculty assignments 
CourseCatalog courseCatalog = business.getCourseCatalog();
FacultyAssignment facultyAssign01 = new FacultyAssignment(facultyProf01);
FacultyAssignment facultyAssign02 = new FacultyAssignment(facultyProf02);
FacultyAssignment facultyAssign03 = new FacultyAssignment(facultyProf03);
FacultyAssignment facultyAssign04 = new FacultyAssignment(facultyProf04);
FacultyAssignment facultyAssign05 = new FacultyAssignment(facultyProf05);
FacultyAssignment facultyAssign06 = new FacultyAssignment(facultyProf06);
FacultyAssignment facultyAssign07 = new FacultyAssignment(facultyProf07);
FacultyAssignment facultyAssign08 = new FacultyAssignment(facultyProf08);
FacultyAssignment facultyAssign09 = new FacultyAssignment(facultyProf09);
FacultyAssignment facultyAssign10 = new FacultyAssignment(facultyProf10);

// Creating courses 
courseCatalog.newCourse("AED", "5101", 4, facultyAssign01);
courseCatalog.newCourse("WEB", "6301", 4, facultyAssign01);

courseCatalog.newCourse("INFO", "6501", 4, facultyAssign02);
courseCatalog.newCourse("DATA", "5301", 4, facultyAssign02);
courseCatalog.newCourse("UI", "6101", 4, facultyAssign03);
courseCatalog.newCourse("ANALY", "5201", 4, facultyAssign03);
courseCatalog.newCourse("CSE", "6401", 4, facultyAssign04);
courseCatalog.newCourse("ABC", "5401", 4, facultyAssign04);
courseCatalog.newCourse("CSYE", "6601", 4, facultyAssign05);
courseCatalog.newCourse("CSY", "5332", 4, facultyAssign05);
courseCatalog.newCourse("INF", "2401", 4, facultyAssign06);
courseCatalog.newCourse("DAT", "3601", 4, facultyAssign06);
courseCatalog.newCourse("SES", "6741", 4, facultyAssign07);
courseCatalog.newCourse("MECH", "5348", 4, facultyAssign07);
courseCatalog.newCourse("MCA", "7201", 4, facultyAssign08);
courseCatalog.newCourse("YOU", "7101", 4, facultyAssign08);
courseCatalog.newCourse("VSS", "6901", 4, facultyAssign09);
courseCatalog.newCourse("SASS", "8794", 4, facultyAssign09);
courseCatalog.newCourse("CSS", "6968", 4, facultyAssign10);
courseCatalog.newCourse("PHY", "9898", 4, facultyAssign10);

// Offering courses to different semesters.
CourseOffer courseOffer5101 = fall23Schedule.newCourseOffer("5101");
CourseOffer courseOffer6301 = fall23Schedule.newCourseOffer("6301");
CourseOffer courseOffer9898 = fall23Schedule.newCourseOffer("9898");
CourseOffer courseOffer6968 = fall23Schedule.newCourseOffer("6968");
CourseOffer courseOffer8794 = fall23Schedule.newCourseOffer("6901");
CourseOffer courseOffer7101 = fall23Schedule.newCourseOffer("7101");

CourseOffer courseOffer6501 = spring24Schedule.newCourseOffer("6501");
CourseOffer courseOffer7201 = spring24Schedule.newCourseOffer("7201");
CourseOffer courseOffer5348 = spring24Schedule.newCourseOffer("5348");
CourseOffer courseOffer6741 = spring24Schedule.newCourseOffer("6741");
CourseOffer courseOffer3601 = spring24Schedule.newCourseOffer("3601");

CourseOffer courseOffer5332 = summer24Schedule.newCourseOffer("5332");
CourseOffer courseOffer2401 = summer24Schedule.newCourseOffer("2401");
CourseOffer courseOffer5401 = summer24Schedule.newCourseOffer("5401");
CourseOffer courseOffer6401 = summer24Schedule.newCourseOffer("6401");

// Registering students to different courses.
courseOffer5101.registerStudent(studentProf001);
courseOffer5101.registerStudent(studentProf003);
courseOffer5101.registerStudent(studentProf004);
courseOffer5101.registerStudent(studentProf005);
courseOffer5101.registerStudent(studentProf006);
courseOffer5101.registerStudent(studentProf007);

courseOffer6301.registerStudent(studentProf001);
courseOffer6301.registerStudent(studentProf005);
courseOffer6301.registerStudent(studentProf008);
courseOffer6301.registerStudent(studentProf007);
courseOffer6301.registerStudent(studentProf011);
courseOffer6301.registerStudent(studentProf013);
courseOffer6301.registerStudent(studentProf015);

courseOffer9898.registerStudent(studentProf002);
courseOffer9898.registerStudent(studentProf004);
courseOffer9898.registerStudent(studentProf006);
courseOffer9898.registerStudent(studentProf012);
courseOffer9898.registerStudent(studentProf010);

courseOffer6968.registerStudent(studentProf011);
courseOffer6968.registerStudent(studentProf009);
courseOffer6968.registerStudent(studentProf013);
courseOffer6968.registerStudent(studentProf007);

courseOffer8794.registerStudent(studentProf014);
courseOffer8794.registerStudent(studentProf002);
courseOffer8794.registerStudent(studentProf004);
courseOffer8794.registerStudent(studentProf006);
courseOffer8794.registerStudent(studentProf012);
courseOffer8794.registerStudent(studentProf010);

courseOffer7101.registerStudent(studentProf011);
courseOffer7101.registerStudent(studentProf009);
courseOffer7101.registerStudent(studentProf013);
courseOffer7101.registerStudent(studentProf007);

courseOffer6501.registerStudent(studentProf011);
courseOffer6501.registerStudent(studentProf011);
courseOffer6501.registerStudent(studentProf009);
courseOffer6501.registerStudent(studentProf013);
courseOffer6501.registerStudent(studentProf007);

courseOffer7201.registerStudent(studentProf011);
courseOffer7201.registerStudent(studentProf011);
courseOffer7201.registerStudent(studentProf009);
courseOffer7201.registerStudent(studentProf013);
courseOffer7201.registerStudent(studentProf007);

courseOffer5348.registerStudent(studentProf014);
courseOffer5348.registerStudent(studentProf002);
courseOffer5348.registerStudent(studentProf004);
courseOffer5348.registerStudent(studentProf006);
courseOffer5348.registerStudent(studentProf012);
courseOffer5348.registerStudent(studentProf010);

courseOffer6741.registerStudent(studentProf014);
courseOffer6741.registerStudent(studentProf002);
courseOffer6741.registerStudent(studentProf004);
courseOffer6741.registerStudent(studentProf006);
courseOffer6741.registerStudent(studentProf012);
courseOffer6741.registerStudent(studentProf010);

courseOffer3601.registerStudent(studentProf011);
courseOffer3601.registerStudent(studentProf009);
courseOffer3601.registerStudent(studentProf013);
courseOffer3601.registerStudent(studentProf007);

courseOffer5332.registerStudent(studentProf011);
courseOffer5332.registerStudent(studentProf009);
courseOffer5332.registerStudent(studentProf013);
courseOffer5332.registerStudent(studentProf007);

courseOffer5401.registerStudent(studentProf014);
courseOffer5401.registerStudent(studentProf002);
courseOffer5401.registerStudent(studentProf004);
courseOffer5401.registerStudent(studentProf006);
courseOffer5401.registerStudent(studentProf012);
courseOffer5401.registerStudent(studentProf010);



        return business;

    }

}
