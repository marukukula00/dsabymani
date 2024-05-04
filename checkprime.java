class checkprime{
    public static void main(String [] args){

    }
    static boolean check(int n){
if(n<=1){
    return false;
}
int c=2;
while(c*c<=n){
    if(n % c==0){
        return false;
    }
    c++;
}
return true;
    }
}