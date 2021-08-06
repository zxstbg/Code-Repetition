package main.java.BGCS.util.Abstracts;

public abstract class Tables {

    public abstract void buildIndex();

    public abstract int[] query(int qNode, int kConstraint, int lConstraint);

}
