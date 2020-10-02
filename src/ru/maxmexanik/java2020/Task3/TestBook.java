package ru.maxmexanik.java2020.Task3;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Оскар Уайльд", "Портрет Дориана Грея", 1890, "Философский роман", 1974);

        System.out.println("Книга до внесения изменений: ");
        System.out.println(book);

        book.SetAuthor("Эрих Мария Ремарк");
        book.SetTitle("Три товарища");
        book.SetYear(1936);
        book.SetGenre("Военная проза");
        book.SetPages(578);

        System.out.println();
        System.out.println("Книга после внесения изменений:");
        System.out.println(book);
    }
}
