package homework10;

public interface TestInterface {
    //можно использовать переменные без создания экземпляра так как они константы
    int a = 5;// могжно унаследовать два интерфейсаЮ где будут две одинаковые переменные, и не будет ошибок
    int b = 6;

    //можно обьявить только метод без теда, но если использовать default можно и с телом
    void Hello();
    default void  HelloWorld() {
        System.out.println("Hellow World");
    }


}
