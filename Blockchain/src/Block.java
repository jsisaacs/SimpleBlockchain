import java.util.ArrayList;

public class Block {
    private int index;
    private String previousHash;
    private long timeStamp;
    private String data;
    private String hash;

    public Block(int index, String previousHash, long timeStamp, String data, String hash) {
        this.index = index;
        this.previousHash = previousHash;
        this.timeStamp = timeStamp;
        this.data = data;
        this.hash = hash;
    }

    public static Block getGenesisBlock() {
        return new Block(0, "0", 0, "Genesis block data", "hash");
    }
}
