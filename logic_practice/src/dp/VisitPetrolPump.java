import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Suppose there is a circle. There are n petrol pumps on that circle. You are given two sets of data.
The amount of petrol that every petrol pump has.
Distance from that petrol pump to the next petrol pump.
Calculate the first point from where a truck will be able to complete the circle (The truck will stop at each petrol pump and it has infinite capacity). Expected time complexity is O(n). Assume for 1-litre petrol, the truck can go 1 unit of distance.

For example, let there be 4 petrol pumps with amount of petrol and distance to next petrol pump value pairs as {4, 6}, {6, 5}, {7, 3} and {4, 5}. The first point from where the truck can make a circular tour is 2nd petrol pump. Output should be “start = 1” (index of 2nd petrol pump).
 */
public class VisitPetrolPump {
    static class PetrolPump {
        int  amount;
        int distance;
        PetrolPump(int a,int d){
          amount = a;
            distance = d;
        }
    }



    public static void main(String[] args) throws Exception {
        PetrolPump p[] = new PetrolPump[]{ new PetrolPump(4,6), new PetrolPump(6,5),new PetrolPump(7,3),new PetrolPump(4,5)};
        int size =p.length;
        int start =0;
        int end=p.length;
        int sum =0;
        int capa=0;
        while(start<size){
            int i= start;
            boolean flag=true;
            while(flag)
            {
               int l = (capa + p[i].amount) - p[i].distance;
               if(capa<0){
                   capa=0;
                   break;
               }else {
                   capa = capa+l;
               }
            }
            start++;
            if(start== i%size){
                flag =false;
            }
        }



    }

}
