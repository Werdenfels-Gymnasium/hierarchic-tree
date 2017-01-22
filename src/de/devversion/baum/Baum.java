package de.devversion.baum;

public final class Baum {

  private BaumElement wurzel;

  Baum(BaumElement wurzel) {
    this.wurzel = wurzel;
  }

  void insert(BaumElement parent, BaumElement key) {
    BaumElement target = this.wurzel.search(parent);

    target.insert(key);
  }

  void printPreOrder() {
    System.out.print("Pre Order:");
    this.wurzel.printPreOrder();
    System.out.println();
  }

  void printCount() {
    System.out.println("Anzahl Knoten: " + this.wurzel.countNodes());
  }

  void printLevels() {
    System.out.println("Anzahl Ebenen: " + this.wurzel.countLevels());
  }

}