package edu.liceo.daniel.motogp.model.enumerated;

public enum Posicion {

    UNO(1),
    DOS(2),
    TRES(3),
    CUATRO(4),
    CINCO(5),
    SEIS(6),
    SIETE(7),
    OCHO(8),
    NUEVE(9),
    DIEZ(10),
    ONCE(11),
    DOCE(12),
    TRECE(13),
    CATORCE(14),
    QUINCE(15),
    DIECISEIS(16),
    DIECISIETE(17),
    DIECIOCHO(18),
    DIECINUEVE(19),
    VEINTE(20),
    VEINTIUNO(21),
    VEINTIDOS(22),
    VEINTITRES(23);

    private final int value;

    Posicion(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
