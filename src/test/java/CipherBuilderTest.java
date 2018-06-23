import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CipherBuilderTest {

    CipherBuilder cipherBuilder;
    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    @Before
    public void setup(){
    cipherBuilder = new CipherBuilder(alphabet);
    }

    @Test
    public void cipherBuilderCreatesCipher(){
        cipherBuilder.reverseAlphabet();
        cipherBuilder.populateCipher();
        assertEquals("z", cipherBuilder.getCipher().get("a"));
    }
}