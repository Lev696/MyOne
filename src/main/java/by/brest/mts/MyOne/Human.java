package by.brest.mts.MyOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Human {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Integer id;

    private String name;
    private int age;
    private float weight;
    private float weightIndex;

    {
        this.weight = 1;
    }

    public Human() {
    }

    public Human(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.weightIndex = weight/age;
    }

    @Override
    public String toString() {
        return "Human{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", weightIndex=" + weightIndex +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) this.age = 1;
        else if (age > 100) this.age = 99;
        this.age = age;
    }

    public float getWeightIndex() {
        return weightIndex;
    }

    public void setWeightIndex(float weightIndex) {
        this.weightIndex = weightIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getweight() {
        return weight;
    }

    public void setweight(float weight) {
        this.weight = weight;
    }
}

