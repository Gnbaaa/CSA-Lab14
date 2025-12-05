# Conflict Шийдвэрлэлт

## Conflict-ийн Дэлгэрэнгүй

`feature/add-multiply-validation`-ийг `develop` руу нэгтгэхэд
`src/main/java/lab14/sict/must/edu/mn/Multiplication.java` дээр merge conflict гарсан. Conflict нь
`multiply` функцын Javadoc коммент дээр байсан.

## Шийдвэрлэлтийн Алхмууд

1. Онцлогын салбарт `git merge develop` ажиллуулсан.

2. `Multiplication.java` дээрх conflict-ийг тодорхойлсон.

3. Файлыг засварлаж, хоёр салбарын Javadoc комментийг нэгтгэсэн.

4. `git add src/main/java/lab14/sict/must/edu/mn/Multiplication.java` ажиллуулсан.

5. `git commit` ажиллуулж merge-ийг дуусгасан.

6. Салбарыг push хийж, PR үүсгэсэн.

## Хэрэглэсэн Git Командууд

```bash
# Develop салбарыг онцлогын салбарт нэгтгэх
git checkout feature/add-multiply-validation
git merge develop

# Conflict-ийг засварласны дараа
git add src/main/java/lab14/sict/must/edu/mn/Multiplication.java
git commit -m "Merge conflict шийдвэрлэсэн: Multiplication.java дээрх Javadoc нэгтгэсэн"

# Push хийх
git push origin feature/add-multiply-validation
```

## Шийдвэрлэсэн Өөрчлөлт

Conflict-ийг шийдсэний дараа `Multiplication.java` файл нь хоёр салбарын хамгийн сайн хэсгүүдийг агуулсан болсон.
Javadoc коммент нь хоёр салбарын мэдээллийг нэгтгэсэн хувилбар болсон.

