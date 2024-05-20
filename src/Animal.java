public class Animal {
    private String type;
    private String color;
    private Integer numberOfLegs;
    private Integer age;
    private Integer weight;
    private Integer height;

    public Animal(String type, String color, Integer numberOfLegs, Integer age, Integer weight, Integer height) {
        this.type = type;
        this.color = color;
        this.numberOfLegs = numberOfLegs;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
