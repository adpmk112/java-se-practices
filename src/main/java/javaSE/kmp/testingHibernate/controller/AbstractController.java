package javaSE.kmp.testingHibernate.controller;

import javaSE.kmp.testingHibernate.view.AbstractView;

public interface AbstractController <Model,View extends AbstractView<Model>>
                                           extends AbstractView<Model> {
    Model getModel();
    void setModel(Model model);

    View getView();
    void setView(View view);
}
