import java.util.*;

public class SearchingForInformation {
    public static void main(String[] args) {

        Map<String, ArrayList>  userInformation = new HashMap<String, ArrayList>();

        ArrayList newUsername = new ArrayList();
        newUsername.add("Henk van 't Kruijs");
        newUsername.add("Mirjam van 't Kruijs");


        ArrayList newPassword = new ArrayList();
        newPassword.add("12345678");

        ArrayList newAge = new ArrayList();
        newAge.add("53 jaar");

        ArrayList newPostalCode = new ArrayList();
        newPostalCode.add("6717 SV");

        userInformation.put("ID_1", newUsername);

        System.out.println("The usernames are: " + newUsername );

        Iterator<String> iter = newUsername.iterator();

        System.out.println("\nThe iterator values" + " of newUsername are: ");
        while (iter.hasNext()) {
            System.out.println(iter.next() + " ");
        }
    }
}

