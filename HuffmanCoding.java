import java.util.PriorityQueue;
import java.util.HashMap;

class HuffmanNode implements Comparable<HuffmanNode> {
    char data;
    int frequency;
    HuffmanNode left, right;

    public HuffmanNode(char data, int frequency) {
        this.data = data;
        this.frequency = frequency;
        left = right = null;
    }

    @Override
    public int compareTo(HuffmanNode node) {
        return this.frequency - node.frequency;
    }
}

public class HuffmanCoding {

    public static void main(String[] args) {
        String inputString = "huffman coding example";

        HashMap<Character, Integer> frequencyMap = buildFrequencyMap(inputString);

        HuffmanNode root = buildHuffmanTree(frequencyMap);

        HashMap<Character, String> huffmanCodes = generateHuffmanCodes(root, "");

        System.out.println("Huffman Codes:");
        for (char c : huffmanCodes.keySet()) {
            System.out.println(c + ": " + huffmanCodes.get(c));
        }

        System.out.println("\nEncoded String:");
        String encodedString = encodeString(inputString, huffmanCodes);
        System.out.println(encodedString);

        System.out.println("\nDecoded String:");
        String decodedString = decodeString(encodedString, root);
        System.out.println(decodedString);
    }

    private static HashMap<Character, Integer> buildFrequencyMap(String input) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
    }

    private static HuffmanNode buildHuffmanTree(HashMap<Character, Integer> frequencyMap) {
        PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<>();
        for (char c : frequencyMap.keySet()) {
            priorityQueue.add(new HuffmanNode(c, frequencyMap.get(c)));
        }

        while (priorityQueue.size() > 1) {
            HuffmanNode left = priorityQueue.poll();
            HuffmanNode right = priorityQueue.poll();

            HuffmanNode internalNode = new HuffmanNode('\0', left.frequency + right.frequency);
            internalNode.left = left;
            internalNode.right = right;

            priorityQueue.add(internalNode);
        }

        return priorityQueue.poll();
    }

    private static HashMap<Character, String> generateHuffmanCodes(HuffmanNode root, String code) {
        HashMap<Character, String> huffmanCodes = new HashMap<>();
        generateCodesRecursive(root, code, huffmanCodes);
        return huffmanCodes;
    }

    private static void generateCodesRecursive(HuffmanNode root, String code, HashMap<Character, String> huffmanCodes) {
        if (root == null) {
            return;
        }

        if (root.data != '\0') {
            huffmanCodes.put(root.data, code);
        }

        generateCodesRecursive(root.left, code + "0", huffmanCodes);
        generateCodesRecursive(root.right, code + "1", huffmanCodes);
    }

    private static String encodeString(String input, HashMap<Character, String> huffmanCodes) {
        StringBuilder encodedString = new StringBuilder();
        for (char c : input.toCharArray()) {
            encodedString.append(huffmanCodes.get(c));
        }
        return encodedString.toString();
    }

    private static String decodeString(String encodedString, HuffmanNode root) {
        StringBuilder decodedString = new StringBuilder();
        HuffmanNode current = root;
        int i = 0;

        while (i < encodedString.length()) {
            if (encodedString.charAt(i) == '0') {
                current = current.left;
            } else {
                current = current.right;
            }

            if (current.data != '\0') {
                decodedString.append(current.data);
                current = root;
            }

            i++;
        }

        return decodedString.toString();
    }
}
