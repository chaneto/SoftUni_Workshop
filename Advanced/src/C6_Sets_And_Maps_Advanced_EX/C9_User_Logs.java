package C6_Sets_And_Maps_Advanced_EX;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C9_User_Logs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Map<String,String>> in = new TreeMap<>();
        String num = "";
        while (true){
            String[] p = scanner.nextLine().split(" ");
            if(p[0].equals("end")){
                break;
            }
            String [] IP1 = p[0].split("=");
            String [] message1 = p[1].split("=");
            String [] user1 = p[2].split("=");
            String IP = IP1[1];
            String message = message1[1];
            String user = user1[1];
            if(!in.containsKey(user)){
                in.put(user,new LinkedHashMap<>());
                in.get(user).put(IP,"1");
            }else {
                if(!in.get(user).containsKey(IP)){
                    in.get(user).put(IP,"1");
                }else {
                    int vr = Integer.parseInt(in.get(user).get(IP));
                    vr++;
                    num += vr;
                    in.get(user).put(IP,num);
                    num = "";
                }
            }
        }for(Map.Entry<String,Map<String,String>> out : in.entrySet()){
            System.out.printf("%s: %n",out.getKey());
            int couter = out.getValue().size();
            for(Map.Entry<String,String> out1 : out.getValue().entrySet()){
                System.out.printf("%s => %s",out1.getKey(),out1.getValue());
                couter--;
                if(couter > 0){
                    System.out.print(", ");
                }else {
                    System.out.print(".");
                }

            }
            System.out.println();
        }
    }
}
