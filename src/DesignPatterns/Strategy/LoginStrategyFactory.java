package DesignPatterns.Strategy;

public class LoginStrategyFactory
{
    public static LoginStrategy getLoginStrategy(String choice)
    {
        LoginStrategy loginStrategy;
        if(choice.equalsIgnoreCase("username"))
        {
            loginStrategy = new UsernameStrategy();
        } else if (choice.equalsIgnoreCase("google")) {
            loginStrategy = new GoogleStrategy();
        } else if (choice.equalsIgnoreCase("otp")) {
            loginStrategy = new OTPStrategy();
        }else {
            throw new IllegalArgumentException("Invalid strategy");
        }

        return loginStrategy;
    }
}
