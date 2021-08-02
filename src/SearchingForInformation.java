import java.util.*;

public class SearchingForInformation {
    public static void main(String[] args) {

        HashMap<String, ArrayList>  userInformation = new HashMap<String, ArrayList>();

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

        Set<Map.Entry<String, ArrayList>> setMap = userInformation.entrySet();
        Iterator<Map.Entry<String, ArrayList>> iteratorMap = setMap.iterator();

        System.out.println("\nHashmap with multiple Values");

        while(iteratorMap.hasNext()) {
            Map.Entry<String, ArrayList> entry =
                    (Map.Entry<String, ArrayList>) iteratorMap.next();
            String key = entry.getKey();
            List values = entry.getValue();
            System.out.println("Key = '" + key + "' has values: " + values);
        }
    }
}

