import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        // Huffman huffman = new Huffman("aaaaabbbbcccdde");

        // String encodedText = huffman.encode();
        // System.out.println(encodedText);

        // huffman.printCodes();

        // String originalText = huffman.decode(encodedText);
        // System.out.println(originalText);

        String text = "aaaabbbccd";
        Map<Character, Integer> stuff = new HashMap<Character, Integer>();

        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if(stuff.get(c) == null) {
                stuff.put(c, 1);
            } else {
                stuff.put(c, stuff.get(c) + 1);
            }
        }
        
        for(Entry<Character, Integer> entry : stuff.entrySet()){
            System.out.println("key: " + entry.getKey() + " value: " + entry);
        }
    }
}
