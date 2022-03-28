package javaSE.kmp.solidPrincipleAcat.srp;

import javaSE.kmp.solidPrincipleAcat.ocp.Condition;
import javaSE.kmp.solidPrincipleAcat.ocp.Filter;

import java.util.List;

public class ProductFilter implements Filter <Product> {

    @Override
    public void filter(List<Product> item, Condition condition) {
        for(Product out:item)
        {
            if(condition.isMatched(out))
            {
                System.out.println(out.getName());
            }
        }
    }
}
