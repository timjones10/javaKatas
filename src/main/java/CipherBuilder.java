public class CipherBuilder {

    public Cipher getCipher() {
        return cipher;
    }

    CipherBuilder(String alphabet){
        this.alphabet = alphabet;
        reverseAlphabet();
        populateCipher();
    }

    private Cipher cipher = new Cipher();
    private String alphabet;
    private String cipherAlphabet;

    public void reverseAlphabet(){
        StringBuilder builder = new StringBuilder();
        cipherAlphabet = builder.append(alphabet).reverse().toString();
    }

    public void populateCipher(){
        String[] alphabetArray = alphabet.split("(?!^)");
        String[] cipheralphabetArray = cipherAlphabet.split("(?!^)");
        for (int l = 0; l < alphabetArray.length; l++){
            cipher.put(alphabetArray[l], cipheralphabetArray[l]);
        }
    }

}
