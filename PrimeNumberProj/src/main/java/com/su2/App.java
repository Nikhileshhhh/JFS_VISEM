package com.su2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find prime numbers between two numbers");
        System.out.println("Enter Number1(Start):");
        int m = sc.nextInt();
        System.out.println("Enter Number2(End):");
        int n = sc.nextInt();
        boolean[] bool = new boolean[n+1];
        Arrays.fill(bool,true);
        for(int i=2;i*i<=n;i++){
            if(bool[i]){
                for(int j=i*i;j<=n;j+=i){
                    bool[j] = false;
                }
            }
        }
        for(int i=m;i<=n;i++){
            if(bool[i]){
                System.out.print(i+" ");
            }
        }
        // ArrayList<Integer> primes = primebetween(n,m);
        // System.out.println("Prime numbers between "+n+" and "+m+" are: ");
        // for(int prime : primes){
        //     System.out.print(prime+" ");
        // }
        sc.close();
    }
    public static ArrayList<Integer> primebetween(int m, int n){
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i=m;i<=n;i++){
            if(isprime(i)){
                primes.add(i);
            }
        }
        return primes;
    }
    public static boolean isprime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
