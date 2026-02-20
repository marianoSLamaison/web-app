package orange_team.chatting.DomainObjects;

public class Poster {
    String id_name;
    String p_name;
    String coded_Password;
    String Email;
    public Poster(String id_name, String p_name, String coded_Password, String Email)
    {
        this.id_name = id_name;
        this.p_name = p_name;
        this.coded_Password = coded_Password;
        this.Email = Email;
    }
    public String GetIdName() {return id_name;}
    public String GetPName() {return p_name;}
    public String GetCodedPassword() {return coded_Password;}
    public String GetEmail() {return Email;}
}
