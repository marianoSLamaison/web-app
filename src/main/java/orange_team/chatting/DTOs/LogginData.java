package orange_team.chatting.DTOs;

/*
Data required for the user to log into their account. 
Next step is the registration screen
*/

public class LogginData {
    private String user_name;
    private String password;

    public LogginData(String name, String password)
    {
        user_name = name;
        this.password = password;
    }

    public String getUserName() {return user_name;}
    public String getPassword() {return password;}
}
