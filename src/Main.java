import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        System.out.println();
        Student s1 = new Student(999,"varunpareek.com","Varun",101);
        Student s2 = new Student(998,"rohan123.com","Rohan",102);
        Student s3 = new Student(997,"adhirajsingh.com","Adhiraj",103);
        Student s4 = new Student(996,"parasgoyal.com","Paras",104);
        Student s5 = new Student(995,"kanishktiwari.com","Kanishk",105);
        Student s6 = new Student(994,"riyakhandelwal.com","Riya",106);
        Student s7 = new Student(993,"shivamsharma.com","Shivam",107);
        Student s8 = new Student(992,"preettaparia.com","Preet",108);
        Student s9 = new Student(991,",milli.com","Milli",109);
        Student s10 = new Student(990,"dobby.com","Dobby",110);
//        List<Student> studArray;



        // List of TechStack
        TechStack ts1 = new TechStack(1,"HTML","Description");
        TechStack ts2 = new TechStack(3,"Java","Description");
        TechStack ts3 = new TechStack(2,"CSS","Description");
        TechStack ts4 = new TechStack(4,"SpringBoot","Description");
        TechStack ts5 = new TechStack(5,"NodeJS","Description");
        ArrayList<TechStack> techStackArrayList = new ArrayList<>();
        techStackArrayList.add(ts1);
        techStackArrayList.add(ts2);
        techStackArrayList.add(ts3);
        techStackArrayList.add(ts4);
        techStackArrayList.add(ts5);


        // List of Trainers
        Trainer t1 = new Trainer(13,"Rinku","rinku.com",321,techStackArrayList);
        Trainer t2 = new Trainer(12,"Honey","honey.com",883,techStackArrayList);
        Trainer t3 = new Trainer(11,"Gajodhar Singh Paliwal","gajo3har.com",883,techStackArrayList);
        ArrayList<Trainer> trainerList = new ArrayList<>();
        trainerList.add(t1);
        trainerList.add(t2);
        trainerList.add(t3);


        //Some answer keys
        Answer correctAnswer1 = new Answer(1, "Correct Answer 1", true);
        Answer correctAnswer2 = new Answer(2, "Correct Answer 2", true);
        Answer correctAnswer3 = new Answer(3, "Correct Answer 3", true);
        Answer correctAnswer4 = new Answer(4, "Correct Answer 4", true);


        // Answers List
        List<Answer> answers1 = new ArrayList<>();
        answers1.add(new Answer(1, "Answer 1", true));
        answers1.add(new Answer(2, "Answer 2", false));
        answers1.add(new Answer(3, "Answer 3", false));
        answers1.add(new Answer(4, "Answer 4", false));

        List<Answer> answers2 = new ArrayList<>();
        answers2.add(new Answer(1, "Answer 1", false));
        answers2.add(new Answer(2, "Answer 2", true));
        answers2.add(new Answer(3, "Answer 3", false));
        answers2.add(new Answer(4, "Answer 4", false));

        List<Answer> answers3 = new ArrayList<>();
        answers3.add(new Answer(1, "Answer 1", false));
        answers3.add(new Answer(2, "Answer 2", false));
        answers3.add(new Answer(3, "Answer 3", true));
        answers3.add(new Answer(4, "Answer 4", false));

        List<Answer> answers4 = new ArrayList<>();
        answers4.add(new Answer(1, "Answer 1", false));
        answers4.add(new Answer(2, "Answer 2", false));
        answers4.add(new Answer(3, "Answer 3", false));
        answers4.add(new Answer(4, "Answer 4", true));



        // 4 Question for each assignment
        // total assignments = 4;

        List<Question> questions1 = new ArrayList<>();
        questions1.add(new Question(1, 10, answers1, correctAnswer1, ts1, null));
        questions1.add(new Question(2, 10, answers2, correctAnswer2, ts2, null));
        questions1.add(new Question(3, 10, answers3, correctAnswer3, ts3, null));
        questions1.add(new Question(4, 10, answers4, correctAnswer4, ts4, null));

        List<Question> questions2 = new ArrayList<>();
        questions2.add(new Question(5, 10, answers1, correctAnswer1, ts5, null));
        questions2.add(new Question(6, 10, answers2, correctAnswer2, ts1, null));
        questions2.add(new Question(7, 10, answers3, correctAnswer3, ts4, null));
        questions2.add(new Question(8, 10, answers4, correctAnswer4, ts2, null));

        List<Question> questions3 = new ArrayList<>();
        questions3.add(new Question(9, 10, answers1, correctAnswer1, ts3, null));
        questions3.add(new Question(10, 10, answers2, correctAnswer2, ts4, null));
        questions3.add(new Question(11, 10, answers3, correctAnswer3, ts1, null));
        questions3.add(new Question(12, 10, answers4, correctAnswer4,ts5, null));

        List<Question> questions4 = new ArrayList<>();
        questions4.add(new Question(13, 10, answers1, correctAnswer1, ts2, null));
        questions4.add(new Question(14, 10, answers2, correctAnswer2, ts2, null));
        questions4.add(new Question(15, 10, answers3, correctAnswer3, ts3, null));
        questions4.add(new Question(16, 10, answers4, correctAnswer4, ts1, null));



        // Assignments
        Assignment assignment1 = new Assignment(1, "Java Basics", "Introduction to Java", new Date(), questions1);
        Assignment assignment2 = new Assignment(2, "Advanced Java", "Java Advanced Concepts", new Date(), questions2);
        Assignment assignment3 = new Assignment(3, "Python Basics", "Introduction to Python", new Date(), questions3);
        Assignment assignment4 = new Assignment(4, "Advanced Python", "Python Advanced Concepts", new Date(), questions4);




    // Results data
        ResultData resultData = new ResultData();

        Result result2 = new Result(2, s2, assignment2, 56, "Well done!", new Date());
        Result result1 = new Result(1, s1, assignment1,100, "Good job!", new Date());
        Result result3 = new Result(3, s3, assignment4, 85, "Well done!", new Date());
        Result result4 = new Result(4, s4, assignment3, 99, "Well done!", new Date());
        Result result5 = new Result(5, s5, assignment1, 71, "Well done!", new Date());
        Result result6 = new Result(6, s6, assignment2, 88, "Well done!", new Date());
        resultData.addResult(result1);
        resultData.addResult(result2);
        resultData.addResult(result3);
        resultData.addResult(result4);
        resultData.addResult(result5);
        resultData.addResult(result6);



        //HIGHEST PERFORMER METHOD IN RESULTDATA CLASS
        Student highestPerformer = resultData.findHighestPerformer();
        System.out.println(highestPerformer.getName());


        // SECOND HIGHEST
        Student secondHighestPerformer = resultData.findSecondHighestPerformer();
        System.out.println(secondHighestPerformer.getName());

        // Ranking List
        resultData.rankingList();

//         Students who scored less than 60%
        List<Student> scoreLessThan60 = resultData.studentsLessThan60();
        scoreLessThan60.forEach(System.out::println);


       // Results for Rohan
        resultData.printResultsForStudent(resultData,"Rohan");

        // Similarly for Varun
        resultData.printResultsForStudent(resultData,"Varun");







    }
}
