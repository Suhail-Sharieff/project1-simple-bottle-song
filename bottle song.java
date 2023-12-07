// 10 green bottles hanging on the wall x2
//and one green bottle should accidentaly fall
//...........1 green bottle hing on the wall
//no green bottle hanging on the wall
/**
 * mai
 */
public class mai {

    public static void main(String[] args) {
        String word="bottles";
        int num=10;
        for (int i = num; i > 0; num--) {
            if(num>1){
                System.out.println(num+"green"+word+"hanging on the wall");
                System.out.println(num+"green"+word+"hanging on the wall");
                System.out.println("and one green bottle should accidentaly fall");
                System.out.println("\n");
            }
             if(num==1){
                System.out.println(num+"green"+word.replace('s',' ')+"hanging on the wall");
                System.out.println(num+"green"+word.replace('s',' ')+"hanging on the wall");
                
                System.out.println("and last green bottle should accidentaly fall");break;
            }
        }
        System.out.println("\n");
        System.out.println("there is no green bottle to hang on th wall");
    }
}