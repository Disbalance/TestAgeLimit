# TestAgeLimit
Данная программа позволяет определить возрастное ограничение информационного продукта с помощью вопросов, на которые должен
ответить пользователь.

/-----------------------------------------------------------------------------------------------------------/

Компиляция Windows:

1. Установить пакет JDK(Java Development Kit)
Ссылка на  скачивание: http://www.oracle.com/technetwork/java/javase/downloads/index.html
Указать папку C:\Program Files\Java\jdk*-*-*\bin в Имя переменной PATH в параметрах среды
(подробнее тут http://poleshuk.ru/oshibka-javac-ne-yavlyaetsya-vnutrennej-ili-vneshnej-komandoj/)

2. Скачать репозиторий в виде архива и распаковать в любую папку.

3. Создать папку testagelimit на диске.

4. Скопировать в созданную ранее папку testagelimit папку src и создать папку bin

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

/--------------------------------------------------------------------------------/

Компиляция для Ubuntu:

1. Установить JDK(Java Development Kit) с помощью команды в терминале: sudo apt-get install openjdk-7-jdk
Возможен запрос пароля пользователя из-за команды sudo.

2. Скачать репозиторий в виде архива и распаковать в любую папку

3. Создать папку testagelimit в папке home/имя_пользователя

4. Скопировать в папку /home/имя_пользователя/testagelimit папку src и 2 файла "test.al" и "question.al" и создать папку bin

5. Открыть терминал, перейти в папку /home/имя_пользователя/testagelimit 

6. Запустить компиляцию с помощью команды: 
javac -sourcepath /home/имя_пользователя/testagelimit/src -d /home/имя_пользователя/testagelimit/bin /home/имя_пользователя/testagelimit/src/testagelimit/MainForm.java -encoding UTF-8

7. Скопировать папку source, находящуюся в /home/имя_пользователя/testagelimit/src/testagelimit в папку /home/имя_пользователя/testagelimit/bin

8. Создать файл manifest.mf с помощью команды в терминале:
echo main-class: testagelimit.MainForm>manifest.mf

9. Собрать jar-файл с помощью команды в терминале:
jar -cmf manifest.mf  TestAgeLimit.jar -C /home/имя_пользователя/testagelimit/bin/ .
Не забываем в конце поставить точку.

10. После выполненныйх действий в папке появится файл TestAgeLimit.jar

/--------------------------------------------------------------------------------------------------/

Запуск файла jar:

1. Запускаем консоль

2. Переходим в папку, в которой лежит наш jar файл

3. Запускаем с помощью команды:
java -jar TestAgeLimit.jar

4. Для запуска тестов используется агрумент test:
java -jar TestAgeLimit.jar test

!!! Для корректной работы программы во время тестирования, необходимо, чтобы файл "test.al" распологалсяв одной директории, что и TestAgeLimit.jar!!!

/--------------------------------------------------------------------------------/

Работа с программой.
После запуска программы, нажимаем кнопку "Начать", нас попросят выбрать файл с вопросами questions.al, выбираем данный файл.
Получаем уведомление, в котором указано, что после ответа на вопросы для завершения теста нужно нажать клавишу F2 или выбрать в пункте меню "File->Завершить". Соглашаемся с уведомлением и отвечаем на вопросы. После ответа нажимаем F2 или выбираем пункт меню "File->Завершить" и получаем окно с рекомендуемым возрастным ограничением, согласно нашим ответам.


/----------------------------------------------------------------------------------/

Файлы Javadoc находятся в папке Realease->Javadoc
