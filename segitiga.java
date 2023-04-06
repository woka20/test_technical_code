public class segitiga{

    public static void Segitiga(int inputs){
        String intStr= String.valueOf(inputs);
        int Lenght= intStr.length();
        for(int i=0; i<Lenght; i++){

            double pangkat=Math.pow(10,i+1);
            double line=Integer.parseInt(String.valueOf(intStr.charAt(i)))*pangkat;
            System.out.println((int)line);
        }
        
    }

    public static void main(String[] args){
        Segitiga(123);
    }

}