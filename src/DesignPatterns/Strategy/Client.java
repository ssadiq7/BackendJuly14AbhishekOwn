package DesignPatterns.Strategy;

public class Client
{
    public static void main(String[] args) {
        LoginStrategy loginStrategy = new OTPStrategy();
        loginStrategy.login();
    }
}
