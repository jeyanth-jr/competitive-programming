/*program to find the frequency of each lower case in a string
 input:all lower case
 o/p: ascending order of characters
 * */
public class Main {
    public static void main(String[] args) {
        Main n=new Main();
        String s="java programming";
        int l=s.length();
        for(int i=97;i<123;i++){
            char c=(char)i;
            if(n.count(s,c)!=0){
                System.out.println(c+":"+n.count(s,c));
            }
        }
    }
    int count(String x,char a){
        int count=0; //1
        int len=x.length(); //1
        for(int i=0;i<len;i++){ //n+1
            if(x.charAt(i)==a){ //n
                count+=1;
            }
        }
        return count; //1
    }
}
/*                           -------------
                               O(n)=2n+4
 */