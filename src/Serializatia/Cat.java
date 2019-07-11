package Serializatia;

import java.io.*;

public class Cat implements Externalizable, Serializable {
    public String name;
    public int age;
    public int weight;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}
