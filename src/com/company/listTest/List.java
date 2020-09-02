package com.company.listTest;

interface List<T> {

    /**
     * EN: Checks if list is empty.
     * PL: Sprawdza czy lista jest pusta.
     *
     * @return true if empty (true jeśli pusta)
     */
    boolean isEmpty();

    /**
     * EN: Returns size of the list.
     * PL: Zwraca rozmiar listy.
     *
     * @return size of the list (rozmiar listy)
     */
    int size();

    /**
     * EN: Prepends element to the list.
     * PL: Dodaje element z przodu listy.
     *
     * @param data to be added to list (data - dane które mają zostać dodane do listy)
     */
    void prepend(T data);

    /**
     * EN: Appends element to the list.
     * PL: Dodaje element na końcu listy.
     *
     * @param data to be added to list (data - dane które mają zostać dodane do listy)
     */
    void append(T data);

    /**
     * EN: Inserts new element at given position in the list.
     * PL: Wstawia nowy element na wskazanej pozycji w liście.
     *
     * @param data to be added to list (data - dane które mają zostać dodane do listy)
     * @param position where data should be inserted (position - pozycja na której dane mają zostać dodane)
     * @return true if successfully inserted (prawda jeśli udało się wstawić)
     */
    boolean insert(T data, int position);

    /**
     * EN: Removes item from the list at given position.
     * PL: Usuwa element z listy na wskazanej pozycji.
     *
     * @param position position where data should be removed (position - pozycja na której dane mają zostać usunięte)
     */
    void remove(int position);

    /**
     * EN: Returns element from the list at given position.
     * PL: Zwraca element z listy na danej pozycji.
     * @param position position of the element to be returned (position - pozycja elementu który ma zostać zwrócony)
     *
     * @return element of the list (element listy)
     */
    T get(int position);

    /**
     * EN: Sets new value of element at given position.
     * PL: Ustawia nową wartość elementu na danej pozycji.
     *
     * @param data new value (nowa wartość)
     * @param position of element to change (pozycja elementu do zmiany)
     */
    void set(T data, int position);
}

