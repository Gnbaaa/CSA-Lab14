# Git Workflow Заавар

Энэ баримт бичиг нь төслийн Git workflow-ийг тайлбарлана.

## Салбарууд

### main
- Үндсэн салбар, production-ready код
- Branch protection дүрэм тохируулагдсан
- Зөвхөн PR-ээр нэгтгэх боломжтой

### develop
- Хөгжүүлэлтийн салбар
- Бүх feature салбарууд эндээс салбарлана
- CI процесс автоматаар ажиллана

### feature/*
- Онцлог хөгжүүлэлтийн салбарууд
- Жишээ: `feature/add-multiplication`, `feature/add-division`
- develop руу PR үүсгэнэ

### release/*
- Хувилбар гаргах салбарууд
- Жишээ: `release/v1.0.0`
- Tag үүсгэхэд ашиглана

### hotfix/*
- Яаралтай засварын салбарууд
- Жишээ: `hotfix/v1.0.1`
- main болон develop руу нэгтгэнэ

## Workflow Алхмууд

### 1. Feature Хөгжүүлэлт

```bash
# Develop салбараас feature салбар үүсгэх
git checkout develop
git pull origin develop
git checkout -b feature/add-multiplication

# Код бичих, тест нэмэх
# ...

# Коммит хийх
git add .
git commit -m "Үржүүлэх функц болон JUnit тест нэмсэн"

# Push хийх
git push origin feature/add-multiplication
```

### 2. Pull Request Үүсгэх

1. GitHub дээр feature салбараас develop руу PR үүсгэх
2. CI шалгалт автоматаар ажиллана
3. Checkstyle болон 100% coverage шалгагдана
4. Амжилттай бол merge хийх

### 3. Release Үүсгэх

```bash
# Release салбар үүсгэх
git checkout develop
git checkout -b release/v1.0.0

# Tag үүсгэх
git tag v1.0.0
git push origin v1.0.0
```

### 4. Hotfix Үүсгэх

```bash
# Main эсвэл release салбараас hotfix үүсгэх
git checkout main
git checkout -b hotfix/v1.0.1

# Засвар хийх
# ...

# Коммит хийх
git add .
git commit -m "Тэгээр хуваахыг зохицуулсан division засварласан"

# Tag үүсгэх
git tag v1.0.1
git push origin v1.0.1
git push origin hotfix/v1.0.1
```

## CI Шалгалтууд

Бүх PR-ууд дараах шалгалтуудыг дамжина:
- Checkstyle кодын загварын шалгалт
- JUnit тестүүд
- JaCoCo 100% branch coverage шалгалт

Шалгалт амжилтгүй бол merge хийх боломжгүй.

