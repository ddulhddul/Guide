## React-Native Notes (2017.8.3 ~ 2017.8.5)
- [react-native](rnTest/README.md)

## Design Pattern Notes (2017.7.4 ~ 2017.7.7)
- Java 언어로 배우는 디자인 패턴 입문

### [Day1 shortcut](DesignPatternNotes/memo/day1.md)
### [Day2 shortcut](DesignPatternNotes/memo/day2.md)
### [Day3 shortcut](DesignPatternNotes/memo/day3.md)
### [Day4 shortcut](DesignPatternNotes/memo/day4.md)

## MongoDB Tutorials (2017.5.8)
- [mongoDB](MongoDB/mongo.md)

## Ionic2 Tutorials (2017.4.1)
- [Ionic2](Ionic2-tutorial/README.md)

## AngularJs2 Tutorials (2017.4.1)
- [AngularJs2](Angular2-tutorial/README.md)

## AngularJs Tutorials (2017.3.12 ~ 2017.3.19)
- [AngularJs](Angular1-tutorial/README.md)

## ReactJs Tutorials (2017.3.5) // Deleted
- [ReactJs](React.js-Tutorial/README.md)

## Python, Ruby Tutorials (2017.2.5) // Deleted
- [Python,Ruby](py_ruby_Tutorials/README.md)
- [생활코딩 Python Ruby](https://opentutorials.org/course/1750)

## NodeJs Tutorials (2017.1.29 ~ 2017.2.27) // Deleted
- [NodeJs](nodejsTutorials/README.md)
- [생활코딩 NodeJs](https://opentutorials.org/course/2136)


---
---

# Repository Guide
- How to Merge
```linux
git remote add -f DesignPatternNotes ../DesignPatternNotes
git merge -s ours --allow-unrelated-histories --no-commit DesignPatternNotes/master
git read-tree --prefix=DesignPatternNotes/ -u DesignPatternNotes/master
git commit -m "Merge B project as our subdirectory"
```
