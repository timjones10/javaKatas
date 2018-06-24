public class AtbashCipher {

    private Cipher cipher;

    AtbashCipher(String alphabet){
        CipherBuilder builder = new CipherBuilder(alphabet);
        cipher = builder.getCipher();

    }

    public String encode(String test) {
        String[] stringArray = test.toLowerCase().replaceAll("\\s+","").split("(?!^)");
        String[] encodedArray = new String[stringArray.length];
        for (int l = 0; l < stringArray.length; l++){
            encodedArray[l] = cipher.get(stringArray[l]).toString();
        }
        String encodedString = new String().join("", encodedArray);
        return encodedString;
    }

    public String decode(String test){
       return encode(test);
        }
}

