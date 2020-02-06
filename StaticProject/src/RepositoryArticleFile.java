import java.util.List;

public class RepositoryArticleFile implements RepositoryItems {

    // implementiert eine Klasse ein Interface, so verpflichtet sie sich dazu, dass sie alle Methoden ausprogrammiert
    // WICHTIG: es können beliebig viele weitere Members (Felder, Methoden) vorhanden sein


    @Override
    public boolean Insert(Item item) {
        System.out.println("Artikel wurde in DB Abgespeichert -FILE");
        return false;
    }

    @Override
    public boolean Remove(int primaryKey) {
        System.out.println("Artikel wurde aus DB gelöscht -FILE");
        return false;
    }

    @Override
    public boolean Update(int primaryKey, Item newItemData) {
        System.out.println("Artikel wurde in DB geändert -FILE");
        return false;
    }

    @Override
    public List<Item> SearchByName(String name) {
        System.out.println("Artikelliste aus DB - NAME -FILE");
        return null;
    }

    @Override
    public List<Item> SearchByCategory(String category) {
        System.out.println("Artikelliste aus DB - Kategorie -FILE");
        return null;
    }

    @Override
    public Item SearchByPrimaryKey(int primaryKey) {
        System.out.println("Artikelliste aus DB - PK -FILE");
        return null;
    }
}