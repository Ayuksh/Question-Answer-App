package application;

import java.util.Scanner;

public class MainApp {

    static Scanner sc = new Scanner(System.in);
    static QuestionService service = new QuestionImpl();

    public static void main(String[] args) {
        System.out.println("SELECT OPERATION --> ");
        System.out.println("1. ADD QUESTION ");
        System.out.println("2. REMOVE QUESTION ");
        System.out.println("3. UPDATED QUESTION");
        System.out.println("4. exit ");
        int ch = sc.nextInt() ;

        switch (ch)
        {
            case 1:
                addQuestion() ;
                break;
            case 2:
                removeQuestion();
                break;
            case 3:
                updateQuestion();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("INVALID INPUT ");
        }

       main(args);
    }

    public static void addQuestion()
    {
        System.out.println("ENTER QUESTION -->");
        String question = sc.nextLine() ;
        question = sc.nextLine() ;

        System.out.println("ENTER OPTION 1 ");
        String option1 = sc.nextLine() ;

        System.out.println("ENTER OPTION 2 ");
        String option2 = sc.nextLine() ;

        System.out.println("ENTER OPTION 3 ");
        String option3 = sc.nextLine() ;

        System.out.println("ENTER ANSWER ");
        String answer = sc.nextLine() ;

       Question newQuestion = new Question(question , option1 , option2 , option3 , answer);
       int n = service.addQuestions(newQuestion);
        System.out.println(n+" RECORD INSERTED !!");
        System.out.println("\n\n");
    }


    public static void removeQuestion()
    {
        System.out.println("ENTER THE QUESTION ID ");
        int questionId = sc.nextInt() ;

        int n = service.removeQuestions(questionId);
        System.out.println(n + "RECORD DELETED ");
        System.out.println("\n\n");
    }

    public static void updateQuestion(){
        System.out.println("1. MODIFY QUESTION ");
        System.out.println("2. MODIFY OPTIONS ");
        System.out.println("3. exit ");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                // modifyQuestion() ;
                break;
            case 2:
                // modifyOptions();
                break;
            case 3 :
                return;

        }

        updateQuestion();

    }


}