import java.util.Scanner;

public class VoteCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add Age of 10 students below :");
        int[] age = new int[10];
        for (int i = 0; i < 10; i++) {
            age[i]=sc.nextInt();
        }
        int canVote =0;
        int cantVote=0;
        for (int i = 0; i < 10; i++) {
            if(age[i]>=18){
                canVote++;
            }
            else {
                cantVote++;
            }
        }
        System.out.print(canVote+" students can vote and "+cantVote+" can not");
    }
}
