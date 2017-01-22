package de.devversion.baum;

public abstract class BaumElement {

    public abstract void printPreOrder();
    public abstract void insert(BaumElement node);
    public abstract int countNodes();
    public abstract int countLevels();
    public abstract String getValue();
    public abstract BaumElement search(BaumElement node);

}