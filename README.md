# Student Eligibility System (Java)

A simple Java console-based program to check whether a student is eligible to write an exam based on attendance, late entries, and medical certificate status.

## Features
- Accepts attendance percentage
- Calculates fine for late entries
- Checks medical certificate condition
- Displays eligibility status clearly

## Rules Used in Program
1. If a student is late more than 3 times → Not allowed to write exam
2. If late between 1 and 3 times → Fine ₹100 per late day
3. If attendance is below 75%:
   - Allowed only if a medical certificate is provided
4. Displays final eligibility result

## Technologies Used
- Java
- Scanner Class
- Conditional Statements (if–else)

## How to Run

Compile:
```
javac student_eligibility_system.java
```

Run:
```
java student_eligibility_system
```

## Sample Output

```
Enter Your Attendance Percentage : 70
Enter how many days you came late to class : 2
Enter 0 if you have medical certificate or press 1 if you don't have : 0
You are allowed to write exam with the fine 200
```

## Author
Deepak
