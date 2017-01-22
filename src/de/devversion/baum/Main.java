package de.devversion.baum;

public class Main {

  public static void main(final String[] args) {

    /* Ebene 0 (Wurzel) */
    final BaumElement schuermer = new DatenKnoten("Schürmer");

    /* Ebene 1 (Lehrer) */
    final BaumElement schmitt = new DatenKnoten("Schmitt");
    final BaumElement hirsch = new DatenKnoten("Hirsch");
    final BaumElement baur = new DatenKnoten("Baur");

    /* Ebene 2 (Schüler) */
    final BaumElement gschwendtner = new DatenKnoten("Gschwendtner");
    final BaumElement schmid = new DatenKnoten("Schmid");
    final BaumElement thiel = new DatenKnoten("Thiel");

    /* Erstelle Baum */
    Baum baum = new Baum(schuermer);

    /* Lehrer hinzufügen */
    baum.insert(schuermer, schmitt);
    baum.insert(schuermer, hirsch);
    baum.insert(schuermer, baur);

    /* Schüler Hinzufügen */
    baum.insert(schmitt, gschwendtner);
    baum.insert(baur, schmid);
    baum.insert(hirsch, thiel);

    /* Ausgaben durchführen */
    baum.printPreOrder();
    baum.printCount();
    baum.printLevels();
  }

}
