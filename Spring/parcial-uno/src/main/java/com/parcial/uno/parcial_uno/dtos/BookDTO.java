package com.parcial.uno.parcial_uno.dtos;

public class BookDTO {
    private String bookId;
    private String isbn;
    private String name;
    private Boolean available;
    private Integer amount;

    public BookDTO(String bookId, String isbn, String name, Integer amount, Boolean available) {
        this.bookId = bookId;
        this.isbn = isbn;
        this.name = name;
        this.amount = amount;
        this.available = available;

    }

    public BookDTO() {
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BookDTO [bookId=" + bookId + ", isbn=" + isbn + ", name=" + name + ", available=" + available
                + ", amount=" + amount + "]";
    }

    
}
