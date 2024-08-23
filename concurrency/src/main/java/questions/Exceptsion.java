package questions;

import java.io.IOException;

public class Exceptsion {
    public static void main(String[] args) throws IOException {
        String result = tryToReadFile();
        System.out.println("result = " + result);
    }

    public static void readFile() throws IOException {
        throw new IOException("IOException");
    }

    public static String tryToReadFile() throws IOException {
        try {
            readFile();
            return "try";
        } catch (IOException e) {
            return "catch";
        } finally {
            return "finally";
        }
    }
}
