package studentComments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentComments {
    public static void main(String[] args) throws IOException {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        File f = new File("comments.txt");
        
        ArrayList<String> comments = new ArrayList<String>();
        
        
        boolean cont = true;
        while (cont) {
        
        System.out.println("Enter first name");
        String firstName = myObj.nextLine();  // Read user input
        
        System.out.println("Enter student's last name");
        String lastName = myObj.nextLine();
        
        System.out.println("Enter (1) understanding content without support, (2) understanding content with support, or (3) not understanding content");
        int p = Integer.parseInt(myObj.nextLine());
        String progress = "";		
        if (p == 1) {
        	progress = "understanding content without support";
        	
        }
        else if (p == 2) {
        	progress = "understanding content with support";
        }
        else if (p == 3) {
        	progress = "not understanding content";
        }
        
        
        System.out.println("One thing that they have done well these first two weeks is: Enter a praise");
        String praise = myObj.nextLine();
        System.out.println("We would like to see some some growth in the following area: Enter a prompt");
        String prompt = myObj.nextLine();
        System.out.println("Enter behavior progress: (1) has been excellent or (2) needs improvement");
        int b = Integer.parseInt(myObj.nextLine());
        String behavior = "";		
        if (p == 1) {
        	behavior = "has been excellent";
        	
        }
        else if (p == 2) {
        	behavior = "needs improvement";
        }
       
        System.out.println("We recommend " + firstName + " Enter [behavior praise or prompt]");
        String behaviorComment = myObj.nextLine();
       
        comments.add("Over the course of " + firstName + " " + lastName + "'s first two weeks at Breathrough Fort Worth, " + firstName + "'s Pre-Algebra skills have shown us that they are " + progress + ". One thing that they have done well these first two weeks is that they " + praise + ". We would like to see some some growth in the following area: " + prompt + ". Overall, " + firstName + " behavior in the classroom " + behavior + ". We recommend " + firstName +  " " + behaviorComment + ".");
		
		System.out.println("Do you want to continue? y or n");
		String ask = myObj.nextLine();
		
		if (ask.equals("n")) {
			cont = false;
		}
		
        }
        
        f.delete();
		f.createNewFile();
		FileWriter writer = new FileWriter(f);

		for (String c: comments) {
			writer.write(c + "\n");
		}
		
		writer.close();
		myObj.close();
        
        
       
    }
    

	
}
