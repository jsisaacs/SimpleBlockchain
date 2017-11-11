import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        ArrayList<Block> blockchain = new ArrayList<>();
        blockchain.add(Block.getGenesisBlock());
    }
}
