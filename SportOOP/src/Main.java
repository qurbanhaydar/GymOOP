import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sports = "Exercises\n"+
                        "Burpee\n" +
                        "Squat\n" +
                        "Situp\n" +
                        "Pushup";

        System.out.println(sports);

        System.out.println("u should write exercises count which how many u want to do weekly");
        System.out.print("Burpee count: ");
        int burpee = scanner.nextInt();
        System.out.print("Squat count: ");
        int squat = scanner.nextInt();
        System.out.print("Squat count: ");
        int situp = scanner.nextInt();
        System.out.print("Situp count: ");
        int pushup = scanner.nextInt();
        scanner.nextLine();

        Sports sport = new Sports(burpee,squat,situp,pushup);

        System.out.println("Workout is starting......");

        while (sport.endOfExercise() == false) {
            System.out.print("Exercises: Burpee, Squat, Situp, Pushup: ");
            String workoutname = scanner.nextLine().toUpperCase();
            System.out.print("How many times do u want to do? ");
            int workoutcount = scanner.nextInt();
            scanner.nextLine();
            sport.doExercise(workoutname,workoutcount);

        }





    }
}