package ch.heigvd.res.labs.roulette.net.protocol;

/**
 * This class is used to serialize/deserialize the response sent by the server
 * when processing the "BYE" command defined in the protocol specification. The
 * JsonObjectMapper utility class can use this class.
 *
 * @author Dbnsky & Iamfonky
 */
public class ByeCommandResponse
{
    private String status;
    private int numberOfCommands;

    public ByeCommandResponse(){
    }

    public ByeCommandResponse(String status, int nbCommande){
        this.status = status;
        this.numberOfCommands = nbCommande;
    }

    public String getStatus(){
        return status;
    }

    public int getNumberOfCommands(){
        return numberOfCommands;
    }
}
