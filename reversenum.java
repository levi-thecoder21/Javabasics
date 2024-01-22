public class reversenum {
    public static void main(String[] args){
        int num = 234457;
        int ans = 0;
        while(num>0){
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        }
        System.out.print(ans);
    }
}
