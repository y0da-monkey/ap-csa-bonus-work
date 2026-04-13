import java.util.*;
class StudentAnalyzer {
    private ArrayList<Student> studentList;

    public StudentAnalyzer(ArrayList<Student> list) {
        studentList = list;
    }

    public int countAbove(int threshold){
    int count =0;
        for(int i=0;i<studentList.size();i++){
            if(studentList.get(i).getMarks() > threshold){
                count++;
            }
        }
    return count;
    }
    
    public void removeFailing(int passMark){
        for(int i=0;i<studentList.size();i++){
            if(studentList.get(i).getMarks() < passMark){
                studentList.remove(i);
                i--;
            }
        }
    }
    
    public Student findTopStudent(){
        Student highest = studentList.get(0);
        for(int i=1;i<studentList.size();i++){
            if(highest.getMarks()<studentList.get(i).getMarks()){
                highest = studentList.get(i);
            }
        }
    return highest;
    }

    public ArrayList<Student> getTopStudents(int threshold){
        ArrayList<Student> updatedList = new ArrayList<>();

        for(int i=0;i<studentList.size();i++){
            if(studentList.get(i).getMarks()>=threshold){
                updatedList.add(studentList.get(i));
            }
        }
    return updatedList;
    }

    public boolean hasDuplicateNames(){
        for(int i = 0; i < studentList.size(); i++){
            for(int j = i + 1; j < studentList.size(); j++){
                if(studentList.get(i).getName().equals(studentList.get(j).getName())){
                    return true;
                }
            }
        }
        return false;
    }
    

    public boolean isSorted(){
        for(int i =0;i<studentList.size()-1;i++){
            if(studentList.get(i+1).getMarks()<studentList.get(i).getMarks()){
                return false;
            }
        }
    return true;
    }

    public int countImprovingPairs(){
    int count =0;
        for(int i =0;i<studentList.size()-1;i++){
            if(studentList.get(i+1).getMarks()>studentList.get(i).getMarks()){
                count++;
            }
        }
    return count;
    }



    public static void main(String[] args) {

        ArrayList<Student> italian = new ArrayList<>();

    italian.add(new Student("mario", 67)); 
    italian.add(new Student("luigi", 0)); 
    italian.add(new Student("sbdalla", 95)); 
    italian.add(new Student("noyyel", 95)); 
    italian.add(new Student("groot", 62)); 
    italian.add(new Student("aliman", 88)); 
    italian.add(new Student("zad", 100)); 
    italian.add(new Student("dan", 82)); 
    italian.add(new Student("mario", 67)); 
    italian.add(new Student("panda", 91)); 

    
    StudentAnalyzer analyzer = new StudentAnalyzer(italian);

    // Part (a): Conditional Counting 
    System.out.println("Count above 80: " + analyzer.countAbove(80)); 

    // Part (c): Maximum with Object Return 
    Student top = analyzer.findTopStudent();
    System.out.println("The top student:  " + top.getName() + " - " + top.getMarks());

    // Part (d): Filtered List Construction 
    ArrayList<Student> topList = analyzer.getTopStudents(90);
    System.out.print("The students are: ");
    for (int i = 0; i < topList.size(); i++) {
        System.out.print(topList.get(i).getName() + " ");
    }
    System.out.println();

    // Part (e): Duplicate Detection 
    System.out.println(" Is there any Duplicated Names: " + analyzer.hasDuplicateNames());

    // Part (f): Ordered Pattern Verification 
    System.out.println("Is the list sorted: " + analyzer.isSorted());

    // Part (g): Consecutive Pair Analysis 
    System.out.println("How many pairs are increasing: " + analyzer.countImprovingPairs());

    // Part (b): Safe Removal During Traversal 
    analyzer.removeFailing(60); 
    
    
    System.out.println("How many students passed: " + analyzer.countAbove(-1));
}
}