package C2_Stacks_and_Queues_EX;

import java.util.*;

public class C5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(";");
        Deque<String> dequefree = new ArrayDeque<>();
        List<String> busy = new ArrayList<>();
        Deque<String> dequeproduct = new ArrayDeque<>();
        Deque<String> vr = new ArrayDeque<>();
        Map<String,Integer> time = new LinkedHashMap<>();
        for (int i = 0; i < p.length; i++) {
            dequefree.offer(p[i]);
        }

        String[] a = scanner.nextLine().split(":");
        int hh = Integer.parseInt(a[0]);
        int min = Integer.parseInt(a[1]);
        int sec = Integer.parseInt(a[2]);
        while (true){
            String name = scanner.nextLine();

            if(name.equals("End")){
                break;
            }dequeproduct.offer(name);
        }
        while (true){
            if(dequeproduct.isEmpty()){
                break;
            }
            sec++;
            if(sec > 59){
                sec = 0;
                min++;
            }if(min > 59){
                min = 0;
                hh++;
            }if(hh > 23){
                hh = 0;
            }
            if(dequefree.size() > 0){
                String [] robot = dequefree.peek().split("-");
                String robotname = robot[0];
                int robottime = Integer.parseInt(robot[1]);
                time.put(dequefree.peek(),sec + robottime);
                System.out.printf("%s - %s [%02d:%02d:%02d]%n",robotname,dequeproduct.poll(),hh,min,sec);
                busy.add(dequefree.poll());
                for (Map.Entry<String,Integer> out : time.entrySet()){
                    String robname = out.getKey();
                    int rrrr = out.getValue();
                    if(out.getValue() <= sec){
                        dequefree.offer(robname);
                        time.remove(robname);
                        break;
                    }
                }

            }else {
                while (true) {
                    if (dequefree.size() > 0) {
                        sec--;
                        break;
                    }
                    sec++;
                    String one = dequeproduct.poll();
                    dequeproduct.offer(one);
                    for (Map.Entry<String, Integer> out : time.entrySet()) {
                        String robname = out.getKey();
                        int rrrr = out.getValue();
                        if (out.getValue() <= sec) {
                            dequefree.offer(robname);
                            busy.remove(robname);
                            vr.offer(robname);
                            break;
                        }
                    }
                    while (!vr.isEmpty()) {
                        time.remove(vr.poll());
                    }
                }
            }

        }
    }
}
