public class EncodingTest {

    public void testSimpleTextEncoding() {
        // TODO
        // Bonus +10 points -- implement three unique test cases.
        // Refer to Main.java for example usage.
        Huffman huffman1 = new Huffman("aaaa");
        String encoded1 = huffman1.encode();
        System.out.println("Test 1 - Encoding 'aaaa': " + encoded1);
        huffman1.printCodes();

        Huffman huffman2 = new Huffman("abcd");
        String encoded2 = huffman2.encode();
        System.out.println("Test 2 - Encoding 'abcd': " + encoded2);
        huffman2.printCodes();

        Huffman huffman3 = new Huffman("aabcc");
        String encoded3 = huffman3.encode();
        System.out.println("Test 3 - Encoding 'aabcc': " + encoded3);
        huffman3.printCodes();
    }

}
