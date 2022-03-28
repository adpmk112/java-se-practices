package javaSE.kmp.solidPrincipleAcat.ocp;

import java.util.List;

public interface Filter<T> {
    void filter(List<T> item, Condition condition);
}
