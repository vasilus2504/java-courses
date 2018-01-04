package ru.lesson.lesson_13;

import javafx.scene.control.Cell;

/**
 * Descrie comportamentul tablei minerului
 *
 * @author Ticau Vasile
 * @since 04.01.2018
 */
public interface Board {
    /**
     * Deseneaza tabla reesind din masivul de celule
     * @param cells Masivul de celule
     */
    void drawBoard(Cell[][] cells);

    /**
     * Desenam celula
     * @param x pozitia pe orizontala
     * @param y pozitia pe verticala
     */
    void drawCell(int x, int y);

    /**
     * Desenam explozia bombelor
     */
    void drawBang();

    /**
     * Desenam felicitari cand se termina jocul
     */
    void drawCongratulate();
}
