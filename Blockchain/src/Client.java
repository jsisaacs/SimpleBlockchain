import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<Block> blockchain = new ArrayList<>();
        blockchain.add(Block.getGenesisBlock());
    }
}
