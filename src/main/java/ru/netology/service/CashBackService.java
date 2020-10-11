package ru.netology.service;

public class CashBackService {

    public int remain(int amount) {
        int boundary = 1000;
        return boundary - amount % boundary;
    }
}

