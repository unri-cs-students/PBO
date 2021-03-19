package com.sammidev.testing;

public class App {
//
    public static void main(String[] args) {
        char[] A = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'};
        char[][] B = new char[3][5];
        // 00 01 02 03  10 11 12 13  20 21 22 23
        // {A,D,G,J,M}  {B,E,H,K,N}  {C,F,I,L,O}
        int index = 0;
        for (int i = 0; i < B[0].length; i++) {
            for (int j = 0; j < B.length; j++) {
                B[j][i] = A[index];
                index++;
            }
        }
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}

/*
// Example program
#include <iostream>
#include <string>
using namespace std;

int main(){

    int lengthBO = 3;
    int lengthB1 = 5;

    char A[15] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'};
    char B[3][5];
    int index = 0;

    for (int i = 0; i < lengthB1; i++) {
        for (int j = 0; j < lengthBO; j++) {
            B[j][i] = A[index];
            index++;
        }
    }

    for (int i = 0; i < lengthBO; i++) {
            for (int j = 0; j < lengthB1; j++) {
                cout << B[i][j];
            }

            cout << endl;
        }
}

* */