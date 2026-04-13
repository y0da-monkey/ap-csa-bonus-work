Bonus Assignment by Noel Yonas Tsegaye 11B5

Project System Description: StudentAnalyzer is a java system that was built to process student records within an Arraylist. The function of an arrayList is being dynamic so naturally the code i wrote had to be aswell so its not hardcoded to any specific list that i made. It can find the top students within that list and also remove anyone who fail (algorithms that were meant to be written). 

Explanation of algorithms: The system uses 7 algorithms one designationed to a separate section:

1.Conditional Counting Algorithm (countAbove): This algorithm goes through the whole list, counting the number of students whose marks are above the given threshold provided by the user. The algorithm involves a single loop which contains a counter, and an if statement to verify the marks in each instance of a Student object.

2.Safe Removal Algorithm (removeFailing): One of the most complicated algorithms involved the removal of students from the list while traversing it. In order not to miss anyone due to the deletion, I used special indexing (i--) so that after deleting a student, it didn’t pass over the next student. This algorithm is intended to help get rid of the failures in the list.

3.Maximum Finder Algorithm (findTopStudent): This algorithm finds the “nerd” among all the students since it compares the marks. In other words, it selects a highest score at the very beginning (for the first instance) and replaces it with the best score if any student beats the chosen one.

4.Filtered List Creation (getTopStudents): This algorithm does not affect the current list, but creates a completely new ArrayList and fills it only with some particular elements which match the given conditions.

5.Duplicate Name Detection (hasDuplicateNames):  With the help of a nested loop approach, this will check for the presence of two students having the same name. String comparison (equals) has been used to make sure the result is accurate.

6.Ordered Pattern Verification (isSorted):  This method will verify whether the list has been sorted based on marks. It will compare the mark of the current student to the mark of the next student. The moment the mark of the next student goes below the current one, it will return false.

7.Consecutive Pair Analysis (countImprovingPairs): This will calculate how many instances there are in which the mark of a student surpasses that of the previous student in the list. This is done by comparing pairs at consecutive indices in the list.

Sample Output: ArrayList<Student> italian = {Mario (67), Luigi (0), Abdalla (95), noyyel (95), groot (62), Aliman (88), zad (100), dan (82), Mario (67), Panda (91)}

Count above 80: 6
The top student: zad - 100
The students are (>= 90): Abdalla noyyel zad Panda
 Is there any Duplicated Names: true
Is the list sorted: false
How many pairs are increasing: 5
How many students passed (>= 60): 8

Challeneges Faced: I had an issue with writing the algorithm removeFailing because everytime i ran it. It would skip some elements and i couldnt really find the pattern because it kept changing when i chaneged the ArrayList i assigned to it eventually i remembered that when you remove an element in an arrayList because its dynamic everything shifts left causing the code to skip one to the right so i put a (i--) to put it back in the right order. I also used intriguing names beacuse i was bored.
