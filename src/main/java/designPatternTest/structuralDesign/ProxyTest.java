package designPatternTest.structuralDesign;

import projDemo.metaCalculator.Test;

public class ProxyTest {
    public static void main(String[] args){
        Data data1 = new DataProxy("123451");
        data1.show();
    }
}

interface Data {
    void show();
}

class ProjectData extends Test implements Data {

    @Override
    public void show() {
        System.out.println("Showing data");
    }
}

class DataProxy implements Data{

    boolean admin = false;

    public DataProxy(String password){
        if(password == "123451"){
            admin = true;
        }
        else{
            System.out.println("Sorry,Try again.");
        }
    }

    @Override
    public void show() {
        if (admin){
            Data data = new ProjectData();
            data.show();
        }
    }
}
