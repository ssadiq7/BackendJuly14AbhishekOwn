package DesignPatterns.Strategy;

public class UsernameStrategy implements LoginStrategy{
    @Override
    public void login() {
        System.out.println("Logging in using username & password");
    }
}
