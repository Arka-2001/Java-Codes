import java.util.ArrayList;
import java.util.Collections;
public class ArrayUserinput 
{
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("Volvo");
        cars.add("fortuna");
        cars.add("alto");
        cars.add("Suzuki");
        System.out.println(cars);
        System.out.println(cars.get(0));
        System.out.println(cars.size());
        System.out.println(cars.remove(2));
        System.out.println(cars);
        System.out.println(cars.set(0, "Wagner"));
        for(int i=0;i<cars.size();i++)
        {
            System.out.print(cars.get(i)+" ");
        }
        for(String a : cars){
            System.out.println(a);
        }
        Collections.sort(cars);
        System.out.println(cars);
    }
    
}
