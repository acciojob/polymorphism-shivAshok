package com.driver;

public class Main {

 public static  class Product{
        public int product(int x,int y){
return 1;
        }
        public int product(int x,int y,int z){
            return 2;
        }
        public double product(double x,double y){
            return 3.0;
        }
    }
    public static void main(String[] args){
        Product P=new Product();
        System.out.print(P.product(1,2));
        System.out.print(P.product(1,2,3));
        System.out.print(P.product(1.2,1.3));
    }
}