import beans.ProdutoBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProdutoBeanTest {

    @Test
    void compareTo() {

        ProdutoBean maiorProduto = new ProdutoBean("10","prod10","prod1",10.0,"novo");
        ProdutoBean menorProduto = new ProdutoBean("0","prod0","prod1",0.0,"novo");
        ProdutoBean menorProduto2 = new ProdutoBean("0","prod0","prod1",0.0,"novo");

        Assertions.assertEquals(1,maiorProduto.compareTo(menorProduto),"Produto é maior, mas não retornou o valor correto");
        Assertions.assertEquals(-1,menorProduto.compareTo(maiorProduto),"Produto é menor, mas não retornou o valor correto");
        Assertions.assertEquals(0,menorProduto.compareTo(menorProduto2),"Produto é igual, mas não retornou o valor correto");

    }
}