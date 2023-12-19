package homework9_2;

public class Book {
    private String title = "Harry Potter";
    private class Description {
        private  final String DESCRIPTION= "Про мир волшебства магов, маглов и полную аваду кедавру";
        public void printDescription() {
            System.out.println(
                    "Название книги - " + title + "\n" +
                            "Описание книги - " + DESCRIPTION);
        }
    }
    public void printBook () {
        Description harry = new Description();
        harry.printDescription();
    }
}
