# Repository Guide
How to Merge
```linux
git remote add -f DesignPatternNotes ../DesignPatternNotes
git merge -s ours --allow-unrelated-histories --no-commit DesignPatternNotes/master
git read-tree --prefix=DesignPatternNotes/ -u DesignPatternNotes/master
git commit -m "Merge B project as our subdirectory"
```


## Design Pattern Notes (2017.7.4 ~ 2017.7.7)
- Java 언어로 배우는 디자인 패턴 입문

### [Day1 shortcut](DesignPatterns/memo/day1.md)
### [Day2 shortcut](DesignPatterns/memo/day2.md)
### [Day3 shortcut](DesignPatterns/memo/day3.md)
### [Day4 shortcut](DesignPatterns/memo/day4.md)

## MongoDB Tutorials (2017.5.8)
- [mongoDB](MongoDB/mongo.md)

## Ionic2 Tutorials (2017.4.1)
- [Ionic2](Ionic2-tutorial/README.md)

## AngularJs2 Tutorials (2017.4.1)
- [AngularJs2](Angular2-tutorial/README.md)

## AngularJs Tutorials (2017.3.12 ~ 2017.3.19)
- [AngularJs](Angular1-tutorial/README.md)

## ReactJs Tutorials (2017.3.5)
- [ReactJs](React.js-Tutorial/README.md)

## Python, Ruby Tutorials (2017.2.5)
- [Python,Ruby](py_ruby_Tutorials/README.md)

## NodeJs Tutorials (2017.1.29 ~ 2017.2.27)
- [NodeJs](nodejsTutorials/README.md)

