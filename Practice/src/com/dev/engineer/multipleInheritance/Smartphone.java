package com.dev.engineer.multipleInheritance;

public class Smartphone implements Camera, MusicPlayer, Phone {
    @Override
    public void takePhoto() {
        System.out.println("Take photo on Smartphone.");
    }

    @Override
    public void recordVideo() {
        System.out.println("Record Video on Smartphone.");
    }

    @Override
    public void playMusic() {
        System.out.println("Play Music on Smartphone.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stop Music on Smartphone.");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Make call "+ number +" on Smartphone.");
    }

    @Override
    public void endCall() {
        System.out.println("Stop Music on Smartphone.");
    }
}
