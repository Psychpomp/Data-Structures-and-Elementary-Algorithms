import java.io.*;
import java.util.LinkedList;
import java.util.Arrays;

import static java.lang.Character.compare;

public class Main {
    public static void main(String[] args) {
        int c;
        String path = "C:\\Users\\Ben\\Data-Structures-and-Elementary-Algorithms\\Data Structures\\Class 3\\Week 3 Lab\\src\\file.txt";
        try {
            File f = new File(path);
            FileReader fr = new FileReader(f);
            char[] array = new char[(int)f.length()];
            c = fr.read(array);
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i<array.length; i++) {
                sb.append(array[i]);
            }
            String file = sb.toString();
            file = file.replaceAll(" ", "");
            LinkedList<Character> list = new LinkedList<Character>();
            int n = file.length();
            char head = file.charAt(0);
            list.add(head);
            System.out.println(Arrays.toString(list.toArray()));
            int i = 1;
            do {
                if(i==1) {
                    char prev = head;
                    char curr = file.charAt(i);
                    int pos = list.indexOf(head);
                    if(curr<=prev) {
                        list.add(pos, curr);
                    }else if(curr>prev) {
                        list.add(curr);
                    }
                }else {
                    for(int j = 0; j<(n-1); j++) {
                        char curr = file.charAt(i);
                        char comp = list.get(j);
                        int d = compare(curr, comp);
                        if (d<=0) {
                            list.add(j, curr);
                            break;
                        }
                        if (curr>list.getLast()) {
                            list.add(curr);
                            break;
                        }
                    }
                }
                System.out.println(Arrays.toString(list.toArray()));
                i +=1;
            } while (i<n);
        } catch (FileNotFoundException e) {
            System.out.println("Invalid file.");
        } catch (IOException f) {
            System.out.println("Error.");
        }
    }
}
