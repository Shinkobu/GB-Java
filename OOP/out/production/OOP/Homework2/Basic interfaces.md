# ��������� Comparable

1) �������� ��������� 

public class Person implements Comparable<Person>

2) �������� compareTO

   @Override
   public int compareTo(Person o) {
   return this.birthYear - o.birthYear;
   }

# ��������� Comparator
���� ��� ������� � ������

Iterator<E>
Iterable<E>
Comparator<E>
Comparable<E>
Comparable, equals, ==
foreach ��� ����� �����