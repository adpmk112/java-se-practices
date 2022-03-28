package javaSE.kmp.testingHibernate.controller;

import javaSE.kmp.testingHibernate.view.AbstractView;
import org.dom4j.rule.Mode;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class AbstractControllerImpl<Model,View extends AbstractView<Model>>
                                    implements AbstractController<Model,AbstractView<Model>> {

    private Model model;
    private View view;

    @SuppressWarnings("unchecked")
    public AbstractControllerImpl(){
        Class<Model>modelClass = (Class<Model>)
                ((ParameterizedType)this.getClass().getGenericSuperclass())
                        .getActualTypeArguments()[0];

        Class<View>viewClass = (Class<View>)
                ((ParameterizedType)this.getClass().getGenericSuperclass())
                        .getActualTypeArguments()[1];

        model = (Model)getInstance(modelClass);
        view = (View)getInstance(viewClass);
    }

    private Object getInstance(Class<?> className){
        try {
            return className.getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Model getModel() {
        return model;
    }

    @Override
    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public AbstractView<Model> getView() {
        return view;
    }

    @Override
    public void setView(AbstractView<Model> view) {
        this.view = (View) view;
    }

    @Override
    public void printDetails(Model model) {
        view.printDetails(model);
    }

    @Override
    public void printDetails(List<Model> modelList) {
        view.printDetails(modelList);
    }
}
