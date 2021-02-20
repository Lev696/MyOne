package by.brest.mts.MyOne;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//@JsonSerialize
public class Human {

    private MtsSaler saler;
    private String name;
    private int age;
    private float weigth;
    private float weightIndex;

    {
        this.weigth = 1;
        saler = new MtsSaler();
    }

    public Human(String name, int age, float weigth) {
        this.name = name;
        this.age = age;
        this.weigth = weigth;
        this.weightIndex = weigth/age;
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

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }


}
