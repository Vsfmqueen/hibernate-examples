1.InheritanceType.TABLE_PER_CLASS
Usage of separate table for each entity subclass.
Superclass is a class, annotated with the @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) annotation and doesn't have a table in db. 
You should also add all inherited fields from the superclass to a table, mapped with the subclass. Advantages - you can select all superclass data, execute only one query to db through the UNION operator. For this action you should make the superclass non-abstract.   

2. Использование отдельных таблиц для каждого потомка, связываются union
В таблицу потомка добавляются все поля из родительского класса
Отличие от предыдущей стратегии - можно выбрать сразу все объекты родительского типа через union таблиц
Добавляется в родительский класс @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS). Преимущества - можно сделать выборку всех данных родительского класса одним запросом через union, но для этого нужно сделать класс неабстрактным. 