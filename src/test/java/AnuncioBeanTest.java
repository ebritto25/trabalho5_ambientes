import beans.AnuncioBean;
import beans.ProdutoBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AnuncioBeanTest {

    @Test
    void getValor() {
        ProdutoBean prod1 = new ProdutoBean("1","prod1","prod1",100.0,"novo");

        // Anuncio com 10% de desconto
        AnuncioBean anuncio = new AnuncioBean(prod1,new ArrayList<>(),0.1);

        assertEquals(90,anuncio.getValor(),"Valor errado para após desconto aplicado.");

        // Anuncio com 5% de desconto
        anuncio = new AnuncioBean(prod1,new ArrayList<>(),0.05);

        assertEquals(95,anuncio.getValor(),"Valor errado para após desconto aplicado.");

        // Anuncio com 100% de desconto
        anuncio = new AnuncioBean(prod1,new ArrayList<>(),1.0);

        assertEquals(0,anuncio.getValor(),"Valor errado para após desconto aplicado.");

        // Anuncio com 0% de desconto
        anuncio = new AnuncioBean(prod1,new ArrayList<>(),0.0);

        assertEquals(100.0,anuncio.getValor(),"Valor errado para após desconto aplicado.");


    }
}