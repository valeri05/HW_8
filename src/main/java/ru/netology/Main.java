package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

        post.name = "Петр";
        post.passport = "4444 № 444444";
        post.patronymic = "Петрович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Петров";
        post.subscription = Boolean.parseBoolean(String.valueOf(true));
    }
}