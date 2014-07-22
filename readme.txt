1.InheritanceType.TABLE_PER_CLASS
Usage of separate table for each entity subclass.
Superclass is a class, annotated with the @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) annotation and doesn't have a table in db. 
You should also add all inherited fields from the superclass to a table, mapped with the subclass. Advantages - you can select all superclass data, execute only one query to db through the UNION operator. For this action you should make the superclass non-abstract.   

2. ������������� ��������� ������ ��� ������� �������, ����������� union
� ������� ������� ����������� ��� ���� �� ������������� ������
������� �� ���������� ��������� - ����� ������� ����� ��� ������� ������������� ���� ����� union ������
����������� � ������������ ����� @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS). ������������ - ����� ������� ������� ���� ������ ������������� ������ ����� �������� ����� union, �� ��� ����� ����� ������� ����� �������������. 