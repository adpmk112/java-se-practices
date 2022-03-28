package designPatternTest.structuralDesign;

public class DecoratorTest{
    public static void main(String[] args) {
        File file = new JavaDecorator(new MyFile());
        String name = file.show("HelloWorld");
        System.out.println(name);

        File file2 = new textDecorator(new MyFile());
        String name2 = file2.show("DesignPatternNote");
        System.out.println(name2);
    }
}

interface File{
    String show(String name);
}

class MyFile implements File{

    @Override
    public String show(String name) {
        return name;
    }
}

class JavaDecorator implements File{

    File file;

    public JavaDecorator(File file){
        this.file = file;
    }

    @Override
    public String show(String name) {
        return file.show(name) + ".java";
    }
}

class textDecorator implements File{

    File file;

    public textDecorator(File file){
        this.file = file;
    }

    @Override
    public String show(String name) {
        return file.show(name) + ".txt";
    }
}