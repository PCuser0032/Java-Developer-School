# Школа Java-разработки 2023 (Java-школа 15)

---

## Занятие 1. "Знакомство с Java" (18.12.2023)

### Домашнее задание №1

*Цель: познакомиться со статическими и нестатическими блоками, определить, как и в какой последовательности вызываются блоки и конструкторы базового класса и наследников.*

Задание

Написать абстрактный класс `Parent`, реализовать:

1. приватное поле `Name`;
2. статический блок, выводящий на экран `Parent:static 1`;
3. нестатический блок, выводящий на экран `Parent:instance 1`;
4. статический блок, выводящий на экран `Parent:static 2`;
5. конструктор без параметров, выводящий на экран `Parent:constructor`;
6. нестатический блок, выводящий на экран `Parent:instance 2`;
7. конструктор с параметром `Name`, выводящий на экран `Parent:name-constructor`.

Написать класс `Child`, расширяющий класс `Parent`, реализовать:

1. статический блок, выводящий на экран `Child:static 1`;
2. нестатический блок, выводящий на экран `Child:instance 1`;
3. статический блок, выводящий на экран `Child:static 2`;
4. конструктор без параметров, выводящий на экран `Child:constructor`;
5. конструктор с параметром `Name`, выводящий на экран `Child:name-constructor`;
6. нестатический блок, выводящий на экран `Child:instance 2`.

Создать два объекта: `Child()`, `Child("<Name>")`

---

**Консольный вывод:**

```console
  Child():
  Parent:static 1
  Parent:static 2
  Child:static 1
  Child:static 2
  Parent:instance 1
  Parent:instance 2
  Parent:constructor
  Child:instance 1
  Child:instance 2
  Child:constructor

  Child("Ivan"):
  Parent:instance 1
  Parent:instance 2
  Parent:constructor
  Child:instance 1
  Child:instance 2
  Child:name-constructor
```

---

### Список информационных источников

1. [What is the use of non-static block in java?](https://stackoverflow.com/questions/11869972/what-is-the-use-of-non-static-block-in-java) (StackOverflow)
2. [Static Initialization Blocks](https://stackoverflow.com/questions/2420389/static-initialization-blocks) (StackOverflow)
3. [Static block vs. initializer block in Java?](https://stackoverflow.com/questions/12550135/static-block-vs-initializer-block-in-java) (StackOverflow)
4. [Java static code block](https://stackoverflow.com/questions/13319604/java-static-code-block) (StackOverflow)
5. [On static and non-static initializing blocks in Java](https://stackoverflow.com/questions/1574914/on-static-and-non-static-initializing-blocks-in-java) (StackOverflow)
6. [Anonymous code blocks in Java](https://stackoverflow.com/questions/1563030/anonymous-code-blocks-in-java) (StackOverflow)
7. [Все о нестатических блоках инициализации в Java](https://habr.com/ru/companies/otus/articles/758478/) (Habr)
8. [5 скрытых cекретов в Java](https://habr.com/ru/articles/480544/) (Habr)
9. [Mastering Java’s Powerful Static Initializer Block](https://www.appsdeveloperblog.com/12-java-static-initializer-block/)
10. [Initializing Fields](https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html) (Java Tutorials)
11. [Static vs. Instance Initializer Block in Java](https://www.baeldung.com/java-static-instance-initializer-blocks)
12. [Блок инициализации](https://ru.wikipedia.org/wiki/%D0%91%D0%BB%D0%BE%D0%BA_%D0%B8%D0%BD%D0%B8%D1%86%D0%B8%D0%B0%D0%BB%D0%B8%D0%B7%D0%B0%D1%86%D0%B8%D0%B8) (Wikipedia)
13. [Static Blocks in Java](https://www.geeksforgeeks.org/static-blocks-in-java/) (GeeksforGeeks)
14. [Различия между статическими и нестатическими блоками инициализации в Java](https://sky.pro/media/razlichiya-mezhdu-staticheskimi-i-nestaticheskimi-blokami-iniczializaczii-v-java/) (SkyPro)

---

### Дополнительные источники

1. [Markdown Basic Syntax](https://www.markdownguide.org/basic-syntax/)
