import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        System.out.println();
        Student s1 = new Student(999,"varunpareek.com","Varun",101);
        Student s2 = new Student(998,"kanupareek.com","Kanu",102);
        Student s3 = new Student(997,"adhirajsingh.com","Adhiraj",103);
        Student s4 = new Student(996,"parasgoyal.com","Paras",104);
        Student s5 = new Student(995,"kanishktiwari.com","Kanishk",105);
        Student s6 = new Student(994,"riyakhandelwal.com","Riya",106);
        Student s7 = new Student(993,"shivamsharma.com","Shivam",107);
        Student s8 = new Student(992,"preettaparia.com","Preet",108);
        Student s9 = new Student(991,",milli.com","Milli",109);
        Student s10 = new Student(990,"dobby.com","Dobby",110);
//        List<Student> studArray;


        // Creating 3 TrainersTrainer t1 = new Trainer(10,"Gajodhar","gajodhar.com",881);
        // List of TechStack



        TechStack ts1 = new TechStack(1,"HTML","Description");
        TechStack ts2 = new TechStack(3,"Java","Description");
        TechStack ts3 = new TechStack(2,"CSS","Description");

        ArrayList<TechStack> techStackArrayList = new ArrayList<>();
        techStackArrayList.add(ts1);
        techStackArrayList.add(ts2);
        techStackArrayList.add(ts3);


        Trainer t1 = new Trainer(13,"Rinku","rinku.com",321,techStackArrayList);
        Trainer t2 = new Trainer(12,"Honey","honey.com",883,techStackArrayList);
        Trainer t3 = new Trainer(11,"Gajudhar Singh Paliwal","gajo3har.com",883,techStackArrayList);


        Question q1 = new Question();

        Assignment as1 = new Assignment();
        Assignment as2 = new Assignment();
        Assignment as3 = new Assignment();
        Assignment as4 = new Assignment();





//        System.out.println(t2.toString());

    }
}
