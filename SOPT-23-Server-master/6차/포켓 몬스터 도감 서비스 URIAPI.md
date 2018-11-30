# 포켓 몬스터 도감 서비스 URI/API



## Pokemon 도감URI

***

### GET (포켓몬 조회)

***

| 메소드 | 경로                    | 짧은 설명   |
| ------ | ----------------------- | ----------- |
| Get    | /pokemons{/pokemonsldx} | 포켓몬 조회 |

##### 요청 헤더

```json
Authorization:  multipart/form-data
```

##### 요청 바디

```json
{
    "pokemonsldx" : "포켓몬 번호",
}
```

##### 응답 바디



##### 포켓몬 조회 성공

```json
{
    "status": 200,
    "message": "포켓몬 조회 성공",
    "data": null
    }
}
```
##### 포켓몬 조회 실패

```json
{
    "status": 404,
    "message": "포켓몬 조회 실패",
    "data": null
}
```

***
### Post(포켓몬 등록)
***

| 메소드 | 경로      | 짧은 설명   |
| ------ | --------- | ----------- |
| Post   | /pokemons | 포켓몬 등록 |

### 요청 헤더

```json
Authorization: multipart/form-data
```

##### 요청 바디

```json
{
    "name" : "포켓몬 이름",
    "type" : "종류",
    "photo" : "사진 객체"
}
```

##### 응답 바디

#### 포켓몬 등록 성공

```json
{
    "status": 201,
    "message": "도감 등록 성공",
    "data": null
    }
}
```
#### 포켓몬 등록 실패

```json
{
    "status": 400,
    "message": "도감 등록 실패",
    "data": null
}
```



#### 포켓몬 등록 실패
```json
{
     "status": 401,
    "message": "인증 실패"
    "data": null
}
```
***
### Put(포켓몬 정보 수정)
***


| 메소드 | 경로                   | 짧은 설명 |
| ------ | ---------------------- | --------- |
| PUT    |/pokemons{/pokemonsldx} | 포켓몬 정보 수정  |

### 요청 헤더

```json
Content-Type: multipart/form-data
Application: token
```

### 요청 바디

```json
{
   	"name" : "포켓몬 이름",
    "type" : "종류",
    "photo" : "사진 객체"
}
```

### 응답 바디

#### 포켓몬 정보 수정 성공

```json
{
    "status": 200,
    "message": "글 수정 성공",
    "data": {
        "name": "꼬북이",
        "type": "거북이",
        "photo": null,

    }
}
```


#### 없는 포켓몬 정보 수정 시도

```json
{
    "status": 404,
    "message": "포켓몬이 존재하지 않습니다.",
    "data": null
}
```

#### 인증 실패

```json
{
    "status": 401,
    "message": "인증 실패",
    "data": null
}
```

#### DB 에러

```json
{
    "status": 600,
    "message": "데이터베이스 에러",
    "data": null
}
```

#### INTERNAL SERVER ERROR

```json
{
    "status": 500,
    "message": "서버 내부 에러",
    "data": null
}
```
------





***
### Delete(포켓몬 삭제)
***
| 메소드 | 경로                    | 짧은 설명 |
| ------ | ----------------------- | --------- |
| DELETE | /pokemons{/pokemonsldx} | 포켓몬 삭제   |



### 요청 헤더

```json
Content-Type: application/json
Application: token
```



### 응답 바디

#### 포켓몬 삭제 성공

```json
{
    "status": 204,
    "message": "포켓몬 삭제 성공",
    "data": null
}
```



#### 없는 포켓몬  삭제 

```json
{
    "status": 404,
    "message": "포켓몬이 존재하지 않습니다.",
    "data": null
}
```

#### 인증 실패

```json
{
    "status": 401,
    "message": "인증 실패",
    "data": null
}
```

#### DB 에러

```json
{
    "status": 600,
    "message": "데이터베이스 에러",
    "data": null
}
```

#### INTERNAL SERVER ERROR

```json
{
    "status": 500,
    "message": "서버 내부 에러",
    "data": null
}
```





***

##### 수진이의 느낀점..

데이터를 설계하는 것은 정말 어렵다.. 과제 끝.. 앱잼 때 열심히 할게요

모든 포켓몬 조회를 만들고 싶었는데,, 요청 바디에 뭘 넣어야 할 지 모르겠어서 못만들었어요

***

