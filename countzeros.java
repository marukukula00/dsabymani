public class countzeros {
public static void main(String[] args){
System.out.println(count(1020200));
    }
    static int count(int n){
       return helper(n,0);
        }
        private static int helper(int n,int count){
            if(n==0){
                return count;
            }
            if(n%10==0){
                return helper(n/10,count+1);
            }
            else{
                return helper(n/10,count);
            }
        }
    }

