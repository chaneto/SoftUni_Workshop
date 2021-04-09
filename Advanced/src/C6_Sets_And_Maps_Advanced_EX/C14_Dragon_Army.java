package C6_Sets_And_Maps_Advanced_EX;

import java.util.*;

public class C14_Dragon_Army {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt (scanner.nextLine ());
        Map<String,Double> mapdamageavg = new LinkedHashMap<> ();
        Map<String,Double> maphealthavg = new LinkedHashMap<> ();
        Map<String,Double> maparmoravg = new LinkedHashMap<> ();
        Map<String,Map<String,Double>> mapdamage = new LinkedHashMap<> ();
        Map<String,Map<String,Double>> maphealth = new LinkedHashMap<> ();
        Map<String,Map<String,Double>> maparmor = new LinkedHashMap<> ();
        for (int i = 0; i < a; i++) {
            String[] p = scanner.nextLine ().split ("\\s+");
            String paint = p[0];
            String name = p[1];
            String damage1 = p[2];
            double damage = 0;
            if(damage1.equals ("null")){
                damage = 45;
            } else {
                damage = Double.parseDouble (p[2]);
            }
            double health = 0;
            String health1 = p[3];
            if(health1.equals ("null")){
                health = 250;
            }else {
                health = Double.parseDouble (p[3]);
            }
            double armor = 0;
            String armor1 = p[4];
            if(armor1.equals ("null")){
                armor = 10;
            }else {
                armor = Double.parseDouble (p[4]);
            }
            if(!maparmoravg.containsKey (paint)){
                mapdamageavg.put (paint,damage);
                maphealthavg.put (paint,health);
                maparmoravg.put (paint,armor);
                mapdamage.put (paint,new TreeMap<> ());
                mapdamage.get (paint).put (name,damage);
                maphealth.put (paint,new TreeMap<> ());
                maphealth.get (paint).put (name,health);
                maparmor.put (paint,new TreeMap<> ());
                maparmor.get (paint).put (name,armor);
            }else {
                if(!mapdamage.get (paint).containsKey (name)){
                    mapdamage.get (paint).put (name,damage);
                    mapdamageavg.put (paint,mapdamageavg.get (paint) + damage);

                }else {
                    mapdamage.get (paint).put (name,damage);
                    double ttt = mapdamage.get (paint).get (name);
                    mapdamageavg.put (paint, damage);
                }
                if(!maphealth.get (paint).containsKey (name)){
                    maphealth.get (paint).put (name,health);
                    maphealthavg.put (paint,maphealthavg.get (paint) + health);
                }else {
                    maphealth.get (paint).put (name,health);
                    double ttt = maphealth.get (paint).get (name);
                    maphealthavg.put (paint,health);
                }
                if(!maparmor.get (paint).containsKey (name)){
                    maparmor.get (paint).put (name,armor);
                    maparmoravg.put (paint,maparmoravg.get (paint) + armor);

                }else {
                    maparmor.get (paint).put (name,armor);
                    double ttt = maparmor.get (paint).get (name);
                    maparmoravg.put (paint,armor);
                }
            }

        }
        for(Map.Entry<String,Double> out : mapdamageavg.entrySet ()){
            System.out.printf ("%s::(%.2f/",out.getKey (),out.getValue () / mapdamage.get (out.getKey ()).size () );
            System.out.printf ("%.2f/",maphealthavg.get (out.getKey ()) / maphealth.get (out.getKey ()).size ());
            System.out.printf ("%.2f)%n",maparmoravg.get (out.getKey ()) / maparmor.get (out.getKey ()).size ());
            mapdamage.get (out.getKey ())
                    .entrySet ()
                    .stream ()
                    .forEach (f -> System.out.printf ("-%s -> damage: %.0f, health: %.0f, armor: %.0f%n",f.getKey (),
                            mapdamage.get (out.getKey ()).get (f.getKey ()),
                            maphealth.get (out.getKey ()).get (f.getKey ()),
                            maparmor.get (out.getKey ()).get (f.getKey ())));

        }
    }
}
