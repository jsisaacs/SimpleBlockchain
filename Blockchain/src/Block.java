import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.security.*;
import java.util.Arrays;

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

    public String calculateHash(int index, String previousHash, long timeStamp, String data) throws NoSuchAlgorithmException {
        String value = Integer.toString(index) + previousHash + Long.toString(timeStamp) + data;
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(value.getBytes(StandardCharsets.UTF_8));
        return Arrays.toString(hash);
    }

    public String calculateHashForBlock(Block b) throws NoSuchAlgorithmException {
        return calculateHash(b.index, b.previousHash, b.timeStamp, b.data);
    }


}
