import java.util.ArrayList;
import java.util.List;

public class prima{

    public static List<Integer> Prima(int inputs){

        List<Integer> result= new ArrayList<>();
        if (inputs > 2){
            for(int i=1; i<=inputs;i++){
                int count=0;
                for(int j=1; j<=i; j++){
                    if(i%j==0){
                        count+=1;
                    }
                
                }
                if(count==2){
                    result.add(i);
                }
            }
            

        }else if (inputs==2){
            result.add(2);
        }
        return result;
       
    }
    
    public static void main(String[] args){
        System.out.println(Prima(100));
    }
    
}
