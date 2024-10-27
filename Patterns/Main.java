public class Main {
    public static void main(String[] args) {
       int n = 5;
    //    Pattern1(n);
    //    Pattern2(n);
    //    Pattern3(n);
    //    Pattern4(n);
    //    Pattern5(n);
    //    Pattern6(n);
    //    Pattern7(n);
    //    Pattern8(n);
    //    Pattern9(n);
    //    Pattern10(n);
    //    Pattern11(n);
    //    Pattern12(n);
    //    Pattern13(n);
    //    Pattern14(n);
    //    Pattern15(n);
    //    Pattern16(n);
    //    Pattern17(n);
    //    Pattern18(n);
    //    Pattern19(n);
    //    Pattern20(n);
    //    Pattern21(n);
    //    Pattern22(n);
    //    Pattern23(n);
    //    pattern24(n);
    }

    public static void Pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void Pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void Pattern9(int n) {
        Pattern7(n);
        Pattern8(n);
    }

    public static void Pattern10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void Pattern11(int n) {
        int start;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                start = 0;
            } else {
                start = 1;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void Pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Pattern13(int n) {
        int start = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
        }
    }

    public static void Pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void Pattern15(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void Pattern16(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                char ch = 'A';
                ch = (char) (ch + (i - 1));
                System.out.print(ch);
            }
            System.out.println();
        }
    }


    public static void Pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint) ch++;
                else ch--;
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void Pattern18(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = (char) ('A' + (n - i));
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void Pattern19(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern20(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern21(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("4");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Pattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int bottom = (2 * n - 2) - i;
                int left = j;
                int right = (2 * n - 2) - j;

                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern23(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1;i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2*n)-(2*i+1)); j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern24(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            for(int j=1;j<=2*(i-1);j++){
                System.out.print("*");
            }
            for(int j=n-i+1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}




