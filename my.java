// 
// Decompiled by Procyon v0.5.36
// 

public class my
{
    public static void main(final String[] args) {
        for (int n = 14, i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i == 0 || i == n - 1 || j == n - 1 || j == 0 || i + j <= (n - 1) / 2 || j - i >= (n - 1) / 2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("      ");
            for (int j = 0; j < n; ++j) {
                if (i - j >= n / 2 - 1 || i + j >= (n - 1) / 2 + n - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("      ");
            for (int j = 0; j < n; ++j) {
                if (i == 0 || i == n - 1 || j == 0 || i - j >= n / 2 - 1 || i + j <= (n - 1) / 2) {
                    System.out.print("*");
                }
                else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}
