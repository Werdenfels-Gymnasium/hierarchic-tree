package de.devversion.baum;

public class DatenKnoten extends BaumElement {

  /* Value of the node */
  private final String key;

  /* Can be replaced with an ArrayList to support X children. */
  private BaumElement[] kinder = new BaumElement[500];
  private int anzahlKinder = 0;

  /** Constructor for the Node class */
  DatenKnoten(final String key) {
    this.key = key;
  }

  /** Creates a new data node with the given value. */
  public void insert(final BaumElement node) {
    if (anzahlKinder >= this.kinder.length) {
      System.err.println("Error: Maximium amount of child nodes exceeded");
      return;
    }

    this.kinder[anzahlKinder++] = node;
  }

  /** Method to search for a given value in the current node and all children. */
  public BaumElement search(BaumElement node) {

    /* Breakpoint for search recursion. */
    if (node == this) {
      return this;
    }

    for (int i = 0; i < this.anzahlKinder; i++) {
      final BaumElement result = this.kinder[i].search(node);
      if (result != null) return result;
    }

    return null;
  }

  /** Prints all child nodes in in-order */
  public void printPreOrder() {
    System.out.print(" [");
    System.out.print(this.getValue());

    for (int i = 0; i < this.anzahlKinder; i++) {
      this.kinder[i].printPreOrder();
    }

    System.out.print("] ");
  }

  /** Returns the amount of child nodes. */
  public int countNodes() {
    int count = 1;

    for (int i = 0; i < this.anzahlKinder; i++) {
      count += this.kinder[i].countNodes();
    }

    return count;
  }

  /** Returns the amount of layers for this node. */
  public int countLevels() {
    int level = 0;

    for (int i = 0; i < this.anzahlKinder; i++) {
      int childLevel = this.kinder[i].countLevels();
      if (childLevel > level) level = childLevel;
    }

    return level + 1;
  }

  /** Returns the value of the node */
  public String getValue() {
    return this.key;
  }

}