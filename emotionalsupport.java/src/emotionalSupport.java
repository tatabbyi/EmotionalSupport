import java.util.Scanner;

public class emotionalSupport {
    public static void main(String[] args) {
        String output = "";
        Scanner myObj = new Scanner(System.in);
        System.out.println("How do you feel today? happy, sad, fine, depressed, anxious");
        String feelings = myObj.nextLine();

        switch (feelings) {
            case "happy":
                output = "Happiness is like a kiss. You must share it to enjoy it. - Bernard Meltzer";
                System.out.println(output);
                break;
            
            case "sad":
                output ="Your pain is the breaking of the shell that encloses your understanding. - Khalil Gibran";
                System.out.println(output);
                break;
            
            case "fine":
                output = "It's all about quality of life and finding a happy balance between work and friends and family. - Philip Green";
                System.out.println(output); 
                break;

            case "depressed":
                output ="Talking about our problems is our greatest addiction. Break the habit. Talk about your joys. Rita Schiano";
                System.out.println(output);
                break;

            case "anxious":
                output = " You don’t have to control your thoughts. You just have to stop letting them control you. — Dan Millman";
                System.out.println(output);
                break;

            default:
                System.out.println("This emotion is not supported, Seek assitance elsewhere");
                System.out.println(feelings = output);
        }

    }
}