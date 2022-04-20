public class Main {
    public static void main(String[] args) {
        int num = 0, sum=0;
        String serie = "";
        int switche = 3;
        while(num<1800){
            if(switche == 2){
                num+=3;
                switche=3;
            }else if(switche == 3){
                num+=2;
                switche=2;
            }
            sum+=num;
            if(num==1800){
                serie += num;
            }else{
                serie += num + ", ";
            }
        }
        System.out.println(serie);
        System.out.println("suma: "+sum);
    }
}