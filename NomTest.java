import static org.junit.Assert.*;
import org.junit.*;
public class NomTest {
    @Test
    public void testProduct(){
        assertEquals(12, Nom.product(3, 4));//should pass now
    }
}
