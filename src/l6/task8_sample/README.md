# Компиляция и запуск из командной строки

Примеры команд - копия сеанса моего терминала linux. Для windows всё почти также.  

Перейти в директорию I2P22/src. 
Список директорий должен быть таким. (для windows команда dir)
```
~/IdeaProjects/I2P22/src$ ls
l1  l2  l3  l4  l5  l6
```
Создать директорию bin. (для скомпилированных классов)
```
~/IdeaProjects/I2P22/src$ mkdir bin
~/IdeaProjects/I2P22/src$ ls
bin  l1  l2  l3  l4  l5  l6
```
Компилируем все классы в директорииях logic и cmd.  
~/.jdks/openjdk-19/bin/javac - полный путь до программы javac. В вашем случае это может быть просто javac или javac.exe или также полный путь  
Опция -d bin показывает директорию куда нужно поместить скомпилированные классы.  
После этого можно перейти в bin, убедиться, что там появились файлы .class, но потом вернуться назад.
```
~/IdeaProjects/I2P22/src$ ~/.jdks/openjdk-19/bin/javac -d bin l6/task8_sample/logic/* l6/task8_sample/cmd/*
```
Запускаем скомпилированные классы с помощью программы java.  
Опция -classpath bin показыает в какой директории находятся классы (пакет)  
l6.task8_sample.cmd.Program - путь до класса в пакете который нужно запустить (функцию main в нём)
```
~/IdeaProjects/I2P22/src$ ~/.jdks/openjdk-19/bin/java -classpath bin l6.task8_sample.cmd.Program
Использование: java l6.task8_sample.cmd.Program INPUT OUTPUT
Увеличивает каждый элемент целочисленного массива из файла INPUT на 1. Результат записывается в файл OUTPUT.

Использование: java l6.task8_sample.cmd.Program INPUT OUTPUT
Увеличивает каждый элемент целочисленного массива из файла INPUT на 1. Результат записывается в файл OUTPUT.

Ошибка разбора аргументов коммандной строки
```
Программа запустилась успешно. 

Создаём файл in.txt в текущей директории и записываем туда двумерный массив любым удобным способом. (например через блокнот).  
(команда cat в linux печатает содержимое файла)
```
~/IdeaProjects/I2P22/src$ echo "1 2 3" >> in.txt
~/IdeaProjects/I2P22/src$ echo "4 5 99" >> in.txt
~/IdeaProjects/I2P22/src$ ls
bin  in.txt  l1  l2  l3  l4  l5  l6
~/IdeaProjects/I2P22/src$ cat in.txt
1 2 3
4 5 99
```
Запускаем еще раз, передавая после класса путь до файла откуда нужно считать массив и файла куда нужно записать массив (.т.к. файл в текущей директории, то просто название)
```
~/IdeaProjects/I2P22/src$ ~/.jdks/openjdk-19/bin/java -classpath ./bin l6.task8_sample.cmd.Program in.txt out.txt
```
Проверяем содержимое файла out.txt
```
~/IdeaProjects/I2P22/src$ ls
bin  in.txt  l1  l2  l3  l4  l5  l6  out.txt
~/IdeaProjects/I2P22/src$ cat out.txt 
2 3 4
5 6 100

```