import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AtbashCipherTest {

    AtbashCipher cipher;
    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    @Before
    public void setUp(){
    cipher = new AtbashCipher(alphabet);
    }

    @Test
    public void encodeMethodEncodesTextWithAtbashCipher(){
        assertEquals(cipher.encode("Test"), "gvhg");
    }

    @Test
    public void encodeMethodDecodesTextWithAtbashCipher(){
        assertEquals(cipher.decode("gvhg"), "test");
        assertEquals(cipher.decode("gsvjf rxpyi ldmul cqfnk hlevi gsvoz abwlt"), "thequickbrownfoxjumpsoverthelazydog");
    }


}