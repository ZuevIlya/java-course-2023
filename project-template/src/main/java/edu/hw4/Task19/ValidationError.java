package edu.hw4.Task19;


public record ValidationError(
    String name, // Название поля с ошибкой
    String description // Описание ошибки
) {
}
