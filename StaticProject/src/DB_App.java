public class DB_App{
    //wichitg: Interface als Instanzentyp verwendet
    //  hinter new wird die benötigte Klasse verwendet
    static RepositoryItem dbArticles = new RepositoryItemsDB();
    public static void main(String[] args) {


        dbArticles.Insert(new Article());
        dbArticles.SearchByCategory("Laptop");
        //usw. - Beliebig viele methoden im HP verwenden
    }

}