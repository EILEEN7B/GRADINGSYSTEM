# GRADINGSYSTEM
The java code has the following classes
 1. Student
    The base class containing the student details: Name, student ID number, Marks scored and the course being taken

 2. Exam
    An interface class having a function Calculate_Grade
 3. Grade
    This is a derived class which has a function Calculate_Grade and inherits from student class and exam interface. It determines the grading scale based on the marks the student got
    4. Apllication
       This is the main class having an object which calls the function Calculate_Grade. It initializes and executes the code

  The system evaluates the grading of the student marks based on the following scale
  90+: Grade A
  80-89: Grade B
  70-79: Grade C
  60-69: Grade D
  50-59: Grade E
  less then 50: FAIL (Supplementary Required)

  The user is prompt to input student name, student Id, Course being done an the marks got.
  
  
