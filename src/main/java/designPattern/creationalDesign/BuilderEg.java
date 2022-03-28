package designPattern.creationalDesign;

public class BuilderEg
{
    String name;
    String born;
    String birthPlace;
    String height;
    String bloodType;
    String instagram;

static class Builder
{
    String name;
    String born;
    String birthPlace;
    String height;
    String bloodType;
    String instagram;

    Builder name(String iname)
    {
        this.name = iname;
        return this;
    }

    Builder born(String born)
    {
        this.born = born;
        return this;
    }

    Builder birthPlace(String birthPlace)
    {
        this.birthPlace = birthPlace;
        return this;
    }

    Builder height(String height)
    {
        this.height = height;
        return this;
    }

    Builder bloodType(String bloodType)
    {
        this.bloodType = bloodType;
        return this;
    }

    Builder instagram(String instagram)
    {
        this.instagram = instagram;
        return this;
    }

    BuilderEg build()
    {
        BuilderEg test = new BuilderEg(this);
        return test;
    }
}

private BuilderEg(Builder builder)
{
    this.name = builder.name;
    this.born = builder.born;
    this.birthPlace = builder.birthPlace;
    this.height = builder.height;
    this.bloodType = builder.bloodType;
    this.instagram = builder.instagram;
}

@Override
public String toString() {
    return "Test [name="+ name +", birthPlace=" + birthPlace + ", bloodType=" + bloodType + ", born=" + born + ", height=" + height
            + ", instagram=" + instagram + "]";
}

public static void main(String[] args) {
    BuilderEg builderEg = new BuilderEg.Builder()
                        .name("Yuki Yoda")
                        .born("May5,2000")
                        .birthPlace("Japan")
                        .bloodType("O")
                        .height("152cm")
                        .instagram("gentoshayoda")
                        .build();
    System.out.println(builderEg);
                         
}
}

