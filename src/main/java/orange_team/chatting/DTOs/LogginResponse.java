package orange_team.chatting.DTOs;
/*
On the basis that I assume it will be more confortable if I don't have to change my methods to 
recieve info from the server, Whe will be sending objects turn into jsons. 
*/
public class LogginResponse {
    private boolean _response;
    public LogginResponse(boolean value)
    {
        this._response = value;
    }
    public boolean getResponse() {return _response;}
}
