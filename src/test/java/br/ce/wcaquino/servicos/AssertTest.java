package br.ce.wcaquino.servicos;

import br.ce.wcaquino.entidades.Usuario;
import org.junit.Assert;
import org.junit.Test;

public class AssertTest {

    @Test
    public  void test() {
        Assert.assertTrue(true);
        Assert.assertFalse(false);


        Assert.assertEquals("Erro de comaparação", 1, 1);
        Assert.assertEquals(0.51,0.51, 0.01);
        Assert.assertEquals(Math.PI, 3.14, 0.01);

        int i = 5;
        Integer i2 = 5;
        Assert.assertEquals(Integer.valueOf(i), i2);
        Assert.assertEquals(i,i2.intValue());

        Assert.assertEquals("bola", "bola");
        Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
        Assert.assertTrue("bola".startsWith("bo"));

        Usuario usuario = new Usuario("Usuario 1");
        Usuario usuario2 = new Usuario("Usuario 1");
        Usuario usuario3 = null;

        Assert.assertEquals(usuario, usuario2);

        Assert.assertSame(usuario2,usuario2);
        Assert.assertNotSame(usuario,usuario2);

        Assert.assertNull(usuario3);
        Assert.assertNotNull(usuario2);
    }
}
