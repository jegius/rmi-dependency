# bookstatistics-shared

`bookstatistics-shared` — это проект, предоставляющий общие интерфейсы и DTO для проекта BookStatistics. Проект включает в себя RMI интерфейсы и DTO классы для работы с книгами.

## Содержание

- [Описание](#описание)
- [Установка](#установка)
- [Использование](#использование)
- [Публикация через JitPack](#публикация-через-jitpack)
  - [Шаг 1: Подготовьте проект](#шаг-1-подготовьте-проект)
  - [Шаг 2: Создайте файл GitHub репозитория](#шаг-2-создайте-файл-github-репозитория)
  - [Шаг 3: Сборка и публикация проекта](#шаг-3-сборка-и-публикация-проекта)
- [Примеры кода](#примеры-кода)
  - [BookRMI](#bookrmi)
  - [BookRemoteService](#bookremoteservice)

## Описание

Этот проект содержит интерфейсы и объекты передачи данных (DTO) для взаимодействия с библиотекой книг через RMI.

## Установка

Для установки и настройки проекта выполните следующие шаги:

1. Клонируйте репозиторий:
   ```bash
   git clone https://github.com/Ваша_организация/Ваш_репозиторий.git
   cd Ваш_репозиторий
   ```

2. Убедитесь, что у вас установлена Java 17 и Maven.

3. Соберите проект:
   ```bash
   mvn clean install
   ```

## Использование

Вы можете использовать сгенерированные DTO и интерфейсы в других проектах, чтобы взаимодействовать с сервером RMI.

### Примеры кода

#### BookRMI

```java
package com.edu.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class BookRMI implements Serializable {

    private Long id;
    private String title;
    private String author;
    private int totalPages;
    private String coverImage;
}
```

#### BookRemoteService

```java
package com.edu.rmi;

import com.edu.dto.BookRMI;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface BookRemoteService extends Remote {
    BookRMI addBook(BookRMI book) throws RemoteException;
    BookRMI updateBook(BookRMI book) throws RemoteException;
    void deleteBook(Long id) throws RemoteException;
    List<BookRMI> getAllBooks(int page, int size) throws RemoteException;
    BookRMI getBook(Long id) throws RemoteException;
}
```

## Публикация через JitPack

Для публикации вашего проекта с использованием [JitPack](https://jitpack.io/), выполните следующие шаги:

### Шаг 1: Подготовьте проект

Убедитесь, что ваш проект готов к публикации:
- Убедитесь, что файл `pom.xml` корректно настроен.
- Убедитесь, что проект успешно собирается с помощью Maven.

### Шаг 2: Создайте файл GitHub репозитория

Запушьте ваш проект на GitHub:
1. Создайте новый репозиторий на GitHub.
2. Запушьте ваш локальный репозиторий на GitHub:
   ```bash
   git init
   git remote add origin https://github.com/Ваш_пользователь/Ваш_репозиторий.git
   git add .
   git commit -m "Initial commit"
   git push -u origin master
   ```

### Шаг 3: Сборка и публикация проекта

1. Перейдите на [JitPack.io](https://jitpack.io/).
2. Вставьте URL вашего GitHub репозитория в поле поиска и нажмите "Lookup".
3. Выберите версию для сборки (например, тег или ветку) и нажмите "Get it".
4. JitPack создаст и опубликует вашу библиотеку, предоставив вам инструкции по добавлению зависимости в ваш проект.

Добавьте следующую зависимость в `pom.xml` вашего проекта:

```xml
<dependency>
    <groupId>com.github.Ваш_пользователь</groupId>
    <artifactId>Ваш_репозиторий</artifactId>
    <version>Текущая_версия</version>
</dependency>
```

## Пример Maven конфигурации

`pom.xml` этого проекта выглядит следующим образом:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://www.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.edu.bookstatistics</groupId>
    <artifactId>bookstatistics-shared</artifactId>
    <version>1.0-SNAPSHOT</version>
    <dependencies>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.30</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>
</project>
```

---

Для получения актуальной информации об использовании JitPack посетите [официальную документацию JitPack](https://jitpack.io/docs/).

