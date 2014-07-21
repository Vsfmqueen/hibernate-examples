1.Usage of separate table for each entity subclass
Superclass is an abstract class, annotated with the @MappedSuperclass annotation
If you want to change a mapping of certain column, you should use annotation
@AttribureOverride (name = "login", column = @Column(name = "username")) with subclass, where "name" attribute is name of a superclass field you want to change.
You should also add all inherited fields from the superclass to a table, mapped with the subclass. 

1. ������������� ��������� ������ ��� ������� �������
������ - ����������� ����� @MappedSuperclass
���� ����� �������� �������� �������:
������� - @AttribureOverride (name = "login", column = @Column(name = "username"))
� ������� ������� ����������� ��� ���� �� ������������� ������