import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String filePath=scanner.next();
        //String filePath="C:\\Users\\Vishal\\IdeaProjects\\AllArrays\\src\\data.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        ArrayList<String> stringArrayList=new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null) {
                String[] leett = line.split(cvsSplitBy); //Removing commas from file

                String iStr="";
                for(String s:leett)
                {
                    iStr=iStr+s.charAt(1); //Removing inverted commas from string and concatenate the character to single string.
                }

                stringArrayList.add(iStr);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace(); //Handling FileNotFoundException
        } catch (IOException e) {
            e.printStackTrace(); //Handling IOException
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //Iteration using loop with one character for a string at a time
        for (int i = 0; i < stringArrayList.get(0).length(); i++) {
            for (int j = 0; j < stringArrayList.get(1).length(); j++) {
                for (int k = 0; k < stringArrayList.get(2).length(); k++) {
                    System.out.print("\'"+stringArrayList.get(0).charAt(i)+stringArrayList.get(1).charAt(j)+stringArrayList.get(2).charAt(k)+"\'"+",");
                }
            }
        }

    }



}
