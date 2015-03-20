# TestAgeLimit
Данная программа позволяет определить возрастное ограничение информационного продукта с помощью вопросов, на которые должен
ответить пользователь.

Компиляция Windows:

1. Установить пакет JDK(Java Development Kit)
Ссылка на  скачивание: http://www.oracle.com/technetwork/java/javase/downloads/index.html

2. Скачать папку Release, в которой содержится Javadoc и src.

3. Создать папку testagelimit на диске.

4. Скопировать в созданную ранее папку src и создать папку bin


5. Запустить консоль и перейти в папку testagelimit

6. Выполнить команду компиляции:
javac -sourcepath X:\testagelimit\src\ -d X:\testagelimit\bin\	X:\testagelimit\src\testagelimit\MainForm.java -encoding UTF-8

где
1) X:\testagelimit\src - путь до папки src;
2) X:\testagelimit\bin - путь до папки bin
3) X:\testagelimit\src\testagelimit\MainForm.java - путь до главной формы
X - буква вашего раздела;

7. После компиляции, копируем папку src/source в папку bin/testagelimit

8. Cоздаем с помощью команды manifest.mf:
echo main-class: testagelimit.MainForm>manifest.mf

9. Собираем jar файл командой:
jar -cmf manifest.mf TestAgeLimit.jar  -C X:\testagelimit\bin .
где
X:\testagelimit\bin - путь к папке, в которой лежат наши файлы .class и папка source.
Не забываем точку в конце команды.

10. После чего у нас в папке testagelimit появится файл TestAgeLimit.jar

Запуск файла jar:

1. Запускаем консоль

2. Переходим в папку, в которой лежит наш jar файл

3. Запускаем с помощью команды:
java -jar TestAgeLimit.jar

4. Для запуска тестов используется агрумент test:
java -jar TestAgeLimit.jar test

!!! Для корректной работы программы во время тестирования, необходимо, чтобы файл "test.al" распологалсяв одной директории, что и TestAgeLimit.jar!!!

