Задание:

*Представьте, что вы работаете над разработкой простого приложения для записной книжки, которое позволяет пользователям добавлять, редактировать и удалять контакты.
Ваша задача - придумать как можно больше различных тестов (юнит-тесты, интеграционные тесты, сквозные тесты) для этого приложения. Напишите название каждого теста, его тип и краткое описание того, что этот тест проверяет.*



**Юнит-тесты:**
1. Проверка класса Contact на получение правильного значения из геттеров. (testContactGetField)
2. Проверка класса Notebook при добавлении в него объекта класса Contact.(testAddContactToNotebook)
3. Проверка класса Notebook при удалении из него объекта класса Contact. (testDropContactToNotebook)
4. Проверка класса Notebook на редактирование в нем объекта класса Contact.(testEditContactToNotebook)
5. Проверка класса Application на вызов нужного метода в объекте класса Notebook при добавлении объекта класса Contact. (testApplicationAddContact)
6. Проверка класса Application на вызов нужного метода в объекте класса Notebook при удалении объекта класса Contact. (testApplicationDropContact)
7. Проверка класса Application на вызов нужного метода в объекте класса Notebook при редактировании объекта класса Contact. (testApplicationEditContact)

**Интеграционные тесты**
1. Взаимодействия между классами Contact и Notebook. (testConnectionBetweenContactAndNotebook)
2. Взаимодействия между классами Application и Notebook. (testConnectionBetweenApplicationAndNotebook)

**Сквозные тесты**
1. Тест по отработке всех действий пользователя при работе с приложением. (testUserCreateNotebook)