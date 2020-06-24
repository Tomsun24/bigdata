package com.bigdata.bean;


import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class JoinBean implements Writable {
    private  int id;
    private  int age;
    private  String name;
    private  double score;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public JoinBean() {
    }

    public JoinBean(int id, int age, String name, double score) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.score = score;
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(id);
        dataOutput.writeInt(age);
        dataOutput.writeUTF(name);
        dataOutput.writeDouble(score);

    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
        id=dataInput.readInt();
        age=dataInput.readInt();
        name=dataInput.readUTF();
        score=dataInput.readDouble();
    }
}
