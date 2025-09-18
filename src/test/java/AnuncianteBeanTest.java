import beans.AnuncianteBean;
import beans.AnuncioBean;
import beans.ProdutoBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AnuncianteBeanTest {

    @Test
    void valorMedioAnuncios() {

        ProdutoBean prod1 = new ProdutoBean("1","prod1","prod1",100.0,"novo");
        ProdutoBean prod2 = new ProdutoBean("2","prod2","prod2",0.0,"novo");

        AnuncioBean anuncio = new AnuncioBean(prod1,new ArrayList<>(),0.0);
        AnuncioBean anuncio2 = new AnuncioBean(prod2,new ArrayList<>(),0.0);

        AnuncianteBean anunciante = new AnuncianteBean();

        anunciante.addAnuncio(anuncio);
        anunciante.addAnuncio(anuncio2);

        assertEquals(50.0,anunciante.valorMedioAnuncios(),"Valor médio de anúncios calculado errado");

        anunciante.removeAnuncio(1);

        assertEquals(100.0,anunciante.valorMedioAnuncios(),"Valor médio de anúncios calculado errado");

    }
}