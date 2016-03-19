package com.hit.learn.thinkinginjava.exception.example.ex9;

public class ExcptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            return;
        }
    }
}
//nothing output