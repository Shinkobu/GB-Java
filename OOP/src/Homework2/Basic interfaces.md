# Интерфейс Comparable

1) добавить интерфейс 

public class Person implements Comparable<Person>

2) овверайд compareTO

   @Override
   public int compareTo(Person o) {
   return this.birthYear - o.birthYear;
   }

# Интерфейс Comparator
Если нет доступа к классу

Iterator<E>
Iterable<E>
Comparator<E>
Comparable<E>
Comparable, equals, ==
foreach для своих типов