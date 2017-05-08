# Mongoose
[https://velopert.com/594](https://velopert.com/594)

## 소개
- Mongoose는 MongoDB 기반 ODM(Object Data Mapping) Node.JS 전용 라이브러리

# MongoDb
[https://velopert.com/mongodb-tutorial-list](https://velopert.com/mongodb-tutorial-list)

## 1. 소개, 설치 및 데이터 모델링
### 소개
- C++로 작성된 오픈소스 문서지향(Document-Oriented) 적 Cross-platform 데이터베이스
- 현존하는 NoSQL 데이터베이스 중 인지도 1위

### NoSQL?
- 기존의 RDBMS의 한계를 극복하기 위해 만들어진 새로운 형태의 데이터저장소
- 관계형 DB가 아니므로, RDMS처럼 고정된 스키마 및 JOIN 이 존재하지 않는다.

### Document
- Document는 RDMS의 record 와 비슷한 개념인데요, 이의 데이터 구조는 한개이상의 key-value pair 으로 이뤄져있습니다
```js
{
    "_id": ObjectId("5099803df3f4948bd2f98391"),
    "username": "velopert",
    "name": { first: "M.J.", last: "Kim" }
}
```
- _id 는 12bytes의 hexadecimal 값으로서, 각 document의 유일함(uniqueness)을 제공
- 첫 4bytes 는현재 timestamp, 다음 3bytes는 machine id, 다음 2bytes는 MongoDB 서버의 프로세스id, 마지막 3bytes는 순차번호
- Document는 동적(dynamic)의 schema 를 갖고있음. 같은 Collection 안에 있는 Document 끼리 다른 schema 를 갖고 있을 수 있다.

### MongoDB설치
[https://www.mongodb.com/download-center?jmp=homepage#community](https://www.mongodb.com/download-center?jmp=homepage#community)

- C:\Program Files\MongoDB\Server\3.2\bin\ 에 설치됨
- CMD 창을 열어서 디렉토리로 들어가 mongod 를 실행하면 서버가 실행.
- 기본 데이터베이스 디렉토리가 C:\data\db 이므로 실행 전에 폴더를 수동으로 만들어 줘야 함
- 데이터베이스 디렉토리를 변경하고싶다면
```linux
C:\Program Files\MongoDB\Server\3.2\bin> mongod --dbpath "csram:\custom_folder"
```

- RDBMS 와의 차이점
RDBMS | MongoDB
-|-
Database | Database
Table | Collections
Tuple/Row | Document


### Data Modelling
- 객체들을 함께사용하게 된다면 한 Document에 합쳐서 사용한다. (예: 게시물-덧글 과의 관계)
- 읽을때 join 하는게아니라 데이터를 작성 할 때 join 한다.

## 2. Database/Collection/Document 생성·제거
### Database
```linux
<!--데이터베이스 생성-->
use mongodb_tutorial

<!--현재 사용중인 데이터베이스 확인-->
db

<!--내가만든 데이터베이스 리스트-->
show dbs

<!--데이터베이스 제거-->
use mongodb_tutorial
db.dropDatabase();
```

### Collection
```linux
<!--Collection 생성-->
db.createCollection(name, [options])

<!--document를 추가하면 자동으로 컬렉션생성-->
db.people.insert({"name": "velopert"})

<!--collection 리스트 확인-->
show collections

<!--제거-->
db.people.drop()
```

### Document
```linux
db.COLLECTION_NAME.insert(document)

<!--추가-->
db.books.insert([
    {"name": "Book1", "author": "Velopert"},
    {"name": "Book2", "author": "Velopert"}
]);

<!--확인-->
db.books.find()

<!--제거-->
db.COLLECTION_NAME.remove(criteria, justOne)
db.books.remove({"name": "Book1"})
```

## 3. Document Query(조회) – find() 메소드
```linux
db.COLLECTION_NAME.find(query, projection)
```
- query : Optional(선택적).  다큐먼트를 조회할 때 기준을 정합니다. 기준이 없이 컬렉션에 있는 모든 다큐먼트를 조회 할때는 이 매개변수를 비우거나 비어있는 다큐먼트 { } 를 전달하세요.
- projection : Optional. 다큐먼트를 조회할 때 보여질 field를 정합니다.

## Query
- 비교연산자
    operator | 설명
    -|-
    $eq	| (equals) 주어진 값과 일치하는 값
    $gt	| (greater than) 주어진 값보다 큰 값
    $gte | (greather than or equals) 주어진 값보다 크거나 같은 값
    $lt | (less than) 주어진 값보다 작은 값
    $lte | (less than or equals) 주어진 값보다 작거나 같은 값
    $ne | (not equal) 주어진 값과 일치하지 않는 값
    $in	| 주어진 배열 안에 속하는 값
    $nin | 주어빈 배열 안에 속하지 않는 값

- 논리연산자
    operator | 설명
    -|-
    $or	| 주어진 조건중 하나라도 true 일 때 true
    $and | 주어진 모든 조건이 true 일 때 true
    $not | 주어진 조건이 false 일 때 true
    $nor | 주어진 모든 조건이 false 일때 true

- $regex 연산자
    option | 설명
    -|-
    i |-대소문자 무시
    m |-정규식에서 anchor(^) 를 사용 할 때 값에 \n 이 있다면 무력화
    x |-정규식 안에있는 whitespace를 모두 무시
    s |-dot (.) 사용 할 떄 \n 을 포함해서 매치

- $elemMatch 연산자
    $elemMatch 연산자는 Embedded Documents 배열을 쿼리할때 사용

```linux
db.articles.find().pretty()

<!--likes 값이 30 이하인 Document 조회-->
db.articles.find( { “likes”: { $lte: 30 } } ).pretty()

<!--likes 값이 10보다 크고 30보다 작은 Document 조회-->
db.articles.find( { “likes”: { $gt: 10, $lt: 30 } } ).pretty()

<!--writer 값이 “Velopert” 이고 likes 값이 10 미만인 Document 조회-->
db.articles.find( { $and: [ { “writer”: “Velopert” }, { “likes”: { $lt: 10 } } ] } )

<!--정규식 article0[1-2] 에 일치하는 값이 title 에 있는 Document 조회-->
db.articles.find( { “title” : /article0[1-2]/ } )

<!--$where 연산자를 통하여 javascript expression -->
db.articles.find( { $where: “this.comments.length == 0” } )
```

## Projection
- $slice 연산자
    projector 연산자 중 $slice 연산자는 Embedded Document 배열을 읽을때 limit 설정을 합니다.

- $elemMatch 연산자


```linux
<!--article의 title과 content 만 조회-->
db.articles.find( { } , { “_id”: false, “title”: true, “content”: true } )

<!--title 값이 article03 인 Document 에서 덧글은 하나만 보이게 출력-->
db.articles.find( { “title”: “article03” }, { comments: { $slice: 1 } } )

<!--comments 중 “Charlie” 가 작성한 덧글이 있는 Document 중 제목, 그리고 Charlie의 덧글만 조회-->
db.articles.find(
    {
        "comments": {
            $elemMatch: { "name": "Charlie" }
        }
    },
    {
        "title": true,
        "comments": {
            $elemMatch: { "name": "Charlie" }
        },
        "comments.name": true,
        "comments.message": true
    }
)
```

## 4. find() 메소드 활용 – sort(), limit(), skip()
### sort
- KEY 는 데이터의 field 이름이고, value 의 값은 1 혹은 -1
> db.orders.find().sort( { "amount": 1, "_id": -1 } )

### limit
- 출력할 데이터 갯수를 제한할 때 사용
> db.orders.find().limit(3)

### skip
- 출력 할 데이터의 시작부분을 설정할 때 사용
- 2개의 데이터를 생략하고 그 다음부터 출력
> db.orders.find().skip(2)

### 응용
- order 를 최신순으로 한 페이지당 2개씩 나타냅니다.
```linux
var showPage = function(page){
    return db.orders.find().sort( { "_id": -1 } ).skip((page-1)*2).limit(2);
}
```

## 5. Document 수정 – update() 메소드
- 구조
```linux
db.collection.update(
   <query>,
   <update>,
   {
     upsert: <boolean>,
     multi: <boolean>,
     writeConcern: <document>
   }
)
```

Parameter | Type | 설명
-|-|-
*query | document | 업데이트 할 document의 criteria 를 정합니다. find() 메소드 에서 사용하는 query 와 같습니다.
*update | document | document에 적용할 변동사항입니다.
upsert | boolean | Optional. (기본값: false) 이 값이 true 로 설정되면 query한 document가 없을 경우, 새로운 document를 추가합니다.
multi | boolean | Optional. (기본값: false)  이 값이 true 로 설정되면, 여러개의 document 를 수정합니다.
writeConcern | document | Optional.  wtimeout 등 document 업데이트 할 때 필요한 설정값입니다. 기본 writeConcern을 사용하려면 이 파라미터를 생략하세요. 자세한 내용은 매뉴얼을 참조해주세요.


```linux
<!--특정 field 업데이트 하기-->
db.people.update( { name: "Abet" }, { $set: { age: 20 } } )

<!--document를 replace 하기-->
db.people.update( { name: "Betty" }, { "name": "Betty 2nd", age: 1 })

<!--David document의 score field를 제거한다-->
db.people.update( { name: "David" }, { $unset: { score: 1 } } )

<!--Charlie document의 skills 배열에 "angularjs" 추가-->
db.people.update(
    { name: "Charlie" },
    { $push: { skills: "angularjs" } }
)

<!--Charlie document에서 skills 값의 mongodb 제거-->
db.people.update(
    { name: "Charlie" },
    { $pull: { skills: "mongodb" } }
)
db.people.update(
    { name: "Charlie" },
    { $pull: { skills: { $in: ["angularjs", "java" ] } } }
)

```

## 6. Index 설정
### Index?
- 인덱스를 사용하면 더 적은 횟수의 조회로 원하는 데이터를 찾을 수 있음.
- Index가 있을땐 B-Tree를 만든다.

### 인덱스 생성
```linux
<!--단일-->
db.report.createIndex( { score: 1 } )

<!--복합-->
db.report.createIndex( { age: 1, score: -1} )

<!--email 인덱스에 unique 속성 적용-->
db..userinfo.createIndex( { email: 1 }, { unique: true } )

```

### 인덱스 조회
    db.COLLECTION.getIndexes()

### 인덱스 제거
    db.COLLECTION.dropIndex( { KEY: 1 } )

- 모든 인덱스를 제거 할 땐 dropIndexes()