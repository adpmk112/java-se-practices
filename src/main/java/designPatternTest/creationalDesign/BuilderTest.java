package designPatternTest.creationalDesign;

public class BuilderTest {
     String name,
            genre,
            artStyle,
            backGround;

    static class Builder{
         String name,
                genre,
                artStyle,
                backGround;

         Builder name(String name){
             this.name = name;
             return this;
         }

         Builder genre(String genre){
             this.genre = genre;
             return this;
         }

         Builder artStyle(String artStyle){
             this.artStyle = artStyle;
             return this;
         }

         Builder backGround(String backGround){
             this.backGround = backGround;
             return this;
         }

         BuilderTest build(){
             BuilderTest building = new BuilderTest(this);
             return building;
         }
    }

    private BuilderTest(Builder builder){
        this.name = builder.name;
        this.genre = builder.genre;
        this.artStyle = builder.artStyle;
        this.backGround = builder.backGround;
    }

    @Override
    public String toString() {
        return "BuilderTest{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", artStyle='" + artStyle + '\'' +
                ", backGround='" + backGround + '\'' +
                '}';
    }

    public static void main(String[] args) {
        BuilderTest builderTest = new BuilderTest.Builder()
                                  .name("Noragami")
                                  .genre("Super Natural Fantasy")
                                  .artStyle("Standard ArtStyle")
                                  .build();
        System.out.println(builderTest.toString());
    }
}
