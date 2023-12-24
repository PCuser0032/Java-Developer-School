# Школа Java-разработки 2023 (Java-школа 15)

---

## Занятие 2. "Коллекции в Java" (21.12.2023)

### Домашнее задание №2

*Цель: познакомиться с коллекциями, изучить принципы работы с коллекции и механизмы их работы.*

---

**Задание 1.**

Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаются). Посчитать, сколько раз встречается каждое слово.

---

**Массив слов `words`:**

```code
  // guide: 1, magic: 2, emotion: 1, goal: 4, surface: 1,
  // coffee: 2, mirror: 1, question: 1, window: 1, book: 1,
  // house: 1, volt: 1, community: 1, yellow: 1, music: 1
  String[] words = {
                "guide", "magic", "emotion", "goal",
                "surface", "coffee", "goal", "mirror",
                "question", "magic", "window", "goal",
                "book", "house", "coffee", "volt",
                "goal", "community", "yellow", "music"
        }; 
```

**Консольный вывод:**

```console
  Unique words: [guide, emotion, surface, mirror, question, window, book, house, volt, community, yellow, music]

  Words count:
  magic: 2
  mirror: 1
  goal: 4
  surface: 1
  question: 1
  book: 1
  yellow: 1
  community: 1
  house: 1
  emotion: 1
  music: 1
  volt: 1
  coffee: 2
  window: 1
  guide: 1
```

---

**Задание 2.**

Написать простой класс `"ТелефонныйСправочник"`, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с помощью метода `add()` можно добавлять записи. С помощью метода `get()` можно искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.

---

Добавление телефонных номеров в справочник `Phonebook` с помощью метода `add()`:

```code
  phonebook.add("Avdeev", "+7 000 000-00-01");
  phonebook.add("Borisov", "+7 000 000-00-02");
  phonebook.add("Gladkov", "+7 000 000-00-03");
  phonebook.add("Debrov", "+7 000 000-00-04");
  phonebook.add("Eremeev", "+7 000 000-00-05");
  phonebook.add("Avdeev", "+7 000 000-00-06");
  phonebook.add("Debrov", "+7 000 000-00-07");
  phonebook.add("Avdeev", "+7 000 000-00-08");
  phonebook.add("Zheglov", "+7 000 000-00-09");
  phonebook.add("Borisov", "+7 000 000-00-10");
  phonebook.add("Avdeev", "+7 000 000-00-11");
  phonebook.add("Zheglov", "+7 000 000-00-12");
  phonebook.add("Debrov", "+7 000 000-00-13");
  phonebook.add("Zaitsev", "+7 000 000-00-14");
```

**Консольный вывод:**

```console
  Avdeev: [+7 000 000-00-01, +7 000 000-00-06, +7 000 000-00-08, +7 000 000-00-11]
  Borisov: [+7 000 000-00-02, +7 000 000-00-10]
  Gladkov: [+7 000 000-00-03]
  Debrov: [+7 000 000-00-04, +7 000 000-00-07, +7 000 000-00-13]
  Eremeev: [+7 000 000-00-05]
  Zheglov: [+7 000 000-00-09, +7 000 000-00-12]
  Zaitsev: [+7 000 000-00-14]
```

---

### Список информационных источников

Массивы:
1. [Исчерпывающее руководство по одномерным массивам в Java](https://habr.com/ru/articles/753638/) (Habr)
2. [Class Arrays](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Arrays.html) (Java Documentation)
3. [Arrays in Java: A Reference Guide](https://www.baeldung.com/java-arrays-guide) (Baeldung)
4. [How to Create an Array in Java – Array Declaration Example](https://www.freecodecamp.org/news/how-to-create-an-array-in-java/) (freeCodeCamp)
5. [Creating Arrays in Your Programs](https://dev.java/learn/language-basics/arrays/) (Dev Java)

Коллекции:
1. [Collections](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Collections.html) (Oracle)
2. [Java Collection Framework: Полное руководство для разработчиков](https://struchkov.dev/blog/ru/java-collection-framework/)
3. [Collections in Java](https://www.geeksforgeeks.org/collections-in-java-2/) (GeeksforGeeks)
4. [Java Collections](https://www.baeldung.com/java-collections) (Baeldung)
5. [Java collections framework](https://en.wikipedia.org/wiki/Java_collections_framework) (Wikipedia)
6. [Справочник по Java Collections Framework](https://habr.com/ru/articles/237043/) (Habr)

---

### Дополнительные источники

1. [Markdown Basic Syntax](https://www.markdownguide.org/basic-syntax/)
2. [Транслитерация фамилий](https://transliteraciya.ru/familii/)
3. [Hyperskill Tracks](https://hyperskill.org/tracks)
