class Main{
    void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void pattern4(int n){
        for(int i=0;i<2*n-1;i++){
            if(i<n) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else if(i>n){
                for(int j=0;j<n-(i-4);j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    void pattern5(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=n-(i+2);j++){
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Main m=new Main();
        m.pattern1(5);
        System.out.println();
        m.pattern2(5);
        System.out.println();
        m.pattern3(5);
        System.out.println();
        m.pattern4(5);
        System.out.println();
        m.pattern5(5);
    }
}