import java.util.ArrayList;
import java.util.List;

public class ganjil {
    public static List<Integer> Ganjil(int inputs){
        List<Integer> result= new ArrayList<>();
        for(int i=0; i<=inputs; i++){
            if(i%3==0){
                result.add(i);

            }
        }
        return result;
    }

    public static void main(String args[]){
        System.out.println(Ganjil(100));
    }
    
}
