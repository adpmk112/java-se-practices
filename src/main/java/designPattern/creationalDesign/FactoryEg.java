package designPattern.creationalDesign;

public class FactoryEg {
     public static void main(String[] args) {
        BeerFactory beerFactory = new HeinekenBeerFactory();
        beerFactory.getBeer().showOrginCountry();
}
}

interface Beer
{
    void showOrginCountry();
}

class TigerBeer implements Beer
{

    @Override
    public void showOrginCountry() {
        System.out.println("Singapore");
    }

}

class TuborgBeer implements Beer
{

    @Override
    public void showOrginCountry() {
        System.out.println("Denmark");
    }

}

class HeinekenBeer implements Beer
{
    @Override
    public void showOrginCountry(){
        System.out.println("Netherland");
    }
}

abstract class BeerFactory
{
    abstract Beer getBeer();
}

class TigerBeerFactory extends BeerFactory
{

    @Override
    Beer getBeer() {
        return new TigerBeer();
    }
    
}

class TuborgBeerFactory extends BeerFactory
{

    @Override
    Beer getBeer() {
        return new TuborgBeer();
    }

}

class HeinekenBeerFactory extends BeerFactory
{
    @Override
    Beer getBeer(){
        return new HeinekenBeer();
    }
}

